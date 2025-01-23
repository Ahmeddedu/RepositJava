package Works.HomeWork.HomeWork19;

import Works.HomeWork.HomeWork19.store.PolzStor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {;
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if (login != null && password != null) {
            PolzStor.addUser(login, password);
            request.getSession().setAttribute("userLogin", login);
            request.getSession().setAttribute("userPassword", password);
            response.sendRedirect("article.jsp");
        } else {
            response.sendRedirect("login.jsp");//вот тут из за логин с большой буквы я сайт перезапускал раз 15 mvn tomcat7:run я уже выучил как писать 
        }
    }
}