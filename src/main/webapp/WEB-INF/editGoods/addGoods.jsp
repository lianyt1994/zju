<%@page contentType="text/html; charset=UTF-8" language="java" %>
<!--<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
-->
<html>
<head>
    <title>增加商品表单</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
    <link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap-theme.min.css" rel="stylesheet">
    <script type="text/javascript">
        function uploadPic(pic) {
            var form = pic.form;
            form.action = "/editGoods/uploadPics";
            form.method = "post";
            form.submit();
        }
    </script>
</head>
<body>
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading text-center">
            <h2>欢迎</h2>
        </div>
        <div class="panel-body">
            <form class="form-horizontal" enctype="multipart/form-data" method="post" action="/editGoods/addGoodsSubmit"
                  role="form">
                <div class="form-group">
                    <label class="col-sm-4 control-label text-left">商品id</label>
                    <div class="col-sm-5">
                        <span>${id}</span>
                    </div>
                </div>
                <div class="form-group">
                    <label for="name" class="col-sm-2 control-label">请输入名字</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="name" name="name" placeholder="请输入名字">
                    </div>
                </div>
                <div class="form-group">
                    <label for="packageList" class="col-sm-2 control-label">价格</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="packageList" name="packageList" placeholder="价格">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <div class="checkbox">
                            <label>
                                <c:forEach items="${product.images}" var="pic">
                                    <img src="${pic}" width="150" height="150" name="originalPics"
                                         onclick="this.remove()"/>
                                </c:forEach>
                                <input type="hidden" name="productId" value="${id}">
                                <input type="file" onchange="uploadPic(this)" name="files" multiple="multiple">请选择图片
                            </label>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default" onclick="alert('添加成功！')">确定</button>
                        <a class="btn btn-default" href="/editGoods/editGoods">返回编辑商品</a>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>