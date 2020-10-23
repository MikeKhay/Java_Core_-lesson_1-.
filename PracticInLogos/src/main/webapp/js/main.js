console.log("work");

$('.message a').click(function () {
    $('form').animate({
        height: "toggle",
        opacity: "toggle"
    }, "slow");
});

$(document).ready(function () {
    $("button#login").click(function () {
        var email = $("form.login-form input.email").val();
        var password = $("form.login-form input.password").val();
        if(email == '' || password == '') {
            alert("Please fill all fields...!!!");
        } else {
            var userLogin = {
                email: email,
                password: password
            };
            $.post("login", userLogin, function (data){
                if (data == 'Success') {
                    window.location.href = "cabinet.jsp";
                }
                $("form")[0].reset();
            })
        }
    })
})

$(document).ready(function () {
    $("button#logout").click(function () {
        $.post("logout",null, function (){
            if (data == "Success") {
                window.location.href = "/";
            }
            else {
                alert(data);
            }
        })
    })
})