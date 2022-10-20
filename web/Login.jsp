<%-- 
    Document   : Login.jsp
    Created on : 20-Oct-2022, 6:39:05 PM
    Author     : mht19
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
            <!-- Compiled and minified CSS -->
       <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

       <!-- Compiled and minified JavaScript -->
       <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
       
       <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col m4 offset-m4">
                    <div class="card">
                        <div class="card-content">
                            <div class="row">
                               <div class="col m12">
                                   <form action="welcome" method="post">
                                       <div class="row">
                                           <div class="input-field col m12 ">
                                               <i class="material-icons prefix">email</i>
                                               <label for="email_id" class="teal-text darken-2 active">Email</label>
                                               <input type="email" name="email_id" placeholder="Enter your email">
                                           </div>
                                           <div class="input-field col m12 ">
                                               <i class="material-icons prefix">vpn_key</i>
                                               <label for="pass" class="teal-text darken-2 active">Password</label>
                                               <input type="password" name="pass" placeholder="Enter password">
                                           </div>     
                                           <div class="input-field col m8 offset-m4">
                                               <button type="login" class="btn teal centre-aligned ">Login Now</button>
                                           </div>
                                       </div>
                                   </form>
                               </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>