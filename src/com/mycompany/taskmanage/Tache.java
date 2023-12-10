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

public class Tache {
    private int idTache;
    private String description;
    private Date dateFin;
    private Date dateDebut;
    private String status;
    private String priorite;
 
    // Constructeur
    public Tache(int idTache, String description, Date dateFin, Date dateDebut, String status, String priorite) {
        this.idTache = idTache;
        this.description = description;
        this.dateFin = dateFin;
        this.dateDebut = dateDebut;
        this.status = status;
        this.priorite = priorite;
    }
 
    // Getters et Setters
    public int getIdTache() {
        return idTache;
    }
 
    public void setIdTache(int idTache) {
        this.idTache = idTache;
    }
 
    public String getDescription() {
        return description;
    }
 
    public void setDescription(String description) {
        this.description = description;
    }
 
    public Date getDateFin() {
        return dateFin;
    }
 
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
 
    public Date getDateDebut() {
        return dateDebut;
    }
 
    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }
 
    public String getStatus() {
        return status;
    }
 
    public void setStatus(String status) {
        this.status = status;
    }
 
    public String getPriorite() {
        return priorite;
    }
 
    public void setPriorite(String priorite) {
        this.priorite = priorite;
    }
}
 
