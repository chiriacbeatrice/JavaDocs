package ro.teamnet.zth.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Beatrice.Chiriac on 7/19/2017.
 */
public class HellowWordServletForword extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String atribut=(String)request.getAttribute("testAttribute");


       // response.getWriter().write("Hellow  "+request.getParameter("user")+" "+"from the Forword Servlet!"+atribut);

        response.getWriter().write("Hellow cu include "+request.getParameter("user")+" "+"from the Forword Servlet!"+atribut);





    }

}
