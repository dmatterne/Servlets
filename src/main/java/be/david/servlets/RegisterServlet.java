package be.david.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by stannisbaratheon on 18/08/16.
 */
@WebServlet(urlPatterns = "/doRegister")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);

        String firstName = req.getParameter("Voornaam");
        String lastname = req.getParameter("Achternaam");
        String dob = req.getParameter("DateOB");
        Gender gender = Gender.valueOf(req.getParameter("Gender"));
        String country = req.getParameter("country");


        Person p = new Person(firstName,lastname,dob,country,gender);

        resp.sendRedirect("/index.html");


        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<meta charset='UTF8' />");
        out.println("<title>Age webpage</title>");
        out.println("</head>");
        out.println("<body>");

        out.println(p.toString());
        out.println("</body>");
        out.println("</html>");


    }
}
