<%@ page import="java.sql.PreparedStatement" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>

<%@include file="import.jsp"%>

<%
	//seq 가져오기
	String seq = request.getParameter("seq");


	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	String subject = "";
	String writer = "";
	String mail = "";
	String wip = "";
	String wdate = "";
	String hit = "";
	String content = "";


	try {

		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource dataSource = (DataSource) envCtx.lookup("jdbc/mariadb1");


		conn = dataSource.getConnection();

		//조회수 증가
		String sql = "update board1 set hit = hit+1 where seq=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, seq);

		pstmt.executeUpdate();


		//절대 비밀번호를 같이 가져오면 안됨
		sql = "select subject, writer, mail, wip, wdate, hit, content from board1 where seq = ? order by seq desc";

		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, seq);

		rs = pstmt.executeQuery();

		//하나만 가져오면 되니까 if 걸어주기
		if(rs.next()) {
			subject = rs.getString("subject");
			writer = rs.getString("writer");
			mail = rs.getString("mail");
			wip = rs.getString("wip");
			wdate = rs.getString("wdate").replaceAll("-", "/");;
			hit = rs.getString("hit");
			content = rs.getString("content");

		}


	} catch (SQLException e) {
		System.out.println("에러 :"+ e.getMessage());
	} catch (NamingException e) {
		System.out.println("에러 :"+ e.getMessage());
	}
	finally {
		if (pstmt != null) { pstmt.close(); }
		if (conn != null) { conn.close(); }
		if (rs != null) { rs.close(); }
	}

%>


<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../../css/board.css">
</head>

<body>
<!-- 상단 디자인 -->
<div class="con_title">
	<h3>게시판</h3>
	<p>HOME &gt; 게시판 &gt; <strong>게시판</strong></p>
</div>
<div class="con_txt">
	<div class="contents_sub">
		<!--게시판-->
		<div class="board_view">
			<table>
			<tr>
				<th width="10%">제목</th>
				<td width="60%"><%=subject%></td>
				<th width="10%">등록일</th>
				<td width="20%"><%=wdate%></td>
			</tr>
			<tr>
				<th>글쓴이</th>
				<td><%=writer%>(<%=mail%>)(<%=wip%>)</td>
				<th>조회</th>
				<td><%=hit%></td>
			</tr>
			<tr>
				<td colspan="4" height="200" valign="top" style="padding: 20px; line-height: 160%"><%=content%></td>
			</tr>
			</table>
		</div>

		<div class="btn_area">
			<div class="align_left">
				<input type="button" value="목록" class="btn_list btn_txt02" style="cursor: pointer;" onclick="location.href='board_list1.jsp'" />
			</div>
			<div class="align_right">
				<input type="button" value="수정" class="btn_list btn_txt02" style="cursor: pointer;" onclick="location.href='board_modify1.jsp?seq=<%=seq%>'" />
				<input type="button" value="삭제" class="btn_list btn_txt02" style="cursor: pointer;" onclick="location.href='board_delete1.jsp?seq=<%=seq%>'" />
				<input type="button" value="쓰기" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='board_write1.jsp'" />
			</div>
		</div>	
		<!--//게시판-->
	</div>
</div>
<!-- 하단 디자인 -->

</body>
</html>
