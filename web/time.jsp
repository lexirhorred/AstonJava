<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Current Time</title>
</head>
<body>
<h1>Current time</h1>
<p>The current time is: <%= request.getAttribute("time")%></p>
</body>
</html>