<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info=""%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="icon" href="http://192.168.10.216/jsp_prj/common/favicon.ico"/>
<!--bootstrap 시작-->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<!--bootstrap 끝-->
<link rel="stylesheet" href="http://192.168.10.216/jsp_prj/common/css/main.css" type="text/css" media="all" />
<link rel="stylesheet" href="http://192.168.10.216/jsp_prj/common/css/board.css" type="text/css" media="all" />
<!--jQuery CDN 시작-->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!--jQuery CDN 끝-->
<style type="text/css">
	
</style>
<script type="text/javascript">
	$(function(){
		
	});//ready
</script>
</head>
<body>
<div>
<%
String serverName=request.getServerName();
	String nameTitle="이름";
	String ageTitle="나이";
	if(!serverName.equals("localhost")){
	  nameTitle="name";
	  ageTitle="age";
	}
%>
	<form name="frm" action="forward_flag.jsp">
	<%= nameTitle %> : <input type="text" name="name"/><br/>
	<%= ageTitle %> : <input type="text" name="age"/><br/>
	<input type="submit" value="전송"	 class="btn btn-info btn-sm"/>
	</form>
	<a href="http://localhost/jsp_prj/day0426/forward_a.jsp">local요청</a>
	<a href="http://192.168.10.216/jsp_prj/day0426/forward_a.jsp">외부 ip 요청</a>
	
</div>
</body>
</html>