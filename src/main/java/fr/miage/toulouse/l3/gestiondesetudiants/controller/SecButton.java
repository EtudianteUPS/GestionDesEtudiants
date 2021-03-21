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
public class SecButton extends JButton{
    public SecButton() {
        addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AfficherPanel.getInstance().setPanel(1);
            }
        });

        this.setBackground(new java.awt.Color(255, 122, 50));
        this.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        this.setForeground(new java.awt.Color(255, 255, 255));
        this.setText("Secrétaire");
        this.setFocusPainted(false);
        this.setPreferredSize(new Dimension(212, 361));
    }
}
