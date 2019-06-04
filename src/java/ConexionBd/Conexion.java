package ConexionBd;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Estudiantes
 */
public class Conexion {

    Connection conex;

    public String a;

    public void conectar() throws ClassNotFoundException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conex = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "jsmz942706");

        } catch (SQLException ex) {

        }
    }

    public void registrar(String nombre, String nick) {

        try {
            conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        String Query = "INSERT INTO "
                + "datos" + " VALUES("
                + "\"" + nombre + "\", "
                + "\"" + nick + "\")";
        try {
            a = " agregado ";
            Statement st;
            st = conex.createStatement();
            st.executeUpdate(Query);

        } catch (SQLException ex) {
            a = "no agregado" + ex;
        }
    }

    public void actualizar(String nombre, String nick) {
        try {
            conectar();
        } catch (ClassNotFoundException ex) {

        }

        String Query = "UPDATE datos SET  nick=" + nick + " WHERE nombre= " + nombre;
        try {
            Statement st;
            st = conex.createStatement();
            st.executeUpdate(Query);
            a = "actualizado";
            conex.close();
        } catch (SQLException ex) {
            a = "no actualizado" + ex;
        }

    }

    public void eliminar(String nick) {
        try {
            conectar();
        } catch (ClassNotFoundException ex) {

        }
        String Query = "DELETE FROM datos WHERE nick = \"" + nick + "\"";
        try {
            Statement st;
            st = conex.createStatement();
            st.executeUpdate(Query);
            conex.close();
            a = "eliminado";
        } catch (SQLException ex) {
            a = "No eliminado" + ex;
        }

    }

    public void consultar(String nick) {
        try {
            conectar();
        } catch (ClassNotFoundException ex) {

        }
        String Query = "SELECT * FROM `datos` WHERE `nick`=\"" + nick + "\"";
        try {

            Statement st;
            st = conex.createStatement();
            ResultSet rSet;
            rSet = st.executeQuery(Query);
            String datos = "";
            String datos1 = "";
            while (rSet.next()) {

                datos = rSet.getString("nick");
                datos1 = rSet.getString("nombre");
            }
            a = "nick: " + datos + " nombre: " + datos1;
        } catch (SQLException ex) {
            a = "no se encontró" + ex;
        }
    }

}
