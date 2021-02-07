/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.l3.gestiondesetudiants.controller;

import fr.miage.toulouse.l3.gestiondesetudiants.modele.Etudiant;
import fr.miage.toulouse.l3.gestiondesetudiants.view.Accueil;
import fr.miage.toulouse.l3.gestiondesetudiants.view.S_DossierEtudiant;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * controler de la partie de l'application dédiée au directeur d'étude
 * @author SophiaNachin
 */
public class SecretaireController {
    Etudiant e;
    S_DossierEtudiant sde;
    Accueil accueil;
    
    /**
     * On transmet le modèle etudiant, et la vue S_DossierEtudiant 
     * @param e
     * @param accueil
     * @param dse 
     */
    public SecretaireController(Etudiant e, Accueil accueil, S_DossierEtudiant sde){
        this.e = e;
        this.accueil = accueil;
        this.sde = sde;
        initView();
    }
   
    /**
     * Initialisation de la vue à charger
     */
    private void initView(){
        this.sde.getnumEtudiantLabel().setText(String.valueOf(this.e.getIdEtudiant()));
        this.sde.getNomLabel().setText(this.e.getNom());
        this.sde.getPrenomLabel().setText(this.e.getPrenom());
        this.sde.getMentionLabel().setText(String.valueOf(this.e.getMention()));
        this.sde.getParcoursLabel().setText(String.valueOf(this.e.getParcours()));
    }
    
    /**
     * Dès que le bouton DirButton est déclenché, on affiche la nouvelle vue et on ferme l'ancienne
     */
    public void initController(){
        this.accueil.getSecButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                sde.setVisible(true);
                accueil.dispose();
            }
        });
    }
}
