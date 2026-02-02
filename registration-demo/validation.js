function validateForm() {

    // Get values
    var fname = document.getElementById("fname").value.trim();
    var lname = document.getElementById("lname").value.trim();
    var email = document.getElementById("email").value.trim();
    var password = document.getElementById("password").value;
    var confirmPassword = document.getElementById("confirmPassword").value;
    var mobile = document.getElementById("mobile").value.trim();

    // Regex patterns
    var firstNameRegex = /^[A-Za-z]{5,20}$/;
    var lastNameRegex = /^[A-Za-z]{1,20}$/;
    var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    var passwordRegex = /^(?=.*[A-Z])(?=.*[a-z])(?=.*\d)(?=.*[@#$%&!]).{8,16}$/;
    var mobileRegex = /^[1-9][0-9]{9}$/;

    // First Name
    if (!firstNameRegex.test(fname)) {
        alert("First Name must contain 5–20 alphabets only");
        return false;
    }

    // Last Name
    if (!lastNameRegex.test(lname)) {
        alert("Last Name must contain alphabets only");
        return false;
    }

    // Email
    if (!emailRegex.test(email)) {
        alert("Please enter a valid email address");
        return false;
    }

    // Password
    if (!passwordRegex.test(password)) {
        alert("Password must be 8–16 characters with uppercase, lowercase, number and special character");
        return false;
    }

    // Confirm Password
    if (password !== confirmPassword) {
        alert("Password and Confirm Password do not match");
        return false;
    }

    // Mobile Number
    if (!mobileRegex.test(mobile)) {
        alert("Mobile number must be exactly 10 digits and not start with 0");
        return false;
    }

    // Success
    alert("Registration successful");
    return true;
}
