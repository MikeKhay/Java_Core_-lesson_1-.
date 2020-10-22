package servlet;

import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j;
import model.User;
import service.UserService;
import service.impl.UserServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Objects;

@Log4j
@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet
{
    private UserService userService;

    public RegistrationServlet()
    {
        userService = new UserServiceImpl();
    }

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    {
        log.info("Starting user registration.");

        String email = req.getParameter("email");

        if (Objects.isNull(userService.readByEmail(email)))
        {
            log.info("Registration for new user");
            String firstName = req.getParameter("firstName");
            String lastName = req.getParameter("lastName");
            String password = req.getParameter("password");
            String confirmPassword = req.getParameter("confirmPassword");

            if (!email.isEmpty() && !password.isEmpty() && !firstName.isEmpty() && !lastName.isEmpty() && password.equals(confirmPassword))
            {
                User user = new User(email, password, firstName, lastName, "user");
                userService.create(user);
                log.info("User was registered : " + user);

                HttpSession session = req.getSession(true);
                session.setAttribute("userName", firstName);
                session.setAttribute("userEmail", email);

                req.getRequestDispatcher("cabinet.jsp").forward(req, resp);
            }
        } else
        {
            log.info("User with email : " + email + " already registered! Redirection to login page ...");
            //TODO : redirect user on login page if email is already in use
        }
    }
}
