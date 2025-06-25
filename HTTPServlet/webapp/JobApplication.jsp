<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Job Application</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card shadow-sm border-0">
                <div class="card-body">
                    <h4 class="card-title text-center mb-4">Job Application Form</h4>
                    <form action="jobform" method="post">
                        <div class="mb-2">
                            <label for="name" class="form-label">Name</label>
                            <input type="text" class="form-control form-control-sm" id="name" name="name" placeholder="Your name">
                        </div>

                        <div class="mb-2">
                            <label for="email" class="form-label">Email</label>
                            <input type="email" class="form-control form-control-sm" id="email" name="email">
                        </div>

                        <div class="mb-2">
                            <label for="education" class="form-label">Education</label>
                            <select class="form-select form-select-sm" id="education" name="education">
                                <option selected disabled>Select Education</option>
                                <option>B.E</option>
                                <option>Diploma</option>
                                <option>BCA</option>
                                <option>BBA</option>
                                <option>MCA</option>
                            </select>
                        </div>

                        <div class="mb-2">
                            <label for="skills" class="form-label">Skills</label>
                            <input type="text" class="form-control form-control-sm" id="skills" name="skills" placeholder="e.g., HTML, Java">
                        </div>

                        <div class="mb-2">
                            <label for="salary" class="form-label">Expected Salary</label>
                            <input type="text" class="form-control form-control-sm" id="salary" name="salary">
                        </div>

                        <div class="mb-3">
                            <label for="experience" class="form-label">Experience</label>
                            <select class="form-select form-select-sm" id="experience" name="experience">
                                <option selected disabled>Select Experience</option>
                                <option>Fresher</option>
                                <option>1-2 Years</option>
                                <option>3-5 Years</option>
                                <option>5+ Years</option>
                            </select>
                        </div>

                        <div class="d-grid">
                            <button type="submit" class="btn btn-primary btn-sm">Submit</button>
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
