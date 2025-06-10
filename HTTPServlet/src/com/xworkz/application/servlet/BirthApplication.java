package com.xworkz.application.servlet;

import com.xworkz.application.dto.BirthDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/birthform", loadOnStartup = 1)
public class BirthApplication extends HttpServlet {
    public BirthApplication() {
        System.out.println("Running no-arg BirthApplication");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String birthId = req.getParameter("birthId");
        String hospitalName = req.getParameter("hospitalName");
        String fatherName = req.getParameter("fatherName");
        String motherName = req.getParameter("motherName");
        String dateTime = req.getParameter("dateTime");
        String doctorName = req.getParameter("doctorName");
        String nurseName = req.getParameter("nurseName");
        String hospitalType = req.getParameter("hospitalType");

        System.out.println("birthId:" + birthId + ", hospital:" + hospitalName + ", father:" + fatherName + ", mother:" + motherName);

        BirthDTO dto = new BirthDTO(birthId, hospitalName, fatherName, motherName, dateTime, doctorName, nurseName, hospitalType);
        req.setAttribute("birthDTO", dto);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/Result");
        dispatcher.forward(req, resp);
    }
}
