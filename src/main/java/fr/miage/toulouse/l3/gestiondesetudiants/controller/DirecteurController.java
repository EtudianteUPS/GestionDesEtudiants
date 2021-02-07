/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.l3.gestiondesetudiants.controller;

import fr.miage.toulouse.l3.gestiondesetudiants.modele.Etudiant;
import fr.miage.toulouse.l3.gestiondesetudiants.view.Accueil;
import fr.miage.toulouse.l3.gestiondesetudiants.view.D_DossierEtudiant;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * controler de la partie de l'application dédiée au directeur d'étude
 * @author SophiaNachin
 */
public class DirecteurController  {
    Etudiant e;
    D_DossierEtudiant dde;
    Accueil accueil;
    
    /**
     * On transmet le modèle etudiant, et la vue D_DossierEtudiant 
     * @param e
     * @param accueil
     * @param dde 
     */
    public DirecteurController(Etudiant e, Accueil accueil, D_DossierEtudiant dde){
        this.e = e;
        this.accueil = accueil;
        this.dde = dde;
        initView();
    }
   
    /**
     * Initialisation de la vue à charger
     */
    private void initView(){
        this.dde.getnumEtudiantLabel().setText(String.valueOf(this.e.getIdEtudiant()));
        this.dde.getNomLabel().setText(this.e.getNom());
        this.dde.getPrenomLabel().setText(this.e.getPrenom());
        this.dde.getMentionLabel().setText(String.valueOf(this.e.getMention()));
        this.dde.getParcoursLabel().setText(String.valueOf(this.e.getParcours()));
    }
    
    /**
     * Dès que le bouton DirButton est déclenché, on affiche la nouvelle vue et on ferme l'ancienne
     */
    public void initController(){
        this.accueil.getDirButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                dde.setVisible(true);
                accueil.dispose();
            }
        });
    }
}
