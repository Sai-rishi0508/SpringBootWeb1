<%@page language="java" %>

<html>
   <head>
        <link rel="stylesheet" href="index.css">
   </head>
   <body>
          <!--<h2>Result is:<%=session.getAttribute("result")%></h2>-->
          <!--this particualr line belongs to JSPL(Jsp Standard Library) which helps in accessing data-->
          <!--<h2> Result is: ${result} </h2>-->

          <h1>Welcome To Srg</h1>
          <p>${student}</p>
          <p>Welcome To ${course} World!</p>

   </body>
</html>