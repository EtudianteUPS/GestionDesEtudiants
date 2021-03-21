package fr.miage.toulouse.l3.gestiondesetudiants.view;

import fr.miage.toulouse.l3.gestiondesetudiants.modele.Etudiant;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.ListeEtudiantCsvModele;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.ListeUeCsvModele;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.Mention;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.Parcours;
import fr.miage.toulouse.l3.gestiondesetudiants.outils.AfficherPanel;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author SophiaNachin
 */
public class ListeEtudiantTable extends JTable{
     
    private ListeEtudiantCsvModele modele;
    private AfficherPanel afficherPanel;
    
    public ListeEtudiantTable() {
        this.afficherPanel = AfficherPanel.getInstance();
        initComponents(); 
    }
    
    private void initComponents(){
        modele = new ListeEtudiantCsvModele();
        this.setModel(modele);
        
        this.setFont(new java.awt.Font("Segoe UI", 0, 11));
        this.setForeground(new java.awt.Color(51, 51, 51));
        this.setSelectionBackground(new java.awt.Color(255, 191, 153));
        this.setGridColor(new java.awt.Color(255, 255, 255));
        Dimension d = new Dimension();
        d.setSize(690, 429);
        this.setPreferredSize(d);
        this.setPreferredScrollableViewportSize(this.getPreferredSize());
        this.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(this);
        
        /* --------------------------------- */
        //controller
        this.addMouseListener(new java.awt.event.MouseAdapter(){
          public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
    }
    
    private void tableMouseClicked(java.awt.event.MouseEvent evt) { 
        Etudiant.getInstance().setNumeroEt(this.modele.getValueAt(getSelectedRow(), 0).toString());
        Etudiant.getInstance().setNom(this.modele.getValueAt(getSelectedRow(), 1).toString());
        Etudiant.getInstance().setPrenom(this.modele.getValueAt(getSelectedRow(), 2).toString());
        Etudiant.getInstance().setMention((Mention) this.modele.getValueAt(getSelectedRow(), 3));
        Etudiant.getInstance().setParcours((Parcours) this.modele.getValueAt(getSelectedRow(), 4));  
 
        
        
        
        if (this.afficherPanel.getAncienPanel()==-2){
            String[] str ={"Code id de l'UE", "Nom UE", "Crédits ECTS"};
            ListeUeCsvModele.getInstance().setColumnNames(str);
            ListeUeCsvModele.getInstance().setListeUe("donnees/"+Etudiant.getInstance().getNumeroEt()+"_ListeUeEnCours.csv");  
        
            this.afficherPanel.setPanel(3); 
        }
        else if(this.afficherPanel.getAncienPanel()==-3){
            String[] str ={"Code id de l'UE", "Nom UE", "Crédits ECTS", "Mention", "Parcours"};
            ListeUeCsvModele.getInstance().setColumnNames(str);
            ListeUeCsvModele.getInstance().setListeUe("donnees/"+Etudiant.getInstance().getNumeroEt()+"_ListeUeDisponible.csv");  
        
        
            this.afficherPanel.setPanel(4); 
        }
        else
            System.out.println("ancien panel : " + this.afficherPanel.getAncienPanel());
                              
    }  
}
