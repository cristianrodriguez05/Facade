/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import ConexionBd.*;
import java.sql.SQLException;

/**
 *
 * @author (╯°□°)╯︵ ┻━┻
 */
public class Facade {

    public String nombre;
    public String nick;
    public String vali;
    Conexion conn = new Conexion();

    public Facade() {
        vali = conn.a;
    }

    public void Registrar() {
        conn.registrar(nombre, nick);
        vali = conn.a;
    }

    public void actualizar() {
        conn.actualizar(nombre, nick);
        vali = conn.a;
    }

    public void eliminar() {
        conn.eliminar(nick);
        vali = conn.a;
    }
    public void consulta(){
    conn.consultar(nick);
    vali=conn.a;
    }
}
