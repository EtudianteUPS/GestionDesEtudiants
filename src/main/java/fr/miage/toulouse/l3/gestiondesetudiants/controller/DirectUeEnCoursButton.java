package fr.miage.toulouse.l3.gestiondesetudiants.controller;

import fr.miage.toulouse.l3.gestiondesetudiants.modele.Etudiant;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.ListeUeCsvModele;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;

/**
 *
 * @author SophiaNachin
 */
public class DirectUeEnCoursButton extends JButton {
    String[] str ={"Code id de l'UE", "Nom UE", "Crédits ECTS"};
    
    public DirectUeEnCoursButton() {
        addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {    
                ListeUeCsvModele.getInstance().setColumnNames(str);
                ListeUeCsvModele.getInstance().setListeUe("donnees/"+Etudiant.getInstance().getNumeroEt()+"_ListeUeEnCours.csv");  
            }
        });
        
        this.setText("UE en cours");
        this.setBackground(new java.awt.Color(255, 122, 50));
        this.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        this.setForeground(new java.awt.Color(255, 255, 255));
        this.setSelected(true);
    }
}
