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
                            const jsonData = JSON.parse(request.responseText.trim());

                            let result = '<table border = "1" cellspacing="0">'
                            for (let i=0; i<jsonData.length; i++) {
                                result += '<tr>';
                                result += '<td>' + jsonData[i].empno + '</td>';
                                result += '<td>' + jsonData[i].ename + '</td>';
                                result += '<td>' + jsonData[i].job + '</td>';
                                result += '<td>' + jsonData[i].mgr + '</td>';
                                result += '<td>' + jsonData[i].hiredate + '</td>';
                                result += '<td>' + jsonData[i].sal + '</td>';
                                result += '<td>' + jsonData[i].comm + '</td>';
                                result += '<td>' + jsonData[i].deptno + '</td>';
                                result += '</tr>';
                            }
                            result += '</table>';


                            document.getElementById('result').innerHTML = result;
                        } else {
                            alert("[에러] 페이지 오류(404, 500)")
                        }
                    }
                }
                request.open("GET", "http://localhost:8080/rest/emp/json", true);
                request.send();
            };

            document.getElementById('btn2').onclick = function () {
                const request = new XMLHttpRequest();
                request.onreadystatechange = function () {
                    if (request.readyState == 4) {
                        if (request.status == 200) {
                            const jsonData = JSON.parse(request.responseText.trim());

                            let result = '<table border = "1" cellspacing="0">'
                            for (let i=0; i<jsonData.length; i++) {
                                result += '<tr>';
                                result += '<td>' + jsonData[i].empno + '</td>';
                                result += '<td>' + jsonData[i].ename + '</td>';
                                result += '<td>' + jsonData[i].job + '</td>';
                                result += '<td>' + jsonData[i].mgr + '</td>';
                                result += '<td>' + jsonData[i].hiredate + '</td>';
                                result += '<td>' + jsonData[i].sal + '</td>';
                                result += '<td>' + jsonData[i].comm + '</td>';
                                result += '<td>' + jsonData[i].deptno + '</td>';
                                result += '</tr>';
                            }
                            result += '</table>';


                            document.getElementById('result').innerHTML = result;
                        } else {
                            alert("[에러] 페이지 오류(404, 500)")
                        }
                    }
                }
                request.open("GET", "http://172.30.1.79:8080/rest/emp/json", true);
                request.send();
            };

            document.getElementById('btn3').onclick = function () {
                const request = new XMLHttpRequest();
                request.onreadystatechange = function () {
                    if (request.readyState == 4) {
                        if (request.status == 200) {
                            const jsonData = JSON.parse(request.responseText.trim());
                            console.log(jsonData);

                            let result = '<table border = "1" cellspacing="0">'
                            for (let i=0; i<jsonData.boxOfficeResult.weeklyBoxOfficeList.length; i++) {
                                    result += '<tr>';
                                    result += '<td>' + jsonData.boxOfficeResult.weeklyBoxOfficeList[i].rnum + '</td>';
                                    result += '<td>' + jsonData.boxOfficeResult.weeklyBoxOfficeList[i].rank + '</td>';
                                    result += '<td>' + jsonData.boxOfficeResult.weeklyBoxOfficeList[i].movieNm + '</td>';
                                    result += '<td>' + jsonData.boxOfficeResult.weeklyBoxOfficeList[i].openDt + '</td>';
                                    result += '</tr>';
                            }
                            result += '</table>';


                            // let result = '<table border = "1" cellspacing="0">'
                            // for (let i=0; i<jsonData.length; i++) {
                            //     result += '<tr>';
                            //     result += '<td>' + jsonData[i].rnum + '</td>';
                            //     result += '<td>' + jsonData[i].rank + '</td>';
                            //     result += '<td>' + jsonData[i].movieNm + '</td>';
                            //     result += '<td>' + jsonData[i].openDt + '</td>';
                            //     result += '</tr>';
                            // }
                            // result += '</table>';


                            document.getElementById('result').innerHTML = result;
                        } else {
                            alert("[에러] 페이지 오류(404, 500)")
                        }
                    }
                }
                request.open("GET", "http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.json?key=96683d574bf5ac1e5b63d50a44a4fb3a&targetDt=20120101", true);
                request.send();
            };
        }
    </script>
</head>
<body>
Ajax02.jsp
<br /> <br />
<input type="button" id = "btn1" value="요청1">
<input type="button" id = "btn2" value="요청2">
<input type="button" id = "btn3" value="영화진흥위원회">
<br /><hr /><hr />
<div id = "result"></div>
</body>
</html>