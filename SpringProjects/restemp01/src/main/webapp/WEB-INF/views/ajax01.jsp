<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <script type="text/javascript">
        window.onload = function () {
            document.getElementById('btn1').onclick = function () {
                //alert('btn1 클릭');
                //동기식 ajax 연결 : /rest/emp/csv
                const request = new XMLHttpRequest();
                console.log("1");
                request.open("GET", "/rest/emp/csv", false);

                //전송상태 변화에 대한 이벤트
                request.onreadystatechange = function () {
                    console.log('onreadystatuschange' + (request.readyState))
                    console.log('onreadystatuschange' + (request.status))
                }


                console.log("2");
                request.send();
                console.log("3");
                console.log(request.responseText);

                document.getElementById('result').innerHTML = "<b>btn1 클릭</b>"
            };
            document.getElementById('btn2').onclick = function () {
                //alert('btn2 클릭')
                //비동기식 ajax 연결 : /rest/emp/csv
                const request = new XMLHttpRequest();
                console.log("1");
                request.open("GET", "/rest/emp/csv", true);
                console.log("2");
                request.send();
                console.log("3");
                console.log(request.responseText);

            };

            document.getElementById('btn3').onclick = function () {
                const request = new XMLHttpRequest();
                request.onreadystatechange = function () {
                    if (request.readyState == 4) {
                        if (request.status == 200) {
                            //정상처리
                            console.log(request.responseText);

                            //DOM을 활용해서 동적 디자인 표현
                            //데이터 - 테이블로 표현

                            const rowdatas = request.responseText.trim().split('\n');
                            let result = '<table border = "1" cellspacing="0">'
                            for (let i=0; i<rowdatas.length; i++) {
                                let coldatas = rowdatas[i].split(',');
                                result += '<tr>';
                                result += '<td>' + coldatas[0] + '</td>';
                                result += '<td>' + coldatas[1] + '</td>';
                                result += '<td>' + coldatas[2] + '</td>';
                                result += '<td>' + coldatas[3] + '</td>';
                                result += '<td>' + coldatas[4] + '</td>';
                                result += '<td>' + coldatas[5] + '</td>';
                                result += '<td>' + coldatas[6] + '</td>';
                                result += '<td>' + coldatas[7] + '</td>';
                                result += '</tr>';
                            }
                            result += '</table>';

                            document.getElementById('result').innerHTML = result;

                        } else {
                            alert("[에러] 페이지 오류(404, 500)")
                        }
                    }
                }
                request.open("GET", "/rest/emp/csv", true);
                request.send();
                document.getElementById('result').innerHTML = "<b>btn3 클릭</b>"
            };

            document.getElementById('btn4').onclick = function () {
                const request = new XMLHttpRequest();
                request.onreadystatechange = function () {
                    if (request.readyState == 4) {
                        if (request.status == 200) {
                            //정상처리
                            console.log(request.responseText);

                            const jsonData = JSON.parse(request.responseText.trim());
                            //console.log(jsonData);

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
                request.open("GET", "/rest/emp/json", true);
                request.send();
                document.getElementById('result').innerHTML = "<b>btn4 클릭</b>"
            };
        }
    </script>
</head>
<body>
Ajax01.jsp
<br /> <br />
<input type="button" id = "btn1" value="동기식 요청하기">
<input type="button" id = "btn2" value="비동기식 요청하기">
<input type="button" id = "btn3" value="비동기식 요청하기(정리)">
<input type="button" id = "btn4" value="비동기식 요청하기(JSON)">
<br /><hr /><hr />
<div id = "result"></div>
</body>
</html>