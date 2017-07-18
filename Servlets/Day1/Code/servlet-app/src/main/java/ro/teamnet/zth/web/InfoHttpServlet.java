package ro.teamnet.zth.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by Beatrice.Chiriac on 7/18/2017.
 */
public class InfoHttpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        Enumeration<String> enumeration=request.getHeaderNames();

        while (enumeration.hasMoreElements())
        {
            String name=enumeration.nextElement();
            response.getWriter().write(name);

            Enumeration<String> column=request.getHeaders(name);

            while (column.hasMoreElements())
                response.getWriter().write(column.nextElement());
        }
        response.getWriter().write("Method"+request.getMethod());
    }

}
