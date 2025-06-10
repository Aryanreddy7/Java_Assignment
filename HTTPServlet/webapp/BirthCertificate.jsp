<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Birth Certificate Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card shadow-sm border-0">
                <div class="card-body">
                    <h4 class="card-title text-center mb-4">Birth Certificate Application</h4>

                    <form action="deathform" method="post">
                        <div class="mb-2">
                            <label for="birthId" class="form-label">Birth ID</label>
                            <input type="text" class="form-control form-control-sm" id="birthId" name="birthId" placeholder="Enter Birth ID">
                        </div>

                        <div class="mb-2">
                            <label for="hospitalName" class="form-label">Hospital Name</label>
                            <select class="form-select form-select-sm" id="hospitalName" name="hospitalName">
                                <option selected disabled>Select Hospital</option>
                                <option>City Hospital</option>
                                <option>District Medical Center</option>
                                <option>St. Mary’s Hospital</option>
                                <option>Government General Hospital</option>
                            </select>
                        </div>

                        <div class="mb-2">
                            <label for="fatherName" class="form-label">Father's Name</label>
                            <input type="text" class="form-control form-control-sm" id="fatherName" name="fatherName" placeholder="Enter father's name">
                        </div>

                        <div class="mb-2">
                            <label for="motherName" class="form-label">Mother's Name</label>
                            <input type="text" class="form-control form-control-sm" id="motherName" name="motherName" placeholder="Enter mother's name">
                        </div>

                        <div class="mb-2">
                            <label for="dateTime" class="form-label">Date and Time of Birth</label>
                            <input type="datetime-local" class="form-control form-control-sm" id="dateTime" name="dateTime">
                        </div>

                        <div class="mb-2">
                            <label for="doctorName" class="form-label">Doctor's Name</label>
                            <input type="text" class="form-control form-control-sm" id="doctorName" name="doctorName" placeholder="Attending doctor name">
                        </div>

                        <div class="mb-2">
                            <label for="nurseName" class="form-label">Nurse's Name</label>
                            <input type="text" class="form-control form-control-sm" id="nurseName" name="nurseName" placeholder="Attending nurse name">
                        </div>

                        <div class="mb-3">
                            <label for="hospitalType" class="form-label">Hospital Type</label>
                            <select class="form-select form-select-sm" id="hospitalType" name="hospitalType">
                                <option selected disabled>Select Type</option>
                                <option>Government</option>
                                <option>Private</option>
                                <option>Charitable Trust</option>
                            </select>
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
