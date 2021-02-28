/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.l3.gestiondesetudiants.controller;

import fr.miage.toulouse.l3.gestiondesetudiants.view.Accueil;
import fr.miage.toulouse.l3.gestiondesetudiants.view.BureauExamenListeUE;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author SophiaNachin
 */
public class BureauExamenListeUeController {
    BureauExamenListeUE listeUe;
    Accueil accueil;
    
    /**
     * On transmet le modèle etudiant, et la vue D_DossierEtudiant 
     * @param e
     * @param accueil
     * @param dde 
     */
    public BureauExamenListeUeController(Accueil accueil, BureauExamenListeUE listeUe){
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
