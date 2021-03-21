package fr.miage.toulouse.l3.gestiondesetudiants.controller;

import fr.miage.toulouse.l3.gestiondesetudiants.modele.ListeUeCsvModele;
import fr.miage.toulouse.l3.gestiondesetudiants.outils.AfficherPanel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;

/**
 *
 * @author SophiaNachin
 */
public class BurButton extends JButton{
    public BurButton() {
        addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] str ={"Code id de l'UE", "Nom UE", "Crédits ECTS", "Mention", "Parcours"};
                ListeUeCsvModele.getInstance().setColumnNames(str);
                ListeUeCsvModele.getInstance().setListeUe("donnees/listeUe.csv");  
  
                AfficherPanel.getInstance().setPanel(2);
            }
        });
        this.setBackground(new java.awt.Color(255, 122, 50));
        this.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        this.setForeground(new java.awt.Color(255, 255, 255));
        this.setText("Bureau des examens");
        this.setFocusPainted(false);
        this.setPreferredSize(new Dimension(212, 361));
    }
}
