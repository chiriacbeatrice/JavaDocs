package ro.teamnet.zth.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Beatrice.Chiriac on 7/18/2017.
 */
public class ZeroToHeroServlet extends HttpServlet {

    private String handleRequest(HttpServletRequest obj){
        String response="";
        response="Hello "+obj.getParameter("firstName")+" "+obj.getParameter("lastName")+" Enjoy Zero To Hero!!!";

        System.out.println(response);

        return response;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        response.getWriter().write(handleRequest(request));
    }
    }