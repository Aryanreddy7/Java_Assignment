<%@ page session="true" %>
<%
String userId = (String) session.getAttribute("userId");
if (userId == null) {
response.sendRedirect("SignIn.jsp");
return;
}
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">UserAuthApp</a>
        <div class="navbar-nav">
            <a class="nav-link" href="logout">Logout</a>
        </div>
    </div>
</nav>
<div class="container mt-4">
    <h2>Welcome, <%= userId %></h2>
    <p>This is your home page after login.</p>
</div>
</body>
</html>