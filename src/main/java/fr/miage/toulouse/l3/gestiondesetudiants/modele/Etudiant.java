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
    String nom;
    String prenom;
    String numeroEt;
    Mention mention;
    Parcours parcours;

    public Etudiant(String n, String p, String numEt, Mention mention, Parcours parcours) {
        nom = n.trim();
        prenom = p.trim();
        numeroEt = numEt.trim();
        this.mention = mention;
        this.parcours = parcours;
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumeroEt() {
        return numeroEt;
    }

    public void setNumeroEt(String numeroEt) {
        this.numeroEt = numeroEt;
    }

    public Mention getMention() {
        return mention;
    }

    public Parcours getParcours() {
        return parcours;
    }
    
    
    
}
