package com.xworkz.Construction.servlet;


import com.xworkz.Construction.dto.ConstructionDTO;
import com.xworkz.Construction.service.ConstructionService;
import com.xworkz.Construction.service.ConstructionServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.io.IOException;

@WebServlet(urlPatterns = "/constructionform", loadOnStartup = 1)
public class ConstructionApplication extends HttpServlet {

    public ConstructionApplication() {
        System.out.println("Running no-arg ConstructionApplication");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullName = req.getParameter("fullName");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String projectType = req.getParameter("projectType");
        String location = req.getParameter("location");
        String startDate = req.getParameter("startDate");
        String budgetStr = req.getParameter("budget");
        String consentStr = req.getParameter("consent");

        Thread thread = Thread.currentThread();
        System.out.println(thread);

        double budget = 0;
        boolean consent = false;

        try {
            budget = Double.parseDouble(budgetStr);
        } catch (NumberFormatException e) {
            System.err.println("Invalid budget value: " + budgetStr);
        }

        if (consentStr != null) {
            consent = true;
        }

        ConstructionDTO dto = new ConstructionDTO(fullName, email, phone, projectType, location, startDate, budget, consent);
        req.setAttribute("constructionDTO", dto);

        System.out.println(dto);

        ConstructionService constructionService = new ConstructionServiceImpl();
        String result = constructionService.validateAndSave(dto);
        System.out.println("Result: " + result);

        RequestDispatcher dispatcher = req.getRequestDispatcher("Constructions.jsp");
        req.setAttribute("message",result);
        if(!result.equals("Sucessfully Submited")){
            req.setAttribute("dto",dto);
        }
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        int id1=Integer.parseInt(id);

        System.out.println("CoustomerID"+id1);

        ConstructionService constructionService=new ConstructionServiceImpl();
        ConstructionDTO constructionDTO=constructionService.findById(id1);

        if(constructionDTO==null){
            System.out.println("dats is not found");
        }
        else{
            System.out.println("data is found");
        }
    }
}
