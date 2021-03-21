package fr.miage.toulouse.l3.gestiondesetudiants.view;

/**
 *
 * @author SophiaNachin
 */
public class BureauExamenListeUEPanel extends javax.swing.JPanel {

    /**
     * Creates new form BureauExamenListeEtudiantsPanel
     */
    public BureauExamenListeUEPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listeEtudiantLabel = new javax.swing.JLabel();
        trierLabel = new javax.swing.JLabel();
        mentionComboBox = new javax.swing.JComboBox<>();
        parcoursComboBox = new javax.swing.JComboBox<>();
        consulterButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listeUeTable1 = new fr.miage.toulouse.l3.gestiondesetudiants.view.ListeUeTable();

        setBackground(new java.awt.Color(252, 252, 252));
        setPreferredSize(new java.awt.Dimension(709, 509));

        listeEtudiantLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        listeEtudiantLabel.setForeground(new java.awt.Color(51, 51, 51));
        listeEtudiantLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        listeEtudiantLabel.setText("Liste des UE");

        trierLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        trierLabel.setForeground(new java.awt.Color(51, 51, 51));
        trierLabel.setText("Trier par");

        mentionComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mentionComboBox.setForeground(new java.awt.Color(51, 51, 51));
        mentionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mention", "Item 2", "Item 3", "Item 4" }));
        mentionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mentionComboBoxActionPerformed(evt);
            }
        });

        parcoursComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        parcoursComboBox.setForeground(new java.awt.Color(51, 51, 51));
        parcoursComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Parcours", "Item 2", "Item 3", "Item 4" }));
        parcoursComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parcoursComboBoxActionPerformed(evt);
            }
        });

        consulterButton.setBackground(new java.awt.Color(255, 90, 0));
        consulterButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        consulterButton.setForeground(new java.awt.Color(51, 51, 51));
        consulterButton.setText("Consulter");
        consulterButton.setFocusPainted(false);
        consulterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulterButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listeUeTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listeEtudiantLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(trierLabel)
                        .addGap(18, 18, 18)
                        .addComponent(mentionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(parcoursComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(consulterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(listeEtudiantLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trierLabel)
                    .addComponent(parcoursComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mentionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addGap(19, 19, 19)
                .addComponent(consulterButton)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mentionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mentionComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mentionComboBoxActionPerformed

    private void parcoursComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parcoursComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parcoursComboBoxActionPerformed

    private void consulterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulterButtonActionPerformed

    }//GEN-LAST:event_consulterButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consulterButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel listeEtudiantLabel;
    private fr.miage.toulouse.l3.gestiondesetudiants.view.ListeUeTable listeUeTable1;
    private javax.swing.JComboBox<String> mentionComboBox;
    private javax.swing.JComboBox<String> parcoursComboBox;
    private javax.swing.JLabel trierLabel;
    // End of variables declaration//GEN-END:variables
}