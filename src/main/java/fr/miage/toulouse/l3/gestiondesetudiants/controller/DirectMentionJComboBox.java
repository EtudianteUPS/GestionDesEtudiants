package fr.miage.toulouse.l3.gestiondesetudiants.controller;

import javax.swing.JComboBox;

/**
 *
 * @author SophiaNachin
 */
public class DirectMentionJComboBox extends JComboBox{
    Boolean enable = false;
    public DirectMentionJComboBox() {
        this.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        this.setForeground(new java.awt.Color(51, 51, 51));
        this.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mention" }));
        this.setEnabled(false);
    }    
}
