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
public class DirectUeValiderButton extends JButton {
    String[] str ={"Code id de l'UE", "Nom UE", "Crédits ECTS", "Mention", "Parcours"};
    
    public DirectUeValiderButton() {
        addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ListeUeCsvModele.getInstance().setColumnNames(str);
                ListeUeCsvModele.getInstance().setListeUe("donnees/"+Etudiant.getInstance().getNumeroEt()+"_ListeUeValidee.csv");
            }
        });
        this.setText("UE validee");
        this.setBackground(new java.awt.Color(255, 122, 50));
        this.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        this.setForeground(new java.awt.Color(255, 255, 255));
    }
}
