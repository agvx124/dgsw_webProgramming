const onloading = () => {
    const account = window.sessionStorage.getItem("account");

    $.ajax({
        url: `api/cart/user/${account}`,
        contentType: "application/json",
        success: (data) => {
            if (data.length === 0) {
                $('#productDiv').text("장바구니에 상품이 없습니다.");
            } else {
                data.forEach(item => {
                    let pDiv = $("#div");
                    let div = `
                        <div style="min-width: 200px; height: 300px; margin: 10px">
                            <div>
                                <div>
                                    <img src="img/juice.jpg"/>
                                </div>
                                <div>
                                    <div>상품명: ${item.name}</div>
                                </div>
                                <div>
                                    <div>개수: ${item.amount} | 합계: ${item.total}원</div>
                                </div>
                                <div>
                                    <a href="productDetail.html?id=${item.productid}">상품 상세정보 보기</a>
                                </div>
                                <div>
                                    <button style="width: 140px" onclick="deleteItem(${item.id})">삭제</button>
                                </div>
                            </div>
                        </div>
                    `;

                    pDiv.append(div);
                })
            }
        }
    })
};

const deleteItem = (id) => {
    $.ajax({
        url: `api/cart/${id}`,
        contentType: "application/json",
        type: "delete",
        success: () => {
            alert("장바구니 목록에서 삭제했습니다.");
            location.href = "jangbaguni.html"
        }
    })
};

const pay = () => {
    const account = window.sessionStorage.getItem("account");
 
    $.ajax({
        url: `api/cart/user/pay/${account}`,
        success: async(data) => {
            alert("결제 하였습니다.");
            await savePoint(data);
        }
    })
}

const savePoint = async (point) => {
    const account = window.sessionStorage.getItem("account");

    const userPoint = await $.ajax({
        url: `api/user/account/${account}`,
        success: (data) => {
            return data;
        }
    });

    const sumPoint = parseInt(userPoint.point + point);
    console.log(sumPoint);

    $.ajax({
        url: `api/user/point`,
        type: "put",
        contentType: "application/json",
        data: JSON.stringify({
            "account": account,
            "point": sumPoint,
        }),
        success: () => {
            alert(`포인트가 적립되었습니다. 현재 포인트는 ${sumPoint}포인트 입니다.`);
            location.href = "main.html"
        }
    })
}