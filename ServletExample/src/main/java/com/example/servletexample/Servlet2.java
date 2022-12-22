package com.example.servletexample;

import java.io.*;
import java.util.Formatter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


@WebServlet(name = "helloServlet2", value = "/hello-servlet2")
public class Servlet2 extends HttpServlet {

    private String message;

    public void init() {
        message = "Prova!";
    }

    private static final long serialVersionUID=1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String page="prova.jsp";
        String provanome="Jasin";
        request.setAttribute("name", provanome);
        RequestDispatcher view = request.getRequestDispatcher(page);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");


        if (username.equals("Jasin")) {
            response.sendRedirect("navbar.jsp");
        } else {
            request.getRequestDispatcher("prova.jsp").forward(request, response);
        }
    }




}
