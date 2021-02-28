package fr.miage.toulouse.l3.gestiondesetudiants.view;

import fr.miage.toulouse.l3.gestiondesetudiants.modele.DirectSecretListeEtudiantsModele;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import au.com.bytecode.opencsv.CSVReader;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.Etudiant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FatimatouCisse
 */
public class DirectSecretListeEtudiants extends JFrame {
    /**
     * Creates new form DirectSecretListeEtudiants
     */
    private JTable jTable;
    private JButton openCSV;
    private JFileChooser fileChooser;
    private JToolBar toolBar;
    DirectSecretListeEtudiantsModele etudiantsModele;
    public DirectSecretListeEtudiants() throws HeadlessException {
        this.setVisible(true);
        this.setBounds(100, 100, 950, 650);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        init();
        System.out.println("DS_ListeEtudiants.<init>()");
    }    
    
    public void init()
    {
        openCSV = new JButton ("Choisissez un fichier à lire");
        setAction();
        fileChooser = new JFileChooser();
        toolBar = new JToolBar();
        toolBar.add(openCSV);
        this.add(toolBar, BorderLayout.NORTH);
        
        System.out.println("DS_ListeEtudiants.init()");
        jTable = new JTable();
        this.add(new JScrollPane(jTable), BorderLayout.CENTER);
         
        etudiantsModele = new DirectSecretListeEtudiantsModele();
        jTable.setModel(etudiantsModele);
        
        etudiantsModele.fireTableDataChanged();
        
    }
    
    public void setAction(){
        openCSV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = fileChooser.showOpenDialog(DirectSecretListeEtudiants.this);
                if (i == JFileChooser.APPROVE_OPTION){
                    System.out.println (".fil Choosed");
                    File file = fileChooser.getSelectedFile();
                    System.err.println(file);
                    ArrayList<String[]> all = readCSV(file);
                    String[] cols = all.get(0);
                    
                    DirectSecretListeEtudiantsModele etudiantsModele = new DirectSecretListeEtudiantsModele(all, cols);
                    jTable.setModel(etudiantsModele);
                    
                    
                    
                    //etudiantsModele.setValues(all);
                   // etudiantsModele.setColumns(cols);
                    System.err.println("COL " + cols.length);
                    
                    etudiantsModele.fireTableDataChanged();
                }
            }  
        });
    }
    
    
   public ArrayList<String[]> readCSV(File file){
        ArrayList<String[]> data = new ArrayList<>();
       try{
        FileReader fileReader = new FileReader(file);
        CSVReader cSVReader = new CSVReader(fileReader);
        List<String[]> allRows = cSVReader.readAll();
        
        for(String[] row : allRows){
            data.add(row);    
        }
        
        System.out.println("DS_ListeEtudiants.readCSV" + data.size());
        
        
        
        
       }catch (Exception ex){
           ex.printStackTrace();
           return new ArrayList<>();
       }
       return data;
   }
    

    
    /*public static void main(String args[]) 
    {
        DirectSecretListeEtudiants listeEtudiants = new DirectSecretListeEtudiants();

    }*/

}