var params = {};
    var price;
    const detail = () => {
        window.location.search.replace(/[?&]+([^=&]+)=([^&]*)/gi, (str, key, value) => {
            params[key] = value;
        });

        $.ajax({
            url: `api/product/${params["id"]}`,
            contentType: "application/json",
            success: (data) => {
                price = data.price;
                $('#h2ProductName').text(`상품명: ${data.name}`);
                $('#productPrice').text(`가격: ${data.price}원`);
                $('#description').text(`${data.details}`);
            }
        })
    };

    const put = () => {
        const account = window.sessionStorage.getItem("account");
        const total = price * 1;
        $.ajax({
            url: "api/cart",
            contentType: "application/json",
            type: "post",
            data: JSON.stringify({
                "userId": account,
                "productId": params["id"],
                "price": price,
                "amount": 1,
                "total": total
            }),
            success: () => {
                alert("장바구니에 담겼습니다.");
            }
        })
    };