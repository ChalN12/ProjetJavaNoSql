<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Appel de programme Java depuis HTML</title>
</head>
<body>
    <h1>Cliquez sur le bouton pour afficher la sortie du programme Java</h1>
    <form action="RunProgram" method="post">
        <input type="submit" value="Exécuter le programme Java">
    </form>
    <div>
        <p>Sortie du programme Java : <%= request.getAttribute("output") %></p>
    </div>
</body>
</html>
