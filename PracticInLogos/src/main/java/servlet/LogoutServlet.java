package servlet;

import lombok.extern.log4j.Log4j;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

@Log4j
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
}
