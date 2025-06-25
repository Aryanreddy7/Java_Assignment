<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Passport Application Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card shadow-sm border-0">
                <div class="card-body">
                    <h4 class="card-title text-center mb-4">Passport Application</h4>
                    <form action="passportform" method="post">
                        <div class="mb-2">
                            <label for="applicantName" class="form-label">Applicant Name</label>
                            <input type="text" class="form-control form-control-sm" id="applicantName" name="applicantName" placeholder="Full Name">
                        </div>

                        <div class="mb-2">
                            <label for="aadhar" class="form-label">Aadhar Number</label>
                            <input type="text" class="form-control form-control-sm" id="aadhar" name="aadhar" placeholder="12-digit Aadhar No">
                        </div>

                        <div class="mb-2">
                            <label for="address" class="form-label">Address</label>
                            <textarea class="form-control form-control-sm" id="address" name="address" rows="2" placeholder="Residential Address"></textarea>
                        </div>

                        <div class="mb-2">
                            <label for="pan" class="form-label">PAN Number</label>
                            <input type="text" class="form-control form-control-sm" id="pan" name="pan" placeholder="e.g., ABCDE1234F">
                        </div>

                        <div class="mb-2">
                            <label for="country" class="form-label">Country</label>
                            <input type="text" class="form-control form-control-sm" id="country" name="country" placeholder="Country Name">
                        </div>

                        <div class="mb-2">
                            <label for="state" class="form-label">State</label>
                            <input type="text" class="form-control form-control-sm" id="state" name="state" placeholder="State Name">
                        </div>

                        <div class="mb-2">
                            <label for="city" class="form-label">City</label>
                            <input type="text" class="form-control form-control-sm" id="city" name="city" placeholder="City Name">
                        </div>

                        <div class="mb-2">
                            <label for="pin" class="form-label">Pin Code</label>
                            <input type="text" class="form-control form-control-sm" id="pin" name="pin" placeholder="e.g., 500001">
                        </div>

                        <div class="mb-2">
                            <label for="passportType" class="form-label">Passport Type</label>
                            <select class="form-select form-select-sm" id="passportType" name="passportType">
                                <option selected disabled>Select Type</option>
                                <option>Ordinary</option>
                                <option>Diplomatic</option>
                                <option>Official</option>
                                <option>Emergency</option>
                            </select>
                        </div>

                        <div class="mb-3">
                            <label for="paymentRef" class="form-label">Payment Reference No</label>
                            <input type="text" class="form-control form-control-sm" id="paymentRef" name="paymentRef" placeholder="Transaction ID / Ref No">
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
