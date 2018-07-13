<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
 <center>
<h1>Login</h1>
		<form action="/j4/HackU/Process" method="GET">
			<p>
				Name:<input type="text" name="Username" length="40">
			</p>
			<p>
				<input type="radio" name="gender" value="Male" checked />Male <input
					type="radio" name="gender" value="Female" />Female
			</p>

			<p>
				<input type="radio" name="color" value="black" checked />Black <input
					type="radio" name="color" value="blue" />Blue <input type="radio"
					name="color" value="red" />Red
			</p>

			<p>
				<input type="checkbox" name="MiniCar" />MiniCar <input
					type="checkbox" name="Sedan" />Sedan <input type="checkbox"
					name="SUV" />SUV
			<p>
				<input type="submit" name="Login" value="Login">
		</form>

<%! String str=""; %>
<%
HttpSession hs = request.getSession(true);

if (hs.getAttribute("error")!=null){
	if (hs.getAttribute("error").equals(1)){
	str ="Please input name!";
}

else{
	str ="";
}}
%>

<%= str %>
</center>
</body>
</html>