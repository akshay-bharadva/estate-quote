<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/css/bootstrap.min.css" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    </head>

    <body>
        <div class="container">
            <div class="mb-3">
                <p>Hello! This is the default welcome page for a Spring Web MVC project.</p>
                <p><i>To display a different welcome page for this project, modify</i>
                    <tt>index.jsp</tt> <i>, or create your own welcome page then change
                        the redirection in</i> <tt>redirect.jsp</tt> <i>to point to the new
                        welcome page and also update the welcome-file setting in</i>
                    <tt>web.xml</tt>.</p>
            </div>
            <a href="home.do?cmdAction=loadHomePage" class="btn btn-primary">Home.do</a>
        </div>
    </body>
</html>
