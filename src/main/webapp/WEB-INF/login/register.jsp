<!--
<%@page contentType="text/html; charset=UTF-8" language="java" %>
-->
<!--
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
-->
<!DOCTYPE html>
<html>
<head>
    <title>注册页面</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
    <link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap-theme.min.css" rel="stylesheet">
    <script src="js/jquery-1.11.3.js"></script>
    <script type="text/javascript">
        function userConfirm() {
            /*var userName1 = document.getElementsByName(userName);*/
            $.get("/login/userConfirm", {userName: document.getElementById('userName').value}, function (data) {
                    if (data.userName != null) {
                        document.getElementById('userName').value = "账号已存在!!!";
                        alert("账号已存在!!!")
                    }
                }
            )
        }
    </script>
</head>
<body>
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading text-center">
            <h2>注册页面</h2>
        </div>
        <div class="panel-body text-center">
            <form id="loginForm" class="form-horizontal text-center" method="post" action=/login/register role="form">
                <div class="form-group text-center">
                    <label for="userName" class="col-sm-4 control-label">账号</label>
                    <div class="col-sm-5">
                        <input type="text" name="userName" onchange="userConfirm()" class="form-control" id="userName"
                               placeholder="账号">
                    </div>
                </div>
                <div class="form-group text-center">
                    <label for="lastname" class="col-sm-4 control-label">密码</label>
                    <div class="col-sm-5">
                        <input type="text" name="passWord" class="form-control" id="lastname" placeholder="密码">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-4 col-sm-5 text-left">
                        <button type="submit" class="btn btn-default" onclick="alert('注册成功！')">注册</button>
                        <c:if test="${result}==false">操作失败</c:if>
                        <a href="/login/login" class="btn btn-default">去登录</a>
                        <a class="btn btn-default" href="/buyGoods/buyGoods" >回首页</a>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<script type="text/javascript">



</script>
<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>