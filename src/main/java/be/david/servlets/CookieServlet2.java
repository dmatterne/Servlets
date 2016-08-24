package be.david.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

/**
 * Created by stannisbaratheon on 24/08/16.
 */
@WebServlet(urlPatterns = "/cookies2.html")
public class CookieServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();

        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<meta charset='UTF8' />");
        out.println("<title>My First webpage</title>");

        for (Cookie cookie: cookies) {

            if(cookie.getName().equals("backgroundColor")) {

                out.println("<style> body { background-color:" + cookie.getValue() + ";} </style>");
            }
        }

        out.println("</head>");
        out.println("<body>");




        for (Cookie cookie: cookies) {
            if(cookie.getName().equals("myName")) {

                out.println("<h1>" + cookie.getValue() + "</h1>");
            }
        }

        out.println("</body>");
        out.println("</html>");
    }
}
