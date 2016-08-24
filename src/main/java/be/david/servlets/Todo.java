package be.david.servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by stannisbaratheon on 24/08/16.
 */
@WebServlet(urlPatterns = "/todo.html")
public class Todo extends HttpServlet {


    private static final String MY_TODO_LIST_ATTRIBUTE = "list";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession h = req.getSession();

        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang=' en'>");

        out.println("<head>");
        out.println("<meta charset='UTF-8'/>");
        out.println("<title>Register Personal Website</title>");
        out.println("<script src='jquery-3.1.0.js'></script>");
        out.println("<script src='bootstrap-3.3.7-dist/js/bootstrap.js' > </script >");
        out.println("<link rel='stylesheet' href='bootstrap-3.3.7-dist/css/bootstrap.css'/>");

        out.println("</head>");

        out.println("<body>");
        out.println("<div class='container'>");


        out.println("<form class='form-horizontal' role='form' method='post' action='' >");


        out.println("<fieldset>");
        out.println("<legend>ToDo List</legend>");
        out.println("<div class='form-group'>");

        out.println("<label for='task' class='form-label'>Task :</label>");
        out.println("<input type='text' name='task' class='form-control' />");
        out.println("</div>");

        out.println("<input type='submit' name='submit' value='Submit'  class='btn btn-primary' />");


        out.println("</fieldset>");
        out.println("</form>");


        ArrayList<String> lists = (ArrayList<String>) h.getAttribute(MY_TODO_LIST_ATTRIBUTE);

        if (lists != null) {
            out.println("<ol>");
            for (String task: lists) {

                out.println("<li>");
                out.println(task);
                out.println("</li>");
            }
            out.println("</ol>");

        }

//        ArrayList<String> list = (ArrayList<String>) h.getAttribute("list");


        out.println("</div>");


        out.println("</body>");

        out.println("</html>");


    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession h = req.getSession();


        List<String> list = (List<String>) h.getAttribute(MY_TODO_LIST_ATTRIBUTE);

        if (list == null) {
            list = new ArrayList<>();
            req.getSession().setAttribute(MY_TODO_LIST_ATTRIBUTE, list);
        }

        String item = req.getParameter("task");

        if (!item.trim().isEmpty()) {
            list.add(req.getParameter("task"));
        }


        resp.sendRedirect("/todo.html");


    }
}
