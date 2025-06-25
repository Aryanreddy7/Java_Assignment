<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css" rel="stylesheet">
    <style>
        body {
            background: #f8f9fa;
        }
        .form-container {
            background: white;
            border-radius: 20px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.1);
            padding: 30px;
            max-width: 650px;
            margin: 60px auto;
        }
        .form-title {
            font-weight: 600;
            font-size: 1.8rem;
            color: #0d6efd;
            margin-bottom: 25px;
            text-align: center;
        }
        .form-icon {
            color: #0d6efd;
            margin-right: 10px;
        }
        .btn-custom {
            width: 100%;
            border-radius: 30px;
            font-size: 1.1rem;
            padding: 10px;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="form-container">
        <div class="form-title">Register
        </div>
        <form action="redirecting" method="post">
            <div class="row mb-3">
                <div class="col-md-6">
                    <label class="form-label">Full Name</label>
                    <input type="text" name="fullName" class="form-control" required>
                </div>
                <div class="col-md-6">
                    <label class="form-label">Email </label>
                    <input type="email" name="email" class="form-control" required>
                </div>
            </div>

            <div class="row mb-3">
                <div class="col-md-6">
                    <label class="form-label">Phone Number</label>
                    <input type="tel" name="phone" class="form-control" required>
                </div>
<!--                <div class="col-md-6">-->
<!--                    <label class="form-label">Project Type</label>-->
<!--                    <select name="projectType" class="form-select" required>-->
<!--                        <option value="" disabled selected>Select Type</option>-->
<!--                        <option value="Residential">Residential</option>-->
<!--                        <option value="Commercial">Commercial</option>-->
<!--                        <option value="Renovation">Renovation</option>-->
<!--                    </select>-->
<!--                </div>-->
<!--            </div>-->

            <div class="mb-3">
                <label class="form-label">Location</label>
                <input type="text" name="location" class="form-control" required>
            </div>

<!--            <div class="row mb-3">-->
<!--                <div class="col-md-6">-->
<!--                    <label class="form-label">Preferred Start Date</label>-->
<!--                    <input type="date" name="startDate" class="form-control" required>-->
<!--                </div>-->
<!--                <div class="col-md-6">-->
<!--                    <label class="form-label">Estimated Budget (INR)</label>-->
<!--                    <input type="number" name="budget" class="form-control" required>-->
<!--                </div>-->
<!--            </div>-->

<!--            <div class="form-check mb-4">-->
<!--                <input type="checkbox" name="consent" class="form-check-input" id="consentCheck" required>-->
<!--                <label class="form-check-label" for="consentCheck">I agree to be contacted for further communication.</label>-->
<!--            </div>-->

            <button type="submit" class="btn btn-primary btn-custom">
              Submit Inquiry
            </button>
        </form>
    </div>
</div>

</body>
</html>
