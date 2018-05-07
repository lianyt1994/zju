<!--<%@page contentType="text/html; charset=UTF-8" language="java" %>-->
<!--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>-->
<!DOCTYPE html>
<html>
<head>
    <title>登录页面</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
    <link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap-theme.min.css" rel="stylesheet">
   <%-- <script type="text/javascript">
        function register() {
            var form = document.getElementById("loginForm");
            form.action = "/login/register";
            form.method = "post";
            form.submit();
        }
    </script>--%>
</head>
<body>
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading text-center">
            <h2>登录页面</h2>
        </div>
        <div class="panel-body text-center">
            <form id="loginForm" class="form-horizontal text-center" method="post" action="/login/checkLogin" role="form">
                <div class="form-group text-center">
                    <label for="firstname" class="col-sm-4 control-label">账号</label>
                    <div class="col-sm-5">
                        <input type="text" name="userName" class="form-control" id="firstname" placeholder="账号为123">
                    </div>
                </div>
                <div class="form-group text-center">
                    <label for="lastname" class="col-sm-4 control-label">密码</label>
                    <div class="col-sm-5">
                        <input type="text" name="passWord" class="form-control" id="lastname" placeholder="密码为123">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-4 col-sm-5 text-left">
                        <button type="submit" class="btn btn-default">登录</button>
                        <%--<input type="button" onclick="register()" class="col-sm-offset-6 btn btn-default">注册</input>--%>
                        <a class="btn btn-default" href="/login/gotoRegister">去注册</a>
                        <a class="btn btn-default" href="/buyGoods/buyGoods" >回首页</a>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<script type="text/javascript">
    /*document.cookie = "userId=828";
    document.cookie = "userName=hulk";*/
    //获取cookie字符串
    /*var strCookie = document.cookie;
    //将多cookie切割为多个名/值对
    var arrCookie = strCookie.split("; ");
    var userId;
    //遍历cookie数组，处理每个cookie对
    for (var i = 0; i < arrCookie.length; i++) {
        var arr = arrCookie[i].split("=");
        //找到名称为userId的cookie，并返回它的值
        if ("zjuUserName" == arr[0]) {
            userId = arr[1];
            break;
        }
    }
    alert(userId);*/
</script>
<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>