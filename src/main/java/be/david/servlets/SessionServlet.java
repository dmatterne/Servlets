package be.david.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by stannisbaratheon on 24/08/16.
 */
@WebServlet(urlPatterns = "/session.html")
public class SessionServlet  extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession h = req.getSession();

        h.setAttribute("backgroundColor","blue");
        h.setAttribute("myName","David");

        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<meta charset='UTF8' />");
        out.println("<title>My First webpage</title>");



                out.println("<style> body { background-color:" + h.getAttribute("backgroundColor")  + ";} </style>");


        out.println("</head>");
        out.println("<body>");


                out.println("<h1>" + h.getAttribute("myName") + "</h1>");
                out.println("<h2>" + h.getId() + "</h2>");


        out.println("</body>");
        out.println("</html>");

    }
}
