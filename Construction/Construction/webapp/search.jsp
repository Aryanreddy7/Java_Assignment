
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Search Customer</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">

            <div class="card shadow-lg">
                <div class="card-header bg-primary text-white text-center">
                    <h4>Search Customer by ID</h4>
                </div>
                <div class="card-body">
                    <form action="constructionform" method="get">
                        <div class="mb-3">
                            <label for="id" class="form-label">Customer ID</label>
                            <input type="text" class="form-control" id="id" name="id" required>
                        </div>
                        <div class="d-grid">
                            <button type="submit" class="btn btn-primary">Search</button>
                        </div>
                    </form>
                </div>
            </div>

        </div>
    </div>
</div>



</body>
</html>
