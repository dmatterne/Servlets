package be.david.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by stannisbaratheon on 24/08/16.
 */
@WebServlet(urlPatterns = "/cookies.html")
public class CookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Cookie c = new Cookie("myName","David");

//        c.setDomain("/bla");

        resp.addCookie(new Cookie("myName","None of your bussiness"));
        resp.addCookie(new Cookie("backgroundColor","red"));


        resp.sendRedirect("cookies2.html");


    }



}
