/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.l3.gestiondesetudiants.controller;

import fr.miage.toulouse.l3.gestiondesetudiants.view.Accueil;
import fr.miage.toulouse.l3.gestiondesetudiants.view.B_ListeUE;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author SophiaNachin
 */
public class B_ListeUeController {
    B_ListeUE listeUe;
    Accueil accueil;
    
    /**
     * On transmet le modèle etudiant, et la vue D_DossierEtudiant 
     * @param e
     * @param accueil
     * @param dde 
     */
    public B_ListeUeController(Accueil accueil, B_ListeUE listeUe){
        this.accueil = accueil;
        this.listeUe = listeUe;
        initView();
    }
   
    /**
     * Initialisation de la vue à charger
     */
    private void initView(){
        
    }
    
    /**
     * Dès que le bouton DirButton est déclenché, on affiche la nouvelle vue et on ferme l'ancienne
     */
    public void initController(){
        this.accueil.getBurButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                listeUe.setVisible(true);
                accueil.dispose();
            }
        });
    }
}
