<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info="request 내장객체 사용"%>
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
	ul,ol,li{list-style:none;padding:0px}
	span{font-weight:bold;}
</style>
<script type="text/javascript">
	$(function(){
		
	});//ready
</script>
</head>
<body>
<div>
<%-- <%
	String[] blockIp="212,216,223,229,214,219,227,231".split(",");
	String connIp=request.getRemoteAddr();
	boolean blockFlag=false;
	for(String temp : blockIp){
	  if(connIp.endsWith(temp)){
	    response.sendRedirect("https://www.police.go.kr/index.do");
	    return;
	  }
	}
%> --%>

	<h3>request 내장객체를 사용한 접속자 정보 얻기!!!</h3>
	<ul>
	<li><span>요청방식</span> : <%= request.getMethod() %></li><!-- jsp에서 직접 요청하는 방식 : get -->
	<li><span>요청URL</span> : <%= request.getRequestURL() %></li>
	<li><span>요청Protocol</span> : <%= request.getProtocol() %></li>
	<li><span>요청ServerName</span> : <%= request.getServerName() %></li>
	<li><span>요청ServerPort</span> : <%= request.getServerPort() %></li>
	<li><span>요청URI</span> : <%= request.getRequestURI() %></li>
	<li><span>요청경로</span> : <%= request.getServletPath() %></li>
	<li><span>접속자 IP address</span> : <%= request.getRemoteAddr() %></li>
	<li><span>접속자 PORT</span> : <%= request.getRemotePort() %></li>
	<li><span>QueryString</span> : <%= request.getQueryString() %></li>
	<li><span>web parameter</span> : <%= request.getParameter("name") %></li>
	<li><span>web parameter</span> : <%= request.getParameter("age") %></li>
	<li><span>중복된 이름의 web parameter</span> :
		 <% String[] ages=request.getParameterValues("age");
				if(ages != null){
					for(int i=0; i<ages.length; i++){
					  out.print(ages[i]);
					  out.print("&nbsp;");
					}
				}else{
				  out.println("age라는 이름의 web parameter없음.");
				}
		 %>				
	</li>
	<li>
	<table>
	<tr>
		<th>포로토콜헤더명</th>
		<th>포로토콜헤더값</th>
	</tr>
	<%
		String header="";
		Enumeration<String> headerEnum=request.getHeaderNames();
		while( headerEnum.hasMoreElements()){
		  header=headerEnum.nextElement();
		%>
		<tr>
			<td><%= header %></td>
			<td><%= request.getHeader(header) %></td>
		</tr>
		
		<%
		}
	%>
	</table>
	</li>
	</ul>
	
	<a href="http://192.168.10.216/jsp_prj/day0419/request.jsp?name=정명호&age=25&age=24">다른 서버 요청</a>
	<a href="http://localhost/jsp_prj/day0419/request.jsp?name=정명호&age=25&age=24">localhost요청</a>
	<form method="post" action="request.jsp" enctype="application/x-www-form-urlendcoded">
	<input type="hidden" name="name" value="윤웅찬"/>
	<input type="hidden" name="age" value="28"/>
	<input type="hidden" name="age" value="26"/>
	<input type="submit" value="POST방식요청" class="btn btn-success btn-sm"/>
	</form>
</div>
</body>
</html>





