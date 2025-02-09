<%@page import="admin.login.AdminVO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="notice.NoticeDAO"%>
<%@page import="notice.NoticeVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info=""%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!--bootstrap시작-->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<!--bootstrap끝-->

<!--jQuery CDN 시작-->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!--jQuery CDN 끝-->

<style type="text/css">

</style>
<%request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="nVO" class="notice.NoticeVO" scope="page"/>
<jsp:setProperty property="*" name="nVO"/>

<script type="text/javascript">
		<%
		String notice_id=request.getParameter("notice_id");
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		System.out.println(request.getParameter("title"));
		System.out.println(request.getParameter("content"));
		try{
		//nVO.setAuthor((NoticeVO)session.getAttribute("adminData")).getAuthor();
		/* AdminVO.setId(((AdminVO)session.getAttribute("loginData")).getId()); */
		/* nVO.setAuthor((NoticeVO)session.getAttribute("loginData")).getAuthor()); */
		/* nVO.setAuthor((AdminVO)session.getAttribute("loginData")).getId()); */
		
		NoticeDAO nDAO=NoticeDAO.getInstance();
		nVO.setNotice_id(notice_id);
		nVO.setTitle(title);
		nVO.setContent(content);
		
		System.out.println(notice_id);
		System.out.println(title);
		System.out.println(content);
		
		nDAO.insertNotice(nVO);
		
		%>
		alert("작성을 완료했습니다.");
		location.href="http://localhost/manage/notice/notice.jsp";
		<%
		}catch(SQLException se){
			se.printStackTrace();
		 %>
		 alert("오류가 발생했습니다.");
		location.href="http://localhost/manage/notice/notice_write.jsp";
		 <% 
		}//end catch
		%>
		$(function(){
			
		});//ready
</script>
</head>
<body>
<div>
	
</div>
</body>
</html>