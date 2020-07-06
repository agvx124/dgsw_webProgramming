const onloading = () => {
    $.ajax({
        url: 'api/product/menu/1',
        contentType: "application/json",
        success: (data) => {
            if (data.length === 0) {
                $('#productDiv').text("판매중인 상품이 없습니다.");
            } else {
                data.forEach(item => {
                    let pDiv = $("#div");
                    let div = `
                        <div style="min-width: 200px; height: 300px; margin: 10px">
                            <div>
                                <img src="img/juice.jpg"/>
                            </div>
                            <div>
                                <div>상품명: ${item.name}</div>
                            </div>
                            <div>
                                <div>${item.price}원</div>
                            </div>
                            <div>
                                <a href="productDetail.html?id=${item.id}">상품 상세정보 보기</a>
                            </div>
                        </div>
                    `;

                    pDiv.append(div);
                })
            }
        }
    })
};