<html>
<head>
    <title>Sign In</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">UserAuthApp</a>
        <div class="navbar-nav">
            <a class="nav-link" href="index.jsp">Home</a>
            <a class="nav-link" href="SignUp.jsp">Sign Up</a>
        </div>
    </div>
</nav>
<div class="container mt-4">
    <h2>Sign In</h2>
    <form action="signin" method="post">
        <div class="mb-3">
            <label>User ID</label>
            <input type="text" name="userId" class="form-control" required>
        </div>
        <div class="mb-3">
            <label>Password</label>
            <input type="password" name="password" class="form-control" required>
        </div>
        <button type="submit" class="btn btn-success">Login</button>
    </form>
</div>
</body>
</html>
