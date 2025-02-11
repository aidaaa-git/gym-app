
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Submit Form</title>
</head>
<body>

<h1>Add New Membership</h1>
<form action="/saveNewMembership" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name">
    <br>
    <label for="price">Price:</label>
    <input type="text" id="price" name="price">
    <br>
    <label for="duration">Duration:</label>
    <input type="text" id="duration" name="duration">
    <br>
    <label for="daysPerWeek">DaysPerWeek:</label>
    <input type="text" id="daysPerWeek" name="daysPerWeek">
    <br>

    <button type="submit">Submit</button>
</form>

</body>