package be.david.servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by stannisbaratheon on 18/08/16.
 */

public class DualServlet extends HttpServlet {

    private int maxSize;

    @Override
    public void init(ServletConfig config) throws ServletException {
        //super.init();
        System.out.println("CREATING SERVLET");
        maxSize = Integer.parseInt(config.getInitParameter("maxSize"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        System.out.println("GET , Size is " + maxSize);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        System.out.println("POST");
    }
}
