<%@ page import="java.util.ArrayList" %>
<%!
    private static final String MY_TODO_LIST_ATTRIBUTE = ;
%><%
    HttpSession h = request.getSession();

%>
<!DOCTYPE html>
<html lang=' en'>

<head>
    <meta charset='UTF-8'/>
    <title>Register Personal Website</title>
    <script src='jquery-3.1.0.js'></script>
    <script src='bootstrap-3.3.7-dist/js/bootstrap.js'></script>
    <link rel='stylesheet' href='bootstrap-3.3.7-dist/css/bootstrap.css'/>

</head>

<body>
<div class='container'>


    <form class='form-horizontal' role='form' method='post' action=''>


        <fieldset>
            <legend>ToDo List</legend>
            <div class='form-group'>

                <label class='form-label'>Task :</label>
                <input type='text' name='task' class='form-control'/>
            </div>

            <input type='submit' name='submit' value='Submit' class='btn btn-primary'/>


        </fieldset>
    </form>

    <%
        ArrayList<String> lists = (ArrayList<String>) h.getAttribute(MY_TODO_LIST_ATTRIBUTE);

        if (lists != null) {
            out.println("<ol>");
            for (String task : lists) {

                out.println("<li>");
                out.println(task);
                out.println("</li>");
            }
            out.println("</ol>");

        }
    %>
    // ArrayList
    <String> list = (ArrayList
        <String>) h.getAttribute("list");


</div>


</body>

</html>
