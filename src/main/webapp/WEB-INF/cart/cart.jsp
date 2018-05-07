<%@page contentType="text/html; charset=UTF-8" language="java" %>
<!--<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
-->
<html>
<head>
    <title>购物车列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
    <link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap-theme.min.css" rel="stylesheet">
    <script type="text/javascript">
        var totalMoney = 0;

        //ajax验证是否登录
        $(function () {
            //去判断用户是否登陆  0  1
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
        })

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

        //复选框全选
        function allChoose(choosed) {
            var checkBoxes = document.getElementsByName('each');
            for (var i = 0; i < checkBoxes.length; i++) {
                checkBoxes[i].checked = choosed;
            }
        }


    </script>
</head>
<body>
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading text-center">
            <h2>购物车列表</h2>
        </div>
        <div class="panel-body">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th class="text-center">
                        <input type="checkbox" onchange="totalPrice()" checked="checked" onclick="allChoose(this.checked)"
                                                   name="all"/>
                    </th>
                    <th class="text-center">款项id</th>
                    <th class="text-center">用户名</th>
                    <th class="text-center">商品id</th>
                    <th class="text-center">商品名称</th>
                    <th class="text-center">商品价格</th>
                    <th class="text-center">数量</th>
                </tr>
                </thead>
                <tbody>
                <form action="/cart/deleteItemInCart" method="post" id="deleteForm">
                    <c:forEach items="${carts}" var="product">
                        <tr align="center">
                            <td align="center"><input type="checkbox" checked="checked" name="each"
                                                      onchange="totalPrice()" value="${product.productId}"/></td>
                            <input id="packageList${product.productId}" type="hidden" value="${product.packageList}">
                            <input id="amount${product.productId}" type="hidden" value="${product.amount}">
                            <td align="center">${product.id}</td>
                            <td align="center">${product.user}</td>
                            <td align="center">${product.productId}</td>
                            <td align="center">${product.productName}</td>
                            <td align="center">${product.packageList}</td>
                            <td align="center">${product.amount}</td>
                            <td align="center">
                                <a class="bt-info" href="/cart/addItemInCart?productId=${product.productId}">增加</a>
                                <a class="bt-info" href="/cart/reduceItemInCart?productId=${product.productId}">减少</a>
                            </td>
                        </tr>
                    </c:forEach>
                </form>
                </tbody>
            </table>

        </div>
        <div class="cart-total-2014" align="right">
            <h4 class="total fr">
                总计： <span id="totalSkuPrice" class="totalSkuPrice">totalMoney</span>
            </h4>
        </div>
        <div class="panel-heading text-right">
            <input type="button" class="btn btn-info" onclick="document.getElementById('deleteForm').submit()"
                   value="批量删除"></input>
            <a class="btn btn-info" href="/buyGoods/buyGoods">回首页</a>
            <a class="btn btn-info" href="/orders/orders">提交订单</a>
        </div>
    </div>
</div>

<script type="text/javascript">
    function totalPrice() {
        totalMoney = 0;
        var checkBoxes = document.getElementsByName('each');
        for (var i = 0; i < checkBoxes.length; i++) {
            if (checkBoxes[i].checked == true) {
                var id = checkBoxes[i].value;
                totalMoney = totalMoney + parseInt(document.getElementById("packageList" + id).value) * parseInt(document.getElementById("amount" + id).value);
            }
        }
        document.getElementById('totalSkuPrice').innerHTML = totalMoney.toString();
    }

    window.onload = totalPrice();
</script>
<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>