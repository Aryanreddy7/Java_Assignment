package com.xworkz.application.servlet;

import com.xworkz.application.dto.DeathDTO;
import com.xworkz.application.service.DeathService;
import com.xworkz.application.service.DeathServiceImpl;


import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/deathform", loadOnStartup = 1)
public class DeathApplication extends HttpServlet {
    public DeathApplication() {
        System.out.println("Running no-arg DeathApplication");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String cause = req.getParameter("cause");
        String date = req.getParameter("date");
        String time = req.getParameter("time");
        String age = req.getParameter("age");
        String certifiedBy = req.getParameter("certifiedBy");
        String hospitalName = req.getParameter("hospitalName");
        String mannerOfDeath = req.getParameter("mannerOfDeath");
        String gender = req.getParameter("gender");
        String marks = req.getParameter("marks");
//        int age1=Integer.parseInt(age);

        Thread thread=Thread.currentThread();
        System.out.println(thread);

        System.out.println("Death Record: " + name + ", Age: " + age);

        DeathDTO dto = new DeathDTO(name, cause, date, time, age, certifiedBy, hospitalName, mannerOfDeath, gender, marks);
        req.setAttribute("deathDTO", dto);

        DeathService deathService =new DeathServiceImpl();
        String res=deathService.validateAndSave(dto);
        System.out.println("result:"+res);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/Result");
        dispatcher.forward(req, resp);
    }
}
