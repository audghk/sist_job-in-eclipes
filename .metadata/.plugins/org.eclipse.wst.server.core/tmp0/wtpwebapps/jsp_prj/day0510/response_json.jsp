<%@page import="java.util.Random"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="application/json" 
pageEncoding="UTF-8" trimDirectiveWhitespaces="true" info="JSON응답"%>
<%
/* if(new Random().nextBoolean()){
  throw new Exception("예외가 발생");
} */
JSONObject jsonObj = new JSONObject();
jsonObj.put("name","윤웅찬");
jsonObj.put("age",20);
jsonObj.put("hobby","농구 - 동네넘버원 가드");
%>
ddddㅇㅇㅇㅇ<%= jsonObj.toJSONString()%>