/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.l3.gestiondesetudiants.modele;

import fr.miage.toulouse.l3.gestiondesetudiants.controller.DS_DossierEtudiantController;
import fr.miage.toulouse.l3.gestiondesetudiants.view.D_DossierEtudiant;
import fr.miage.toulouse.l3.gestiondesetudiants.view.S_DossierEtudiant;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.table.TableModel;

/**
 *
 * @author FatimatouCisse
 */

public class JTableEtudiants extends JFrame implements ActionListener {
   private Object[][] data;
   private String[] columnNames = {"Nom","Prénom","Numéro d'étudiant", "Mention", "Parcours"};
   private DefaultTableModel tableModel;
   private JTable table;
   private ListeEtudiantsCsv myList;
   private JLabel listeEtudiantsLabel;

   public JTableEtudiants() {
      super("Table Etudiants");
      initComponents(); 
      this.setLocationRelativeTo(null); // center the frame
   }
   
   
   D_DossierEtudiant jtRowData = new D_DossierEtudiant();
   private void initComponents(){
      
      setBounds(30,30,950,650);
      setResizable(false);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myList = new ListeEtudiantsCsv();
      myList.readFromCSV("donnees/data.csv");
      data = myList.convert2Data();
      tableModel = new DefaultTableModel(data, columnNames);
      table = new JTable(tableModel);
      table.setAutoCreateRowSorter(true);
      table.setSelectionBackground(new java.awt.Color(255, 191, 153));
      listeEtudiantsLabel = new JLabel();
      listeEtudiantsLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
      listeEtudiantsLabel.setForeground(new java.awt.Color(51, 51, 51));
      listeEtudiantsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      listeEtudiantsLabel.setText("Liste des étudiants");

      JScrollPane scrollPane = new JScrollPane(table);
      scrollPane.setPreferredSize(new Dimension(800,600));
      JPanel panel = new JPanel();
      panel.add(listeEtudiantsLabel);
      panel.add(scrollPane);
      add(panel,BorderLayout.CENTER);
      
        

      panel.setBackground(new java.awt.Color(255, 255, 255));
      //scrollPane.setBackground(new java.awt.Color(184, 255, 255));
      //table.setBackground(new java.awt.Color(255, 255, 255));*/
      scrollPane.getViewport().setBackground(Color.WHITE);
      
      table.addMouseListener(new java.awt.event.MouseAdapter(){
          public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
      });
   }
   public void actionPerformed(ActionEvent ae) {

   }
   
   private void tableMouseClicked(java.awt.event.MouseEvent evt) {                                     
        
        /*TableModel model = table.getModel();
        D_DossierEtudiant dde = new D_DossierEtudiant();
        DS_DossierEtudiantController dc = new DS_DossierEtudiantController(model,this, dde); 
        dc.initController();*/
        
        int index = table.getSelectedRow();
        
        TableModel model = table.getModel();
        
        String nom = model.getValueAt(index, 0).toString();
        String prenom = model.getValueAt(index, 1).toString();
        String numeroEt= model.getValueAt(index, 2).toString();
        String mention = model.getValueAt(index, 3).toString();
        String parcours = model.getValueAt(index, 4).toString();
        
        D_DossierEtudiant jtRowData = new D_DossierEtudiant();
        DS_DossierEtudiantController dc = new DS_DossierEtudiantController(numeroEt, jtRowData); 
        dc.initController();
        jtRowData.setVisible(true);
        //D_Dossier etudiant 
        jtRowData.pack();
        jtRowData.setLocationRelativeTo(null);
        jtRowData.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        jtRowData.getnumEtudiantLabel().setText(numeroEt);
        jtRowData.getNomLabel().setText(nom);
        jtRowData.getPrenomLabel().setText(prenom);
        jtRowData.getMentionLabel().setText(mention);
        jtRowData.getParcoursLabel().setText(parcours);
        jtRowData.numEtudiant = numeroEt;
            
        this.dispose();                          
   }
   
   public JTable getJTable (){
     return table;  
   }
   
   
  
   /*public static void main(String[] args) {
      JTableEtudiants myApp = new JTableEtudiants ("Table Etudiants");
      myApp.setVisible(true);
   }*/
}


