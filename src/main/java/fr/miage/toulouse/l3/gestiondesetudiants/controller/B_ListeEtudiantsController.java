/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.l3.gestiondesetudiants.controller;

import fr.miage.toulouse.l3.gestiondesetudiants.view.B_ListeEtudiants;
import fr.miage.toulouse.l3.gestiondesetudiants.view.B_ListeUE;

/**
 *
 * @author FatimatouCisse
 */

public class B_ListeEtudiantsController  {
    B_ListeEtudiants listeEtudiants;
    B_ListeUE listeUe;
        
    /**
     * On transmet le modèle etudiant, et la vue D_DossierEtudiant 
     */
    public B_ListeEtudiantsController(B_ListeUE listeUe, B_ListeEtudiants listeEtudiants ){
       
        this.listeEtudiants = listeEtudiants;
        this.listeUe = listeUe;
        //initView();
    }
    
    /**
     * Initialisation de la vue à charger
     */
    /*private void initView(){
       
        
    }*/
    
    /**
     * Dès que le bouton DirButton est déclenché, on affiche la nouvelle vue et on ferme l'ancienne
     */
    public void initController(){
        this.listeEtudiants.setVisible(true);
        this.listeUe.dispose();
    }
}
