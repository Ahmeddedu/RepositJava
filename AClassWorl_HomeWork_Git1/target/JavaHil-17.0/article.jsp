<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Works.HomeWork.HomeWork19.store.Animal" %>
<html>
<head>
    <title>Добавить жив</title>
</head>
<body>
    <h1>Добавить новое животное</h1>
    <form action="/castle" method="post">
        <label for="name">Имя животного:</label>
        <input type="text" name="name" id="name" required><br><br>

        <label for="desc">Описание:</label>
        <textarea name="desc" id="desc" required></textarea><br><br>

        <button type="submit">Добавить</button>
    </form>
</body>
</html>
