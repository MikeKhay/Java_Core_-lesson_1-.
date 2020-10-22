package servlet;

import lombok.SneakyThrows;
import model.User;
import org.apache.log4j.Logger;
import service.UserService;
import service.impl.UserServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Objects;

@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
    private UserService userService;
    private static final Logger logger = Logger.getLogger(LoginServlet.class);

    public LoginServlet()
    {
        userService = new UserServiceImpl();
    }

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    {
        String email = req.getParameter("email");

        User user = userService.readByEmail(email);

        if (!Objects.isNull(user))
        {
            String password = req.getParameter("password");
            if (user.getPassword().equals(password))
            {
                logger.info("User with email : " + email + " was logged in");

                HttpSession session = req.getSession(true);
                session.setAttribute("userName", user.getFirstName());
                session.setAttribute("userEmail", email);

                req.getRequestDispatcher("cabinet.jsp").forward(req, resp);

            } else
            {
                logger.info("Wrong password for user with email : " + email);
                //TODO : create redirection to login.jsp
                //req.getRequestDispatcher("login.jsp").forward(req, resp);
            }
        } else
        {
            logger.info("User with email : " + email + " is not registered. Redirection to registration page.");
            //req.getRequestDispatcher("index.jsp").forward(req, resp);
            //TODO: redirect to registration page
        }
    }
}
