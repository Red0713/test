<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User</title>
</head>
<%
HttpSession hs = request.getSession(true);
String s = (String)hs.getAttribute("Username");

if (hs.getAttribute("gender").equals(0)) {
%>
<body bgcolor=#CAE1FF>
<% }
else {
%>
<body bgcolor=#FFF0F5>
<% } %>

<h2>Cash&yen;15000000</h2>
<form action="/j4/HackU/Process" method="GET">
<input type="submit" name="Logout" value="Logout">
</form>
<center>

<%
int T=new java.util.Date().getHours();

if (T>5&&T<12) {
%>
<h1>Dear <%= s %>, Good Morning!</h1>
<% }
else if(T>=12&&T<18){
%>
<h1>Dear <%= s %>, Good Afternoon!</h1>
<% }
else{
%>
<h1>Dear <%= s %>, Good Evening!</h1>
<% }%>
</center>

<form method="GET">
<input type="submit" name="Show Car List" value="Show Car List">

<input type="submit" name="Show Storage" value="Show Storage">
</form>

<%@ include file="../lesson10ex_htmlpng/CarList.html" %>
</body>
</html>
