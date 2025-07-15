package servlet;

import dto.AryanDTO;
import service.AryanService;
import service.AryanServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/redirecting",loadOnStartup = 1)
public class Aryanapplication extends HttpServlet {

    public Aryanapplication(){
        System.out.println("Running no arg const in Aryanapplication");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("aryanform.jsp");
        requestDispatcher.forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullName = req.getParameter("fullName");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String location = req.getParameter("location");



        Thread thread = Thread.currentThread();
        System.out.println(thread);

        AryanDTO aryanDTO=new AryanDTO(fullName, email, phone, location);
        req.setAttribute("Dto",aryanDTO);

        System.out.println(aryanDTO);

        AryanService aryanService=new AryanServiceImpl();
        String result=aryanService.validateandSave(aryanDTO);
        System.out.println("Result: " + result);


    }
}
