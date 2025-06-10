<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Driving License Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card shadow-sm border-0">
                <div class="card-body">
                    <h4 class="card-title text-center mb-4">Driving License Application</h4>

                    <form action="licenseform" method="post">
                        <div class="mb-2">
                            <label for="name" class="form-label">Name</label>
                            <input type="text" class="form-control form-control-sm" id="name" name="name" placeholder="Full Name">
                        </div>

                        <div class="mb-2">
                            <label for="address" class="form-label">Address</label>
                            <textarea class="form-control form-control-sm" id="address" name="address" rows="2" placeholder="Residential Address"></textarea>
                        </div>

                        <div class="mb-2">
                            <label for="mobile" class="form-label">Mobile Number</label>
                            <input type="tel" class="form-control form-control-sm" id="mobile" name="mobile" placeholder="10-digit mobile number">
                        </div>

                        <div class="mb-2">
                            <label for="date" class="form-label">Applied Date</label>
                            <input type="date" class="form-control form-control-sm" id="date" name="date">
                        </div>

                        <div class="mb-3">
                            <label for="vehicle" class="form-label">Vehicle Type</label>
                            <select class="form-select form-select-sm" id="vehicle" name="vehicleType">
                                <option selected disabled>Select Vehicle Type</option>
                                <option>Two Wheeler</option>
                                <option>Four Wheeler</option>
                                <option>Transport Vehicle</option>
                                <option>Heavy Vehicle</option>
                                <option>Three Wheeler</option>
                            </select>
                        </div>

                        <div class="d-grid">
                            <button type="submit" class="btn btn-primary btn-sm">Submit Application</button>
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
