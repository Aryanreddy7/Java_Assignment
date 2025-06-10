<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Death Certificate Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card shadow-sm border-0">
                <div class="card-body">
                    <h4 class="card-title text-center mb-4">Death Certificate Application</h4>
                        <form action="deathform" method="post">
                        <div class="mb-2">
                            <label for="name" class="form-label">Name</label>
                            <input type="text" class="form-control form-control-sm" id="name" name="name" placeholder="Full name of deceased">
                        </div>

                        <div class="mb-2">
                            <label for="cause" class="form-label">Cause of Death</label>
                            <input type="text" class="form-control form-control-sm" id="cause" name="cause" placeholder="e.g., Heart Attack, Accident">
                        </div>

                        <div class="mb-2">
                            <label for="date" class="form-label">Date of Death</label>
                            <input type="date" class="form-control form-control-sm" id="date" name="date">
                        </div>

                        <div class="mb-2">
                            <label for="time" class="form-label">Time of Death</label>
                            <input type="time" class="form-control form-control-sm" id="time" name="time">
                        </div>

                        <div class="mb-2">
                            <label for="age" class="form-label">Age at Death</label>
                            <input type="number" class="form-control form-control-sm" id="age" name="age" placeholder="Age in years">
                        </div>

                        <div class="mb-2">
                            <label for="certifiedBy" class="form-label">Certified By</label>
                            <input type="text" class="form-control form-control-sm" id="certifiedBy" name="certifiedBy" placeholder="Doctor/Authority Name">
                        </div>

                        <div class="mb-2">
                            <label for="hospital" class="form-label">Hospital Name</label>
                            <input type="text" class="form-control form-control-sm" id="hospital" name="hospital" placeholder="Where death occurred">
                        </div>

                        <div class="mb-2">
                            <label for="manner" class="form-label">Manner of Death</label>
                            <select class="form-select form-select-sm" id="manner"name="manner">
                                <option selected disabled>Select Manner</option>
                                <option>Natural</option>
                                <option>Accidental</option>
                                <option>Suicide</option>
                                <option>Homicide</option>
                                <option>Undetermined</option>
                            </select>
                        </div>


                        <div class="mb-2">
                            <label for="gender" class="form-label">Gender</label>
                            <select class="form-select form-select-sm" id="gender" name="gender">
                                <option selected disabled>Select Gender</option>
                                <option>Male</option>
                                <option>Female</option>
                                <option>Other</option>
                            </select>
                        </div>


                        <div class="mb-3">
                            <label for="marks" class="form-label">Marks (Identification)</label>
                            <input type="text" class="form-control form-control-sm" id="marks" name="marks" placeholder="Any identifying marks">
                        </div>

                        <div class="d-grid">
                            <button type="submit" class="btn btn-danger btn-sm">Submit Application</button>
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
