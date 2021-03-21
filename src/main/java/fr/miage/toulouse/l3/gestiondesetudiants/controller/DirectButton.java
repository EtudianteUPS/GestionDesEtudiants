package fr.miage.toulouse.l3.gestiondesetudiants.controller;

import fr.miage.toulouse.l3.gestiondesetudiants.outils.AfficherPanel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;

/**
 *
 * @author SophiaNachin
 */
public class DirectButton extends JButton{
    //private ArrayList<Etudiant> listeEtudiants;
    
    public DirectButton() {
        addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AfficherPanel.getInstance().setPanel(0);
            }
        });
        this.setBackground(new java.awt.Color(255, 122, 50));
        this.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        this.setForeground(new java.awt.Color(255, 255, 255));
        this.setText("Directeur");
        this.setFocusPainted(false);
        this.setPreferredSize(new Dimension(212, 361));
    }
    
    
    /* création vue */
        //JTableEtudiants jte = new JTableEtudiants();
        
        /*création Modele*/
        //Etudiant e1 = new Etudiant(21810700,"Nachin","Sophia",1,1);

        /* Création du controller*/
        //DirectSecretListeEtudiantsController dle = new DirectSecretListeEtudiantsController(this, jte);
        //dle.initController();
        /* Liaison bouton directeur au controller */
        //accueil.getDirButton().addActionListener(ec); /* prend les données du modèle et l'affiche dans la vue */
        
        
}
