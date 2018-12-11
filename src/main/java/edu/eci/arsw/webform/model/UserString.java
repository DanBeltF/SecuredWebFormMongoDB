/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.webform.model;

import java.util.Date;
import org.springframework.data.annotation.Id;

/**
 *
 * @author 2104784
 */
public class UserString {
    
    @Id
    public String id;

    private String fecha;
    private String texto;

    public UserString() {
    }
    
    public UserString(String fecha, String texto) {
        this.fecha = fecha;
        this.texto = texto;
    }

    public UserString(String texto) {
        this.fecha = new Date().toString();
        this.texto = texto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "UserString{" + "fecha=" + fecha + ", texto=" + texto + '}';
    }
    
    
}
