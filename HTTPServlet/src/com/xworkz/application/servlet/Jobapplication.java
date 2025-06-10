package com.xworkz.application.servlet;

import com.xworkz.application.dto.JobDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/jobform",loadOnStartup = 1)

public class Jobapplication extends HttpServlet {
    public Jobapplication(){
        System.out.println("Running no-arg Jobapplication");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String education=req.getParameter("education");
        String skills=req.getParameter("skills");
        String salary = req.getParameter("salary");
        String experience=req.getParameter("experience");
        double sal=Double.parseDouble(salary);

        System.out.println("name:"+name+","+"email:"+email+","+"education:"+education+"skills:"+skills+","+"salary:"+sal+","+"experience"+experience);
        JobDTO jobDTO=new JobDTO(name,email,education,skills,sal,experience);
        req.setAttribute("jobDTO",jobDTO);
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("/Result");
        requestDispatcher.forward(req,resp);
    }
}
