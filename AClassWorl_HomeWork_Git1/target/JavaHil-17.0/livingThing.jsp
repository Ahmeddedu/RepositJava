<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Works.HomeWork.HomeWork19.store.Animal" %>
<html>
<head>
    <title>Животное</title>
</head>
<body>
    <h1>Животное: <%= ((Animal) request.getAttribute("animal")).getName() %></h1>
    <p>Описание: <%= ((Animal) request.getAttribute("animal")).getDescription() %></p>

    <form action="castle" method="POST">
        <input type="hidden" name="delete" value="<%= ((Animal) request.getAttribute("animal")).getName() %>">
        <button type="submit">Удалить животное</button>
    </form>

    <a href="/castle">Назад в замок</a>
</body>
</html>
