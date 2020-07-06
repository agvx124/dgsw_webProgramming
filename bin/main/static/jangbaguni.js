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