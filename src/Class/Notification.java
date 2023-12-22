/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author ayach
 */
import java.sql.Date;


public class Notification {

    private int idnotif;
    private Date date;
    private int idutilisateur;
    private int idtache;

    // Constructor
    public Notification(int idnotif, Date date, int idutilisateur, int idtache) {
        this.idnotif = idnotif;
        this.date = date;
        this.idutilisateur = idutilisateur;
        this.idtache = idtache;
    }

    // Getters
    public int getIdnotif() {
        return idnotif;
    }

    public Date getDate() {
        return date;
    }

    public int getIdutilisateur() {
        return idutilisateur;
    }

    public int getIdtache() {
        return idtache;
    }

    // Setters
    public void setIdnotif(int idnotif) {
        this.idnotif = idnotif;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setIdutilisateur(int idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public void setIdtache(int idtache) {
        this.idtache = idtache;
    }
}