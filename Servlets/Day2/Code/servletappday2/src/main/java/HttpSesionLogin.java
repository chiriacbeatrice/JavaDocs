import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Created by Beatrice.Chiriac on 7/19/2017.
 */
public class HttpSesionLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String user=request.getParameter("username");
        String password=request.getParameter("password");
        HttpSession httpSession=request.getSession();

        Cookie[] cookies=request.getCookies();

        if(user.equals("admin")&& password.equals("admin")){

            response.getWriter().write("Wellcome back "+ user+"!"+"\n"+"Cookies are:"+"\n");
            for(Cookie cook:cookies)

                response.getWriter().write(cook.getName()+":"+cook.getValue()+"\n");
        }
        else{
            httpSession.setAttribute("session", httpSession);
            httpSession.setAttribute("username",user);
            response.sendRedirect("views/loginFail.jsp");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
