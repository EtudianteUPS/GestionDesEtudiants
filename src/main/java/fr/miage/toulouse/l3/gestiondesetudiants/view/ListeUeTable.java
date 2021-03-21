package fr.miage.toulouse.l3.gestiondesetudiants.view;

import fr.miage.toulouse.l3.gestiondesetudiants.exceptions.ValeurCreditErronee;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.Etudiant;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.ListeEtudiantCsvModele;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.ListeUeCsvModele;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.Mention;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.Parcours;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.UE;
import fr.miage.toulouse.l3.gestiondesetudiants.outils.AfficherPanel;
import fr.miage.toulouse.l3.gestiondesetudiants.outils.ConvertList2Data;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author SophiaNachin
 */
public class ListeUeTable extends JTable implements IView{
    /*private int indexTabbedPane = -1;
    private ListeUeCsvModele modele;
    private String chemin;
    private String[] columnNames;*/
    private Object[][] data;
    

    public ListeUeTable() {
        /*String[] str ={"Code id de l'UE", "Nom UE", "Crédits ECTS"};
        this.setChemin("donnees/listeUE.csv");
        this.setColumnNames(str);*/
        
        initComponents();
        ListeUeCsvModele.getInstance().addView(this);
    }


    /*public void setIndexTabbedPane(int indexTabbedPane) {
        this.indexTabbedPane = indexTabbedPane;
        
        if(Etudiant.getInstance().getNumeroEt() != "")
            initFile();  
    }*/
    
    /*private void initFile(){
        switch(this.indexTabbedPane){
            case 0 : this.setModel(MODELE_UE_EN_COURS);
        }
        
        this.setModel(MODELE_UE_EN_COURS);
    }*/
    
    protected void initComponents(){
        //this.setSize(681, 321);
        this.setFont(new java.awt.Font("Segoe UI", 0, 11));
        this.setForeground(new java.awt.Color(51, 51, 51));
        this.setSelectionBackground(new java.awt.Color(255, 191, 153));
        //listeUeJTable.setSelectionBackground(new java.awt.Color(0, 165, 255));
        this.setGridColor(new java.awt.Color(255, 255, 255));
        Dimension d = new Dimension();
        d.setSize(681, 321);
        this.setPreferredSize(d);
        this.setPreferredScrollableViewportSize(this.getPreferredSize());
        this.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(this);
        this.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {}
        ));
        
        
        /* --------------------------------- */
        if(AfficherPanel.getInstance().getAncienPanel()==-1){
            //controller
            this.addMouseListener(new java.awt.event.MouseAdapter(){
              public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tableMouseClicked(evt);
                }
            });
        }
        
        
    }

    
    private void tableMouseClicked(java.awt.event.MouseEvent evt) { 
        UE ue;
        ListeEtudiantCsvModele modeleEtudiant = new ListeEtudiantCsvModele();
        
        try {
            ue = new UE(this.getModel().getValueAt(getSelectedRow(), 0).toString(),
                    this.getModel().getValueAt(getSelectedRow(), 1).toString(),
                    Integer.valueOf(this.getModel().getValueAt(getSelectedRow(), 2).toString()),
                    new Mention(this.getModel().getValueAt(getSelectedRow(), 3).toString()),
                    new Parcours(this.getModel().getValueAt(getSelectedRow(), 4).toString()));
            
            ArrayList<Etudiant> listeEtudiant = new ArrayList<Etudiant>();

            for (Etudiant e : modeleEtudiant.getListeEtudiant()){
                
                System.out.println("e.mention :" + e.getMention().getIntituleMention()+"|");
                System.out.println("ue.mention :" + ue.getMention().getIntituleMention()+"|");
                
                
                 System.out.println("e.mention==ue.mention :" + (e.getMention().getIntituleMention() == ue.getMention().getIntituleMention()));
                System.out.println("e.parcours==ue.parcours :" + (e.getParcours().getIntituleParcours()== ue.getParcours().getIntituleParcours()));
                
                if ((e.getMention().getIntituleMention() == ue.getMention().getIntituleMention()) && (e.getParcours().getIntituleParcours()== ue.getParcours().getIntituleParcours())){
                    listeEtudiant.add(e);
                    System.out.println("ListeUeTable | ajout etudiant : " + e.getNumeroEt());
                }
            }
        } catch (ValeurCreditErronee ex) {
            Logger.getLogger(ListeUeTable.class.getName()).log(Level.SEVERE, null, ex);
        }
                           
    } 
    
    @Override
    public void notify(String numEt, String nom, String prenom, Mention mention, Parcours parcours) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  

    @Override
    public void notify(String[] columnNames, ArrayList<UE> listeUe) {
        if (columnNames!=null && listeUe!=null){ 
            data = new ConvertList2Data().convertList2Data(columnNames.length, listeUe);
            this.setModel(new DefaultTableModel(data, columnNames));
        }
    }
}
