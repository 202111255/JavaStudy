<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    // 페이지 자동이동 : redirection
    //response.sendRedirect( "./mariadb/design_simple1/board_list1.jsp" );
%>
<script type="text/javascript">
    // 경고창 출력이 가능
    alert( '확인을 클릭하면 게시판으로 이동합니다.' );
    location.href = './mariadb/design_simple1/board_list1.jsp';
</script>

