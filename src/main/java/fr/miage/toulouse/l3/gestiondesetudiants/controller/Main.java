package fr.miage.toulouse.l3.gestiondesetudiants.controller;

import fr.miage.toulouse.l3.gestiondesetudiants.modele.Etudiant;
import fr.miage.toulouse.l3.gestiondesetudiants.view.Accueil;
import fr.miage.toulouse.l3.gestiondesetudiants.view.SecretDossierEtudiant;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Runner object that load the code and start the application
 * @author FatimatouCisse, SophiaNachin
 */
public class Main {
    /**
     * Main starter methode or entry point for the Java program
     * @param args unused
     */
    public static void main (String[] args)
    {      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accueil().setVisible(true);
            }
        });        
    }
}
