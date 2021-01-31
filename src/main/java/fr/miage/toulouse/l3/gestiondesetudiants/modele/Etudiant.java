/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.l3.gestiondesetudiants.modele;

/**
 *
 * @author FatimatouCisse
 */

public class Etudiant {
    private final int id_etudiant;
    private final String prenom_etudiant;
    private final String nom_etudiant;
    private final int id_mention;
    private final int id_parcours;

    /**
     *
     * @param id_etudiant = numéro d'étudiant
     * @param prenom_etudiant = prénom de l'étudiant
     * @param nom_etudiant = nom de l'étudiant
     * @param id_mention = Mention du parcours où est inscrit l'étudiant
     * @param id_parcours = Parcours de la mention concernée
     */
    public Etudiant(int id_etudiant, String prenom_etudiant, String nom_etudiant, int id_mention, int id_parcours) {
        this.id_etudiant = id_etudiant;
        this.prenom_etudiant = prenom_etudiant;
        this.nom_etudiant = nom_etudiant;
        this.id_mention = id_mention;
        this.id_parcours = id_parcours;
    }

    public int getIdEtudiant() {
        return id_etudiant;
    }

    public String getPrenom() {
        return prenom_etudiant;
    }

    public String getNom() {
        return nom_etudiant;
    }

    public int getMention() {
        return id_mention;
    }

    public int getParcours() {
        return id_parcours;
    }
    
    
    
}
