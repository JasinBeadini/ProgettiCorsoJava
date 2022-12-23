package com.example.lista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO<statement, Prepared> {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost/users_db";
    private static final String USER = "root";
    private static final String PASS = "password";

    public UserDAO() {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public void insertUser(Utente user) {
        String sql = "INSERT INTO users (nome, cognome, matricola) VALUES (?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, user.getNome());
            statement.setString(2, user.getCognome());
            statement.setInt(3, user.getMatricola());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(Utente user) {
        String sql = "UPDATE users SET nome=?, cognome=?, matricola=? WHERE id=?";
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, user.getNome());
            statement.setString(2, user.getCognome());
            statement.setInt(3, user.getMatricola());
            statement.setInt(4, user.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int id) {
        String sql = "DELETE FROM users WHERE id=?";
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Utente selectUser(int id) {
        String sql = "SELECT * FROM users WHERE id=?";
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                String nome = result.getString("nome");
                String cognome = result.getString("cognome");
                int matricola = result.getInt("matricola");
                return new Utente(id, nome, cognome, matricola);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Object> selectAllUsers() throws SQLException {
        String sql = "SELECT * FROM users";
        List<Object> list = new ArrayList<>();
        try (Connection conn = getConnection()){
             Prepared Statement; PreparedStatement statement = getConnection().prepareStatement(sql);
            {
                ResultSet result = statement.executeQuery();
                while (result.next()) {
                    int id = result.getInt("id");
                    String nome = result.getString("nome");
                    String cognome = result.getString("cognome");
                    int matricola = result.getInt("matricola");
                    Object user = new Utente(id, nome, cognome, matricola);
                    list.add(user);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
