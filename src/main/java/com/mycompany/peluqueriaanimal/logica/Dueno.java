/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluqueriaanimal.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Camilo Henao
 */
@Entity
public class Dueno implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_dueno;
    private String nombre;
    private String celDueno;

    public Dueno(int id_dueno, String nombre, String celDueno) {
        this.id_dueno = id_dueno;
        this.nombre = nombre;
        this.celDueno = celDueno;
    }

    public Dueno() {
    }

    public int getId_dueno() {
        return id_dueno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCelDueno() {
        return celDueno;
    }

    public void setId_dueno(int id_dueno) {
        this.id_dueno = id_dueno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCelDueno(String celDueno) {
        this.celDueno = celDueno;
    }
    
    
    
}
