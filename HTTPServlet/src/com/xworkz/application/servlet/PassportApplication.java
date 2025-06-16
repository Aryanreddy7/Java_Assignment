package com.xworkz.application.servlet;

import com.xworkz.application.dto.PassportDTO;
import com.xworkz.application.service.JobService;
import com.xworkz.application.service.JobServiceImpl;
import com.xworkz.application.service.PassportService;
import com.xworkz.application.service.PassportServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/passportform", loadOnStartup = 1)
public class PassportApplication extends HttpServlet {
    public PassportApplication() {
        System.out.println("Running no-arg PassportApplication");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String applicantName = req.getParameter("applicantName");
        String aadharNo = req.getParameter("aadharNo");
        String address = req.getParameter("address");
        String panNo = req.getParameter("panNo");
        String country = req.getParameter("country");
        String state = req.getParameter("state");
        String city = req.getParameter("city");
        String pinCode = req.getParameter("pinCode");
        String passportType = req.getParameter("passportType");
        String paymentReference = req.getParameter("paymentReference");

        Thread thread=Thread.currentThread();
        System.out.println(thread);

        System.out.println("Passport form submitted by: " + applicantName);

        PassportDTO dto = new PassportDTO(applicantName, aadharNo, address, panNo, country, state, city, pinCode, passportType, paymentReference);
        req.setAttribute("passportDTO", dto);

       PassportService passportService =new PassportServiceImpl();
        String res=passportService.validateAndSave(dto);
        System.out.println("result:"+res);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/Result");
        dispatcher.forward(req, resp);
    }
}
