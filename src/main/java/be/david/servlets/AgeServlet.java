package be.david.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

/**
 * Created by stannisbaratheon on 18/08/16.
 */
@WebServlet(urlPatterns = "/age.html")
public class AgeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<meta charset='UTF8' />");
        out.println("<title>Age webpage</title>");
        out.println("</head>");
        out.println("<body>");

        out.println(req.getParameter("name") + "'s age is " + (Integer.parseInt(req.getParameter("age")) +1));
        out.println("</body>");
        out.println("</html>");



        //super.doGet(req, resp);
    }

}
