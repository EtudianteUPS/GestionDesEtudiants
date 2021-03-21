package fr.miage.toulouse.l3.gestiondesetudiants.controller;

import fr.miage.toulouse.l3.gestiondesetudiants.outils.AfficherPanel;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;

/**
 *
 * @author SophiaNachin
 */
public class RetourButton extends JButton{
    public RetourButton() {
        addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ancien panel : " + AfficherPanel.getInstance().getAncienPanel());
                AfficherPanel.getInstance().setPanel(AfficherPanel.getInstance().getAncienPanel());
            }
        });
        
        this.setBackground(new java.awt.Color(255, 191, 153));
        this.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        this.setForeground(new java.awt.Color(51, 51, 51));
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left-arrow.png"))); // NOI18N
        this.setText("Retour");
        this.setBorderPainted(false);
        this.setContentAreaFilled(false);
        this.setFocusPainted(false);
    }
}
