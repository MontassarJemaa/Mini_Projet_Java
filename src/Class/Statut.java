/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

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

    @Override
    public String toString() {
        return "Statut{" + "idstatut=" + idstatut + ", type=" + type + '}';
    }
    
}
 
