<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title> Aryan Constructions</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css" rel="stylesheet">
    <style>
        body {
          background-color: #f0f2f5;
        }
        .hero {
          padding: 80px 20px;
          text-align: center;
          background: linear-gradient(to right, #0d6efd, #6610f2);
          color: white;
          border-radius: 0 0 20px 20px;
        }
        .hero h1 {
          font-weight: 700;
          font-size: 2.8rem;
        }
        .hero p {
          font-size: 1.2rem;
        }
        .btn-hero {
          margin-top: 20px;
          padding: 12px 30px;
          font-size: 1.1rem;
          border-radius: 30px;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark shadow-sm">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">
            <i class="bi bi-bricks"></i> Aryan Constructions
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Constructions.jsp">Construction Form</a>
                </li>
<!--                <li class="nav-item">-->
<!--                    <a class="nav-link disabled" href="#">Contact</a>-->
<!--                </li>-->
            </ul>
        </div>
    </div>
</nav>

<!-- Hero Section -->
<section class="hero">
    <div class="container">
        <h1>Build Your Dream Project With Us</h1>
        <p>Fast. Reliable. Professional construction services for residential and commercial needs.</p>
        <a href="Constructions.jsp" class="btn btn-light btn-hero">
            <i class="bi bi-pencil-square"></i> Start Inquiry
        </a>
    </div>
</section>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
