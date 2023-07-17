<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: suran
  Date: 2023/07/13
  Time: 10:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Planner</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/planner.css">
</head>
<body>
<div id="left-window">
    <div class="top">
        <div id="menu">menu icon</div>
        <div id="date">date</div>
    </div>
    <div id="planner">
        <div>
            <form>
                <input type="text" placeholder="mission">
                <button>add</button>
            </form>
        </div>
    </div>
</div>
<div id="right-window">
    <div class="top">
        <div id="clock">10:54</div>
        <div id="timer">timer, stopwatch, etc</div>
    </div>
    <div id="timeTable">
        timetable
    </div>
</div>
</body>
</html>
