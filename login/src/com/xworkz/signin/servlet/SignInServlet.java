package com.xworkz.signin.servlet;

;

import com.xworkz.signin.service.UserService;
import com.xworkz.signin.service.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/signin")
public class SignInServlet extends HttpServlet {
    private UserService service = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");

        if (service.authenticate(userId, password)) {
            HttpSession session = request.getSession();
            session.setAttribute("userId", userId);
            response.sendRedirect("Home.jsp");
        } else {
            response.sendRedirect("SignIn.jsp");
        }
    }
}
