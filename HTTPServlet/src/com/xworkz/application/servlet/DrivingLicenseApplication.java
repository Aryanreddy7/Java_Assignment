package com.xworkz.application.servlet;

import com.xworkz.application.dto.DrivingLicenseDTO;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/licenseform", loadOnStartup = 1)
public class DrivingLicenseApplication extends HttpServlet {
    public DrivingLicenseApplication() {
        System.out.println("Running no-arg DrivingLicenseApplication");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        String mobile = req.getParameter("mobile");
        String appliedDate = req.getParameter("appliedDate");
        String vehicleType = req.getParameter("vehicleType");

        System.out.println("DL Applied by: " + name + ", Vehicle: " + vehicleType);

        DrivingLicenseDTO dto = new DrivingLicenseDTO(name, address, mobile, appliedDate, vehicleType);
        req.setAttribute("licenseDTO", dto);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/Result");
        dispatcher.forward(req, resp);
    }
}
