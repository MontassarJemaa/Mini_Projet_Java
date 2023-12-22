/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author ayach
 */
public class Employe extends Utilisateur {
    private int idEmploye;
    private String poste;
    private int idTache;

    // Constructor

    public Employe(int idEmploye, String poste, int idTache, int idUtilisateur, String nom, String prenom, String email, String motDePasse, String role) {
        super(idUtilisateur, nom, prenom, email, motDePasse, role);
        this.idEmploye = idEmploye;
        this.poste = poste;
        this.idTache = idTache;
    }
    

    // Getters and Setters for all attributes
    public int getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(int idEmploye) {
        this.idEmploye = idEmploye;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public int getIdTache() {
        return idTache;
    }

    public void setIdTache(int idTache) {
        this.idTache = idTache;
    }

    @Override
    public String toString() {
        return "Employe{" + "idEmploye=" + idEmploye + ", poste=" + poste + ", idTache=" + idTache + '}';
    }
    
}

