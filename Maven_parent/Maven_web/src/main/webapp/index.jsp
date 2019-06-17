<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="js/jquery-3.2.1.min.js"></script>

    <title>登录</title>

    <script>
        /*$(function () {
            $("#btn").click(function () {
                alert("hello btn");
                $.ajax({
                    // 编写json格式，设置属性和值
                    url:"account/testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"id":"8","name":"ccc","money":400}',
                    dataType:"json",
                    type:"post",
                    success:function(data){
                        // data服务器端响应的json的数据，进行解析
                        alert(data);
                        alert(data.username);
                        alert(data.password);
                        alert(data.age);
                    }
                })
            })

        });*/

        $(function () {
            /*绑定单击事件*/
            $("#btn").click(function () {
                /*发送ajax请求*/
                $.post("account/testAjax",{"id":22,"name":"ccc","money":400},function (data) {
                    // data服务器端响应的json的数据，进行解析
                    alert(data);
                },"json")
            });
        });
    </script>


</head>
<body>

<button id="btn">发送ajax的请求</button>
</body>
</html>
