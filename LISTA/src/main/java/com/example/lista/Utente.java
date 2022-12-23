package com.example.lista;

public class Utente {

    private int id;
    private String nome;
    private String cognome;
    private int matricola;

    public Utente(int id, String nome, String cognome, int matricola) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    public Utente(String nome, String cognome, int matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }
}
