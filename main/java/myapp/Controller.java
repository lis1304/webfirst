package myapp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Controller extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
        processRequest(req, resp,"doGet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost");
        processRequest(req, resp,"doPost");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPut");
        processRequest(req, resp,"doPut");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doDelete");
        processRequest(req, resp,"doDelete");
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp, String str) throws ServletException,IOException{
        //resp.setContentType("text/html");
        //PrintWriter out = resp.getWriter();
        //out.println(str);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
        requestDispatcher.forward(req,resp);
    }
}

