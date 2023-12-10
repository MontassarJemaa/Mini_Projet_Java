/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskmanage;

/**
 *
 * @author ayach
 */
import java.sql.Date;

public class Projet {
    private int idProjet;
    private String categorie;
    private String proprietes;
    private Date dateLimite;
 
    // Constructeur
    public Projet(int idProjet, String categorie, String proprietes, Date dateLimite) {
        this.idProjet = idProjet;
        this.categorie = categorie;
        this.proprietes = proprietes;
        this.dateLimite = dateLimite;
    }
 
    // Getters et Setters
    public int getIdProjet() {
        return idProjet;
    }
 
    public void setIdProjet(int idProjet) {
        this.idProjet = idProjet;
    }
 
    public String getCategorie() {
        return categorie;
    }
 
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
 
    public String getProprietes() {
        return proprietes;
    }

    public void setProprietes(String proprietes) {
        this.proprietes = proprietes;
    }

    public Date getDateLimite() {
        return dateLimite;
    }

    public void setDateLimite(Date dateLimite) {
        this.dateLimite = dateLimite;
    }
}

