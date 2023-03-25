<%-- Document : quoteinquiry Created on : 07-Oct-2021, 5:51:21 PM Author : Akshay --%>
    <%@page contentType="text/html" pageEncoding="UTF-8" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>Home Page | Quote Inquiry</title>
            <%@include file="cdns.jsp" %>
                <link rel="stylesheet" href="css/style.css" />
                <script src="js/ajax.js"></script>
        </head>

        <body>
            <div class="container-fluid shadow-sm p-3 mb-3 bg-body rounded">
                <!-- ! NAVIGATION BAR -->
                <%@include file="component/nav.jsp" %>
            </div>
            <div class="container p-2">
                <div id="load"></div>
            </div>
            <!-- ! FOOTER -->
            <%--<%@include file="component/footer.jsp" %>--%>
                <script src="js/validate.js" type="text/javascript"></script>
                <script src="js/validate_date.js" type="text/javascript"></script>
                <script src="js/script.js" type="text/javascript"></script>
        </body>

        </html>