const register = () => {
    const account = document.getElementById("userId").value;
    const password = document.getElementById("password").value;
    const checkP = document.getElementById("checkPassword").value;
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const phone = document.getElementById("phone").value;

    if (password === checkP) {
        $.ajax({
            url: "api/user",
            contentType: "application/json",
            type: "post",
            data: JSON.stringify({
                "account": account,
                "password": password,
                "userName": name,
                "email": email,
                "phone": phone
            }),
            success: () => {
                alert("동혁마켓에 회원이 된걸 환영합니다.");
                window.location.href = "/";
            }
        })
    } else {
        alert("비밀번호가 다릅니다.")
    }
}