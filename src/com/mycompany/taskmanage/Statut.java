/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskmanage;

/**
 *
 * @author ayach
 */
public class Statut {
    private int idstatut;
    private String type;
 
    // Constructeur
    public Statut(int idstatut, String type) {
        this.idstatut = idstatut;
        this.type = type;
    }
 
    // Getters et Setters
    public int getIdstatut() {
        return idstatut;
    }
 
    public void setIdstatut(int idstatut) {
        this.idstatut = idstatut;
    }
 
    public String getType() {
        return type;
    }
 
    public void setType(String type) {
        this.type = type;
    }
}
 
