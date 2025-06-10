<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Marriage Certificate Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card shadow-sm border-0">
                <div class="card-body">
                    <h4 class="card-title text-center mb-4">Marriage Certificate Application</h4>

                    <form action="marriageform" method="post">
                        <div class="mb-2">
                            <label for="groomName" class="form-label">Groom Name</label>
                            <input type="text" class="form-control form-control-sm" id="groomName" name="groomName" placeholder="Full Name">
                        </div>

                        <div class="mb-2">
                            <label for="brideName" class="form-label">Bride Name</label>
                            <input type="text" class="form-control form-control-sm" id="brideName" name="brideName" placeholder="Full Name">
                        </div>

                        <div class="mb-2">
                            <label for="location" class="form-label">Location</label>
                            <input type="text" class="form-control form-control-sm" id="location" name="location" placeholder="Marriage Location">
                        </div>

                        <div class="mb-2">
                            <label for="address" class="form-label">Address</label>
                            <textarea class="form-control form-control-sm" id="address" name="address" rows="2" placeholder="Address of Ceremony"></textarea>
                        </div>

                        <div class="mb-2">
                            <label for="religion" class="form-label">Religion</label>
                            <input type="text" class="form-control form-control-sm" id="religion" name="religion" placeholder="e.g., Hindu, Christian, Muslim">
                        </div>

                        <div class="mb-2">
                            <label for="date" class="form-label">Marriage Date</label>
                            <input type="date" class="form-control form-control-sm" id="date" name="date">
                        </div>

                        <div class="mb-2">
                            <label for="witness1" class="form-label">Witness 1</label>
                            <input type="text" class="form-control form-control-sm" id="witness1" name="witness1" placeholder="Witness Full Name">
                        </div>

                        <div class="mb-2">
                            <label for="witness2" class="form-label">Witness 2</label>
                            <input type="text" class="form-control form-control-sm" id="witness2" name="witness2" placeholder="Witness Full Name">
                        </div>

                        <div class="mb-3">
                            <label for="officer" class="form-label">Officer Present</label>
                            <input type="text" class="form-control form-control-sm" id="officer" name="officer" placeholder="Registrar/Officer Name">
                        </div>

                        <div class="d-grid">
                            <button type="submit" class="btn btn-success btn-sm">Submit Application</button>
                        </div>
                    </form>

                </div>
            </div>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
