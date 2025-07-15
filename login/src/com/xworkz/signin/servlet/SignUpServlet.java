package com.xworkz.signin.servlet;


import com.xworkz.signin.dto.UserDTO;
import com.xworkz.signin.service.UserService;
import com.xworkz.signin.service.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {
    private UserService service = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");

        if (!password.equals(confirmPassword)) {
            response.sendRedirect("SignUp.jsp");
            return;
        }

        UserDTO user = new UserDTO();
        user.setEmail(email);
        user.setUserId(userId);
        user.setPassword(password);

        if (service.register(user)) {
            response.sendRedirect("SignIn.jsp");
        } else {
            response.sendRedirect("SignUp.jsp");
        }
    }
}

