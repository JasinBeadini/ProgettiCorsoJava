package com.example.servletexample;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet2", value = "/hello-servlet2")
public class Servlet2 extends HttpServlet {

    private static final long serialVersionUID=1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String jspPage="prova.jsp";
        String nome="Jasin";
        request.setAttribute("name", nome);
        RequestDispatcher view = request.getRequestDispatcher(jspPage);
        view.forward(request, response);
    }

    public void destroy() {
    }




}
