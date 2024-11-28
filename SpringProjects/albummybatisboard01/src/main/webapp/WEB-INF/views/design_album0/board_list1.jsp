<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.example.album.dto.AlbumTO" %>
<%@ page import="java.util.ArrayList" %>
<%
	ArrayList<AlbumTO> lists = (ArrayList<AlbumTO>)request.getAttribute( "lists" );

	int totalRecord = lists.size();

	StringBuilder sbHtml = new StringBuilder();

	for( AlbumTO to : lists ) {
		String seq = to.getSeq();
		String subject = to.getSubject();
		String writer = to.getWriter();
		String imagename = to.getImagename();
		String wdate = to.getWdate();
		String hit = to.getHit();
		int wgap = to.getWgap();

		sbHtml.append( "<td width='20%' class='last2'>" );
		sbHtml.append( "<div class='board'>" );
		sbHtml.append( "<table class='boardT'>" );
		sbHtml.append( "<tr>" );
		sbHtml.append( "<td class='boardThumbWrap'>" );
		sbHtml.append( "<div class='boardThumb'>" );
		sbHtml.append( "<a href='view.do?seq=" + seq + "'><img src='./upload/" + imagename + "' border='0' width='100%' /></a>" );
		sbHtml.append( "</div>" );
		sbHtml.append( "</td>" );
		sbHtml.append( "</tr>" );
		sbHtml.append( "<tr>" );
		sbHtml.append( "<td>" );
		sbHtml.append( "<div class='boardItem'>" );
		sbHtml.append( "<strong>" + subject + "</strong>" );
		if ( wgap == 0 ) {
			sbHtml.append( "<img src='./images/icon_new.gif' alt='NEW'>" );
		}
		sbHtml.append( "</div>" );
		sbHtml.append( "</td>" );
		sbHtml.append( "</tr>" );
		sbHtml.append( "<tr>" );
		sbHtml.append( "<td><div class='boardItem'><span class='bold_blue'>" + writer + "</span></div></td>" );
		sbHtml.append( "</tr>" );
		sbHtml.append( "<tr>" );
		sbHtml.append( "<td><div class='boardItem'>" + wdate + " <font>|</font> Hit " + hit + "</div></td>" );
		sbHtml.append( "</tr>" );
		sbHtml.append( "</table>" );
		sbHtml.append( "</div>" );
		sbHtml.append( "</td>" );
	}
%>


<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./css/board_list.css">
<style type="text/css">
<!--
	.board_pagetab { text-align: center; }
	.board_pagetab a { text-decoration: none; font: 12px verdana; color: #000; padding: 0 3px 0 3px; }
	.board_pagetab a:hover { text-decoration: underline; background-color:#f2f2f2; }
	.on a { font-weight: bold; }
-->
</style>
</head>

<body>
<!-- 상단 디자인 -->
<div class="contents1"> 
	<div class="con_title"> 
		<p style="margin: 0px; text-align: right">
			<img style="vertical-align: middle" alt="" src="./images/home_icon.gif" /> &gt; 커뮤니티 &gt; <strong>여행지리뷰</strong>
		</p>
	</div> 
	<div class="contents_sub">	
		<div class="board_top">
			<div class="bold">
				<p>총 <span class="txt_orange"><%=totalRecord%></span>건</p>
			</div>
		</div>	
		
		<!--게시판-->
		<table class="board_list">
		<tr>
<%=sbHtml.toString() %>
		</tr>
		</table>

		<div class="btn_area">
			<div class="align_right">		
				<input type="button" value="쓰기" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='write.do'" />
			</div>
		</div>
		<!--//게시판-->			
  	</div>
</div>
<!--//하단 디자인 -->

</body>
</html>
