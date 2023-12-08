<!DOCTYPEhtml>
<htmlxmlns="http://www.w3.org/1999/xhtml"xmlns:th="https://www.thymeleaf.org"
xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
<title>Login</title>
</head>
<body>
<div if="${param.error}">
Invalid username or password.
</div>
<div if="${param.logout}">
You have been logged out.
</div>
<form action="@{/login}" method="post">
<div><label> User Name :<inputtype="text"name="username"/></label></div>
<div><label> Password: <inputtype="password"name="password"/></label></div>
<div><inputtype="submit"value="Sign In"/></div>
</form>

<a href="/">Return to Main Page</a>
</body>
</html>
