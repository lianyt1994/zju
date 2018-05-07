<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>欢迎页</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
    <link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap-theme.min.css" rel="stylesheet">
    <script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
    <script type="text/javascript">
        $(function () {
            //去判断用户是否登陆
            $.ajax({
                url: "/login/singleLogin",
                type: "post",
                dataType: "json",
                success: function (data) {
                    if (data.result == 1) {
                        $("#login").hide();
                        $("#regist").hide();
                    } else {
                        $("#logout").hide();
                        $("#myOrder").hide();
                    }
                }
            });
            document.getElementById('welcomeId').innerHTML = "欢迎" + getCookie("zjuUserName");
        })

        function addToCart(id) {
            window.location = "/cart/addItem?productId=" + id;
        }

        function checklogin(id, name) {
            //去判断用户是否登陆  0  1
            $.ajax({
                url: "/login/singleLogin",
                type: "post",
                dataType: "json",
                success: function (data) {
                    if (data.result == 1) {
                        window.location = "/cart/addItem?productId=" + id;
                    } else {
                        window.location = "/login/login?returnUrl=" + encodeURIComponent(window.location.href);
                    }
                }
            });
        }

        //设置cookie
        function setCookie(cname, cvalue, exdays) {
            var d = new Date();
            d.setTime(d.getTime() + (exdays * 24 * 60 * 60 * 1000));
            var expires = "expires=" + d.toUTCString();
            document.cookie = cname + "=" + cvalue + "; " + expires;
        }

        //获取cookie
        function getCookie(cname) {
            var name = cname + "=";
            var ca = document.cookie.split(';');
            for (var i = 0; i < ca.length; i++) {
                var c = ca[i];
                while (c.charAt(0) == ' ') c = c.substring(1);
                if (c.indexOf(name) != -1) return c.substring(name.length, c.length);
            }
            return "";
        }

        //清除cookie
        function clearCookie(name) {
            setCookie(name, "", -1);
        }

        function addToCart(productId) {
            var cookieName = "zjuCart" + productId;
            var cookieValue = getCookie(cookieName);
            if (cookieValue == "") {
                document.cookie = cookieName + "=1";
            } else {
                setCookie(cookieName, parseInt(cookieValue) + 1, 7);
            }
        }

    </script>
</head>
<body>
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading text-center">
            <thead>
            <tr>
                <th><a class="btn btn-info btn-lg" href="/seckill/list">秒杀系统</a></th>
                <th><a class="btn btn-info btn-lg" href="/editGoods/editGoods">编辑商品</a></th>
                <th><a class="btn btn-info btn-lg" href="/cart/cart?userName=" +userName>去购物车结算</a></th>
            </tr>
            </thead>
        </div>
        <li class="fore1" id="loginbar" clstag="homepage|keycount|home2013|01b">
            您好！欢迎来到我的电商网站！
            <a href="/login/login?returnUrl=" +encodeURIComponent(window.location.href) onclick="login()" id="login">[登录]</a>&nbsp;
            <a href="/login/gotoRegister" onclick="regist()" id="regist">[免费注册]</a>
            <a href="/login/layout" onclick="logout()" id="logout">[退出]</a>
            <a href="/cart/cart?userName=" +userName id="myOrder">我的购物车</a>
        </li>
        <div class=" text-center">
            <h1><span id="welcomeId">欢迎</span></h1>
        </div>
        <div class="panel-body text-center">
            <table width="100%" class="table table-hover text-center">
                <thead>
                <div class="input-group col-md-12 col-md-offset-3 " positon="relative">
                    <form class="narbar-form " role="search" action="/buyGoods/buyGoods" method="get">
                        <input type="text" class="form-control " style="width:40%" id="insert"
                               name="search" placeholder="search..." value="${search}"/>
                        <button type="submit" class="btn btn-info col-xs-1">搜索</button>
                    </form>
                </div>
                <tr class="text-center">
                    <th class="text-center">商品ID</th>
                    <th class="text-center">商品图片</th>
                    <th class="text-center">商品名称</th>
                    <th id="price" class="text-center">价格</th>
                    <th class="text-center">操作选项</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${pagination.list}" var="product">
                    <tr align="center">
                        <td align="center" id="id${product.id}" class="">${product.id}</td>
                            <%--<td align="center"><img width="40" height="40" src="/images/image${product.id}.jpg"></td>--%>
                        <td align="center">
                            <c:forEach items="${product.images}" var="pic">
                                <img src="${pic}" width="100" height="100" name="originalPics"/>
                            </c:forEach>
                        </td>
                        <td align="center">${product.name}</td>
                        <td align="center">${product.packageList}</td>
                        <td align="center">
                            <input type="button" class="btn btn-default"
                                   onclick="checklogin(${product.id});alert('添加成功！')"
                                   value="加入购物车"/>

                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        <nav style="text-align: center">
            <div class="nav nav-pills">
                <c:forEach items="${pagination.pageView}" var="page">
                    ${page}
                </c:forEach>
            </div>
        </nav>
    </div>
</div>
</body>
</html>
