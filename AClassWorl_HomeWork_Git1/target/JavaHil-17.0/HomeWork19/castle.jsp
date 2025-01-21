<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Map" %>
<html>
<head>
    <title>Замок</title>
</head>
<body>
    <h1>Добро пожаловать в замок!</h1>
    <img src="castle.jpg" alt="Замок" style="width:300px;">
    <h2>Животные в замке:</h2>
    <ul>
        <%
            Map<String, Animal> animals = (Map<String, Animal>) request.getAttribute("animals");
            for (Map.Entry<String, Animal> entry : animals.entrySet()) {
                String name = entry.getKey();
                out.println("<li><a href='/castle?name=" + name + "'>" + name + "</a></li>");
            }
        %>
    </ul>
    <a href="/article.jsp">Добавить животное</a> <!-- изменено с /form.jsp на /article.jsp -->
</body>
</html>
