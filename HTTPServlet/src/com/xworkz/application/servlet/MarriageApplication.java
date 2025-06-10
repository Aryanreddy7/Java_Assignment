package com.xworkz.application.servlet;

import com.xworkz.application.dto.MarriageDTO;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/marriageform", loadOnStartup = 1)
public class MarriageApplication extends HttpServlet {
    public MarriageApplication() {
        System.out.println("Running no-arg MarriageApplication");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String groomName = req.getParameter("groomName");
        String brideName = req.getParameter("brideName");
        String location = req.getParameter("location");
        String address = req.getParameter("address");
        String religion = req.getParameter("religion");
        String date = req.getParameter("date");
        String witness1 = req.getParameter("witness1");
        String witness2 = req.getParameter("witness2");
        String officerPresent = req.getParameter("officerPresent");

        System.out.println("Marriage: " + groomName + " & " + brideName + " on " + date);

        MarriageDTO dto = new MarriageDTO(groomName, brideName, location, address, religion, date, witness1, witness2, officerPresent);
        req.setAttribute("marriageDTO", dto);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/Result");
        dispatcher.forward(req, resp);
    }
}
