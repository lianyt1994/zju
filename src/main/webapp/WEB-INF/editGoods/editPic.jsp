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
    <title>修改图片</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
    <link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap-theme.min.css" rel="stylesheet">
    <script type="text/javascript">
        /*$(function () {
            var tObj;
            $("#tabs a").each(function () {
                if ($(this).attr("class").indexOf("here") == 0) {
                    tObj = $(this)
                }
                $(this).click(function () {
                    var c = $(this).attr("class");
                    if (c.indexOf("here") == 0) {
                        return;
                    }
                    var ref = $(this).attr("ref");
                    var ref_t = tObj.attr("ref");
                    tObj.attr("class", "nor");
                    $(this).attr("class", "here");
                    $(ref_t).hide();
                    $(ref).show();
                    tObj = $(this);
                    if (ref == '#tab_3') {
                        // 编辑器参数
                        var kingEditorParams = {
                            //指定上传文件参数名称
                            filePostName: "uploadFile",
                            //指定上传文件请求的url。
                            uploadJson: '/upload/uploadFck.do',
                            //上传类型，分别为image、flash、media、file
                            dir: "image"//,
// 					width : '1000px',
// 					height : '400px'
                        };
                        KindEditor.create('#productdesc', kingEditorParams);
                        KindEditor.sync();
                    }
                });
            });
        });*/

        //上传图片
        /*function uploadPic() {
            //上传图片 异步的  	Jquery.form.js
            var options = {
                url: "/editGoods/uploadPics",
                type: "post",
                dataType: "json",
                success: function (data) {
                    alert("hello");
                    //多图片回显
                    var html = '<tr>'
                        + '<td width="20%" class="pn-flabel pn-flabel-h"></td>'
                        + '<td width="80%" class="pn-fcontent">';
                    for (var i = 0; i < data.length; i++) {
                        html += '<img width="100" height="100" src="' + data[i] + '" />'
                            + '<input type="hidden" name="imgUrl" value="' + data[i] + '"/>'
                    }
                    html += '<a href="javascript:;" class="pn-opt" onclick="jQuery(this).parents(\'tr\').remove()">删除</a>'
                        + '</td>'
                        + '</tr>';
                    //回显
                    $("#tab_2").append(html);

                }
            }
            document.getElementById('loginForm').ajaxSubmit(options);//jquery.form.js 比较新版本 form
        }*/

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
        <div class="panel-body text-center">
            <form id="loginForm" action="/editGoods/confirmEditGoods" class="form-horizontal text-center" method="post" enctype="multipart/form-data" action="/login/checkLogin"
                  role="form">
                <div class="form-group text-center">
                    <label class="col-sm-4 control-label text-left">商品id</label>
                    <div class="col-sm-5">
                        <span>${product.id}</span>
                    </div>
                </div>
                <div class="form-group text-center">
                    <label class="col-sm-4 control-label">商品名称</label>
                    <div class="col-sm-5">
                        <input type="text" name="name" class="form-control" value="${product.name}">
                    </div>
                </div>
                <div class="form-group text-center">
                    <label class="col-sm-4 control-label">商品价格</label>
                    <div class="col-sm-5">
                        <input type="text" name="packageList" class="form-control" value="${product.packageList}">
                    </div>
                </div>
                <c:forEach items="${product.images}" var="pic">
                    <img src="${pic}" width="150" height="150" name="originalPics" onclick="this.remove()"/>
                </c:forEach>
                <div class="form-group"id="tab_2">
                    <div class="col-sm-offset-4 col-sm-5 text-left">
                        <input type="hidden" name="productId" value="${product.id}">
                        <input type="hidden" name="id" value="${product.id}">
                        <input type="file" onchange="uploadPic(this)" name="files" multiple="multiple">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-4 col-sm-5 text-left">
                        <input type="submit" class="btn btn-default" value="提交"/>
                        <a class="btn btn-default" href="/editGoods/editGoods">回编辑页面</a>
                        <a class="btn btn-default" href="/buyGoods/buyGoods">回首页</a>
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