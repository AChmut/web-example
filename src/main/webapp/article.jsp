<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
    <h2>Article</h2>

   <%= request.getAttribute("id") %>
   <%= request.getAttribute("test") %>
   <%= request.getAttribute("article") %>
</body>
</html>
