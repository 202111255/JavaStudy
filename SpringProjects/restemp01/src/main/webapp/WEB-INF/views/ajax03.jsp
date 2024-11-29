<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <script type="text/javascript">
        window.onload = function () {
            document.getElementById('btn1').onclick = function () {
                const request = new XMLHttpRequest();
                request.onreadystatechange = function () {
                    if (request.readyState == 4) {
                        if (request.status == 200) {
                            console.log(request.responseText);
                        } else {
                            alert("[에러] 페이지 오류(404, 500)")
                        }
                    }
                }
                request.open("GET", "/rest/emp/response/100", true);
                request.send();


            };

            document.getElementById('btn2').onclick = function () {
                const request = new XMLHttpRequest();
                request.onreadystatechange = function () {
                    if (request.readyState == 4) {
                        if (request.status == 200) {
                            console.log(request.responseText);
                        } else {
                            alert("[에러] 페이지 오류(404, 500)")
                        }
                    }
                }
                request.open("POST", "/rest/emp/response", true);
                request.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded')

                request.send('empno=8000&ename=CLARK&job=MANAGER&mgr=7839&hiredate=2011-06-09&sal=2450.00&comm=200&deptno=10');

            };

            document.getElementById('btn3').onclick = function () {
                const request = new XMLHttpRequest();
                request.onreadystatechange = function () {
                    if (request.readyState == 4) {
                        if (request.status == 200) {
                            console.log(request.responseText);
                        } else {
                            alert("[에러] 페이지 오류(404, 500)")
                        }
                    }
                }
                request.open("PUT", "/rest/emp/response/100", true);
                request.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded')
                request.send('data1=value1&data2=value2');
            };

            document.getElementById('btn4').onclick = function () {
                const request = new XMLHttpRequest();
                request.onreadystatechange = function () {
                    if (request.readyState == 4) {
                        if (request.status == 200) {
                            console.log(request.responseText);
                        } else {
                            alert("[에러] 페이지 오류(404, 500)")
                        }
                    }
                }
                request.open("DELETE", "/rest/emp/response/7934", true);
                request.send();
            };

        }
    </script>
</head>
<body>
Ajax02.jsp
<br /> <br />
<input type="button" id = "btn1" value="GET">
<input type="button" id = "btn2" value="POST">
<input type="button" id = "btn3" value="PUT">
<input type="button" id = "btn4" value="DELETE">
<br /><hr /><hr />
<div id = "result"></div>
</body>
</html>