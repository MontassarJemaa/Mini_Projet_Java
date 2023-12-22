/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author ayach
 */
public class Affectation {
     private int id;
    private int id_emp;
    private int id_tache;
    private String commantaire;

    public Affectation(int id, int id_emp, int id_tache, String commantaire) {
        this.id = id;
        this.id_emp = id_emp;
        this.id_tache = id_tache;
        this.commantaire = commantaire;
    }

    public int getId() {
        return id;
    }

    public int getId_emp() {
        return id_emp;
    }

    public int getId_tache() {
        return id_tache;
    }

    public String getCommantaire() {
        return commantaire;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_emp(int id_emp) {
        this.id_emp = id_emp;
    }

    public void setId_tache(int id_tache) {
        this.id_tache = id_tache;
    }

    public void setCommantaire(String commantaire) {
        this.commantaire = commantaire;
    }

    @Override
    public String toString() {
        return "Affectation{" + "id=" + id + ", id_emp=" + id_emp + ", id_tache=" + id_tache + ", commantaire=" + commantaire + '}';
    }
    
    
}
