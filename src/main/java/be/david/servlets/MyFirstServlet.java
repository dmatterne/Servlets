package be.david.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by stannisbaratheon on 17/08/16.
 */
@WebServlet(urlPatterns = "/hello.html")
public class MyFirstServlet extends HttpServlet{


    //GET (select) POST (insert), PUT (update) DELETE OPTIONS HEAD TRACE BREW

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<meta charset='UTF8' />");
        out.println("<title>My First webpage</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h1>" + LocalDateTime.now() +"</h1>" + req.getRemoteAddr());
        out.println("</body>");
        out.println("</html>");

        resp.setHeader("Big Brother", "is watching u");
        //resp.setHeader("Content-Type","text/plain");

        resp.setStatus(307);
        //resp.setHeader("Location","Http://www.google.com");
        resp.sendRedirect("Http://www.google.com");




        //Content-Type: Text/HTML, Text/PLAIN, Image/JPEG, Application/XML, Application/JSON

        String agent = req.getHeader("User-agent");
        if (agent.contains("Mozilla")) {

        }
        //super.doGet(req, resp);
    }
}
