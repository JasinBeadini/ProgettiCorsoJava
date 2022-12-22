package com.example.servletexample;

import java.awt.datatransfer.DataFlavor;
import java.io.*;
import java.util.Formatter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


@WebServlet(name = "helloServlet2", value = "Studente")
public class Studente extends HttpServlet {

    public Studente(String nome, String cognome, int matricola) {
    }


    private static final long serialVersionUID=1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String cognome = request.getParameter("cognome");
        int matricola = Integer.parseInt(request.getParameter("matricola"));

        // Crea un nuovo oggetto Studente
        Studente studente = new Studente(nome, cognome, matricola);
    }
}
