const login = () => {
    const account = document.getElementById("userId").value;
    const password = document.getElementById("password").value;

    $.ajax({
        url: "api/user/login",
        contentType: "application/json",
        type: "post",
        data: JSON.stringify({"account": account, "password": password}),
        success: () => {
            window.sessionStorage.setItem("account", account);
            alert("동혁 마켓을 찾아주셔서 감사합니다.");
            location.href = "main.html";
        }
    })
};