/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.l3.gestiondesetudiants.controller;

import fr.miage.toulouse.l3.gestiondesetudiants.modele.JTableEtudiants;
import fr.miage.toulouse.l3.gestiondesetudiants.view.Accueil;
import fr.miage.toulouse.l3.gestiondesetudiants.view.D_DossierEtudiant;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;


/**
 *
 * @author FatimatouCisse
 */

public class D_ListeEtudiantsController  {
    Accueil accueil;
    JTableEtudiants listeEtudiants;
    
    /**
     * On transmet le modèle etudiant, et la vue D_DossierEtudiant 
     * @param e
     * @param 
     * @param dde 
     */
    public D_ListeEtudiantsController(Accueil accueil, JTableEtudiants listeEtudiants ){
       
        this.listeEtudiants = listeEtudiants;
        this.accueil = accueil;
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
        this.accueil.getDirButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                listeEtudiants.setVisible(true);
                accueil.dispose();
            }
        });
    }
}
