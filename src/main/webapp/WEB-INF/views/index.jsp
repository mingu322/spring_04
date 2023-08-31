<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>index.jsp</h2>
    <a href="/req1">req1</a>
    <a href="/req2?q1=안녕&q2=1234">req2</a>

    <!-- 아래 form에서 입력한 값을 DTO에 담아
        서비스 클래스의 req3() 메서드에서 DTO 값을 출력 -->
        <form action="/req3", method="post">
                    q1: <input type="text" name="q1"> <br>
                    q2: <input type="text" name="q2"> <br>
                    q3: <input type="text" name="q3"> <br>
                    <input type="submit" value="전송">
                </form>

    <a href="/req4">req4</a>

    <a href="/req5">req5</a>
</body>
</html>
