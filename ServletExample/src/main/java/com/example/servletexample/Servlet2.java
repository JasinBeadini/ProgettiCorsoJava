package com.example.servletexample;

import java.io.*;

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
        String ciao="prova.jsp";
        String nome="Jasin";
        request.setAttribute("name", nome);
        RequestDispatcher view = request.getRequestDispatcher(ciao);
        view.forward(request, response);
    }

    public void destroy() {
    }




}
