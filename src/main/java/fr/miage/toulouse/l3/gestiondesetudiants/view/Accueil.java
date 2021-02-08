/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.l3.gestiondesetudiants.view;

import fr.miage.toulouse.l3.gestiondesetudiants.controller.D_DossierEtudiantController;
import fr.miage.toulouse.l3.gestiondesetudiants.controller.D_ListeEtudiantsController;
import fr.miage.toulouse.l3.gestiondesetudiants.controller.SecretaireController;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.Etudiant;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.JTableEtudiants;

/**
 *
 * @author FatimatouCisse
 */
public class Accueil extends javax.swing.JFrame {
        
    /**
     * Creates new form Accueil
     */
    public Accueil() {
        initComponents();
        this.setLocationRelativeTo(null); // center the frame
    }

    /**
     * Permet d'initialiser la vue
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DirButton = new javax.swing.JButton();
        BurButton = new javax.swing.JButton();
        SecButton = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        EditMenu = new javax.swing.JMenu();
        ViewMenu2 = new javax.swing.JMenu();
        HelpMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 172, 127));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenue sur votre application de gestion des etudiants,");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("veuillez choisir votre profil :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        DirButton.setBackground(new java.awt.Color(255, 122, 50));
        DirButton.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        DirButton.setForeground(new java.awt.Color(255, 255, 255));
        DirButton.setText("Directeur");
        DirButton.setFocusPainted(false);
        DirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DirButtonActionPerformed(evt);
            }
        });

        BurButton.setBackground(new java.awt.Color(255, 122, 50));
        BurButton.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        BurButton.setForeground(new java.awt.Color(255, 255, 255));
        BurButton.setText("Bureau des examens");
        BurButton.setFocusPainted(false);
        BurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurButtonActionPerformed(evt);
            }
        });

        SecButton.setBackground(new java.awt.Color(255, 122, 50));
        SecButton.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        SecButton.setForeground(new java.awt.Color(255, 255, 255));
        SecButton.setText("Secrétaire");
        SecButton.setFocusPainted(false);
        SecButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(DirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SecButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(BurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(SecButton, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        jMenuBar.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar.setForeground(new java.awt.Color(51, 51, 51));

        FileMenu.setBackground(new java.awt.Color(255, 255, 255));
        FileMenu.setForeground(new java.awt.Color(51, 51, 51));
        FileMenu.setText("File");
        jMenuBar.add(FileMenu);

        EditMenu.setBackground(new java.awt.Color(255, 255, 255));
        EditMenu.setForeground(new java.awt.Color(51, 51, 51));
        EditMenu.setText("Edit");
        jMenuBar.add(EditMenu);

        ViewMenu2.setBackground(new java.awt.Color(255, 255, 255));
        ViewMenu2.setForeground(new java.awt.Color(51, 51, 51));
        ViewMenu2.setText("View");
        jMenuBar.add(ViewMenu2);

        HelpMenu1.setBackground(new java.awt.Color(255, 255, 255));
        HelpMenu1.setForeground(new java.awt.Color(51, 51, 51));
        HelpMenu1.setText("Help");
        jMenuBar.add(HelpMenu1);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void BurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BurButtonActionPerformed

    private void SecButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecButtonActionPerformed
        /* création vue */
        //S_DossierEtudiant sde = new S_DossierEtudiant();
           
        /*création Modele*/
        //Etudiant e1 = new Etudiant("Nachin","Sophia","21810700",1,1);

        /* Création du controller*/
        //SecretaireController sc = new SecretaireController(e1, this,sde);
        
        //sc.initController();
    }//GEN-LAST:event_SecButtonActionPerformed

    /**
     * Permet de charger la vue et les données du directeur d'étude
     * @param evt 
     */
    private void DirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DirButtonActionPerformed
        /* création vue */
        JTableEtudiants jte = new JTableEtudiants();
        
           
        /*création Modele*/
        //Etudiant e1 = new Etudiant(21810700,"Nachin","Sophia",1,1);

        /* Création du controller*/
        D_ListeEtudiantsController dle = new D_ListeEtudiantsController(this, jte);
        dle.initController();
        /* Liaison bouton directeur au controller */
        //accueil.getDirButton().addActionListener(ec); /* prend les données du modèle et l'affiche dans la vue */
    }//GEN-LAST:event_DirButtonActionPerformed

    /**
     *
     * @return this.DirButton
     */
    public javax.swing.JButton getDirButton(){
        return this.DirButton;
    }
    
    /**
     * 
     * @return this.SecButton
     */
    public javax.swing.JButton getSecButton(){
        return this.SecButton;
    }
    
    /**
     * 
     * @return this.BurButton
     */
    public javax.swing.JButton getBurButton(){
        return this.BurButton;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BurButton;
    private javax.swing.JButton DirButton;
    private javax.swing.JMenu EditMenu;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenu HelpMenu1;
    private javax.swing.JButton SecButton;
    private javax.swing.JMenu ViewMenu2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
