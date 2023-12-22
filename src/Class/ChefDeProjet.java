/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author ayach
 */
public class ChefDeProjet extends Utilisateur {
    private int idChefDeProjet;

    // Constructor

    public ChefDeProjet(int idChefDeProjet, int idUtilisateur, String nom, String prenom, String email, String motDePasse, String role) {
        super(idUtilisateur, nom, prenom, email, motDePasse, role);
        this.idChefDeProjet = idChefDeProjet;
    }
    

    // Getter and Setter for idChefDeProjet
    public int getIdChefDeProjet() {
        return idChefDeProjet;
    }

    public void setIdChefDeProjet(int idChefDeProjet) {
        this.idChefDeProjet = idChefDeProjet;
    }

    @Override
    public String toString() {
        return "ChefDeProjet{" + "idChefDeProjet=" + idChefDeProjet + '}';
    }
    
}
