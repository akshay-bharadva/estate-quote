<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Welcome to Spring Web MVC project</title>
    <%@include file="cdns.jsp" %>
    <link rel="stylesheet" href="css/style.css" />
  </head>

  <body>
    <div class="container py-4">
      <div class="block">
        <p>
          Hello! This is the default welcome page for a Spring Web MVC project.
        </p>
        <p>
          <i>To display a different welcome page for this project, modify</i>
          <tt>index.jsp</tt>
          <i
            >, or create your own welcome page then change the redirection in</i
          >
          <tt>redirect.jsp</tt>
          <i
            >to point to the new welcome page and also update the welcome-file
            setting in</i
          >
          <tt>web.xml</tt>.
        </p>
      </div>

      <a href="home.fin?cmdAction=loadHomePage" class="btn btn-primary"
        >Quote Home Page</a
      >
    </div>
    <script src="js/script.js" type="text/javascript"></script>
  </body>
</html>
