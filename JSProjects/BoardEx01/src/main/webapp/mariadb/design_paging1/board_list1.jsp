<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="javax.sql.DataSource" %>

<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.NamingException" %>

<%
	// 데이터 갯수
	int size = 0;

	int cpage = 1;
	if(request.getParameter("cpage") != null && !request.getParameter("cpage").equals("")) {
		cpage = Integer.parseInt(request.getParameter("cpage"));
	}

	//페이지당 데이터 개수
	int recordPerPage = 10;

	//전체 페이지 개수
	int totalPage = 1;


	int blockPerPage = 5;


	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

			StringBuilder sbHtml = new StringBuilder();

	try {

		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource dataSource = (DataSource) envCtx.lookup("jdbc/mariadb1");


		conn = dataSource.getConnection();


		//절대 비밀번호를 같이 가져오면 안됨
		String sql = "select seq, subject, writer, wdate, hit from board1 order by seq desc";

		pstmt = conn.prepareStatement(sql);

		rs = pstmt.executeQuery();


		//데이터 갯수를 알아내는 방법
		rs.last();
		size = rs.getRow();
		rs.beforeFirst();

		//읽을 위치로 변경
		int skip = (cpage - 1) * recordPerPage;
		if (skip != 0) rs.absolute(skip); //원하는 위치로 이동해주는 메서드

		//전체 페이지 계산
		totalPage = ((size - 1)/ recordPerPage + 1);



		for (int i = 0; i < recordPerPage && rs.next() ; i++) {
			String seq = rs.getString("seq");
			String subject = rs.getString("subject");
			String writer = rs.getString("writer");
			String wdate = rs.getString("wdate").replaceAll("-", "/");;
			String hit = rs.getString("hit");

			//System.out.println(subject);
			sbHtml.append("<tr>");
			sbHtml.append("<td>&nbsp;</td>");
			sbHtml.append("<td>" + seq + "</td>");
			sbHtml.append("<td class='left'><a href='board_view1.jsp?seq="+seq+"'>" + subject + "</a>&nbsp;<img src='../../images/icon_new.gif' alt='NEW'></td>");
			sbHtml.append("<td>" + writer + "</td>");
			sbHtml.append("<td>" + wdate + "</td>");
			sbHtml.append("<td>" + hit + "</td>");
			sbHtml.append("<td>&nbsp;</td>");
			sbHtml.append("</tr>");
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
		<div class="board_top">
			<div class="bold">총 <span class="txt_orange"><%= size%></span>건</div>
		</div>

		<!--게시판-->
		<div class="board">
			<table>
			<tr>
				<th width="3%">&nbsp;</th>
				<th width="5%">번호</th>
				<th>제목</th>
				<th width="10%">글쓴이</th>
				<th width="17%">등록일</th>
				<th width="5%">조회</th>
				<th width="3%">&nbsp;</th>
			</tr>
<%--			<tr>--%>
<%--				<td>&nbsp;</td>--%>
<%--				<td>1</td>--%>
<%--				<td class="left"><a href="board_view1.jsp">adfas</a>&nbsp;<img src="../../images/icon_new.gif" alt="NEW"></td>--%>
<%--				<td>asdfa</td>--%>
<%--				<td>2017-01-31</td>--%>
<%--				<td>6</td>--%>
<%--				<td>&nbsp;</td>--%>
<%--			</tr>--%>
				<%=sbHtml.toString()%>
			</table>
		</div>	

		<div class="btn_area">
			<div class="align_right">
				<input type="button" value="쓰기" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='board_write1.jsp'" />
			</div>
		</div>
		<!--//게시판-->
		<!--페이지넘버-->
		<div class="paginate_regular">
			<div align="absmiddle">
				<%
					int startBlock = cpage - (cpage-1) % blockPerPage;
					int endBlock = cpage - (cpage-1) % blockPerPage + blockPerPage - 1;
					if (endBlock >= totalPage) {
						endBlock = totalPage;
					}
				%>
				<%
					if (cpage - 5 >= 1) {
						out.println("<span><a href='board_list1.jsp?cpage=" + (cpage - 5) + "'>&lt;&lt;</a></span>");
					} else {
						out.println("<span><a href='board_list1.jsp?cpage=" + 1 + "'>&lt;&lt;</a></span>");
					}
				%>
				&nbsp;
				<%
					if (cpage == 1) {
						out.println("<span><a>&lt;</a></span>");
					} else {
						out.println("<span><a href='board_list1.jsp?cpage=" + (cpage - 1) + "'>&lt;</a></span>");
					}
				%>
<%--				<span><a>&lt;</a></span>--%>
				&nbsp;&nbsp;
				<%
					for (int i = startBlock; i<=endBlock; i++) {
						if (i == cpage) {
							out.println("<span><a>["+i+"]</a></span>");
						} else {
							out.println("<span><a href='board_list1.jsp?cpage=" + i + "'>"+i+"</a></span>");
						}
					}
				%>
<%--				<span><a>[ 1 ]</a></span>--%>
<%--				<span><a href="board_list1.jsp">2</a></span>--%>
<%--				<span><a href="board_list1.jsp">3</a></span>--%>
				&nbsp;&nbsp;
<%--				<span><a>&gt;</a></span>--%>
				<%
					if (cpage < totalPage) {
						out.println("<span><a href='board_list1.jsp?cpage=" + (cpage + 1) + "'>&gt;</a></span>");
					} else {
						out.println("<span><a>&gt;</a></span>");
					}
				%>
				&nbsp;
				<%
					if (cpage + 5 <= totalPage) {
						out.println("<span><a href='board_list1.jsp?cpage=" + (cpage + 5) + "'>&gt;&gt;</a></span>");
					} else {
						out.println("<span><a href='board_list1.jsp?cpage=" + totalPage + "'>&gt;&gt;</a></span>");
					}
				%>
			</div>
		</div>
		<!--//페이지넘버-->
	</div>
</div>
<!--//하단 디자인 -->

</body>
</html>
