/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.l3.gestiondesetudiants.view;

/**
 *
 * @author FatimatouCisse
 */
public class Main {
    public static void main (String[] args)
    {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accueil().setVisible(true);
            }
        });
        
        //DS_ListeEtudiants listeEtudiants = new DS_ListeEtudiants();
        DS_DossierEtudiant dossierEtudiants = new DS_DossierEtudiant();
         
    }
}
