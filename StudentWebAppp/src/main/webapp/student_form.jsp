<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>StudentForm</title>
</head>
<body>
<div style="border:1px solid black;padding:20px;width:fit-content;border-radius:10px;background-color:#d9d9df;">
<h1>Student Form</h1>
<form>
<label for="first_name">First Name</label>
            <input type="text" id="first_name" name="first_name"><br><br>

            <label for="last_name">Last Name</label>
            <input type="text" id="last_name" name="last_name"><br><br>

            <label for="address">Address</label>
            <input type="text" id="address" name="address"><br><br>

            <label for="gender">Gender</label>
            <select id="gender" name="gender">
                <option value="male">Male</option>
                <option value="female">Female</option>
                <option value="other">Other</option>
            </select><br><br>

            <label for="contact">Contact Number</label>
            <input type="tel" id="contact" name="contact" pattern="[0-9]{10}" placeholder="9841554532"><br><br>

            <button type="submit">Submit</button>
</form>
</div>
</body>
</html>