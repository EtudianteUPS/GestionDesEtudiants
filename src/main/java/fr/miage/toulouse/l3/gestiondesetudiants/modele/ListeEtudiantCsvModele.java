package fr.miage.toulouse.l3.gestiondesetudiants.modele;

import fr.miage.toulouse.l3.gestiondesetudiants.services.EtudiantService;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ListeEtudiantCsvModele extends AbstractTableModel{
   //columnNames
    private String[] columnNames = {"Numéro d'étudiant", "Nom","Prénom", "Mention", "Parcours"};
    //data
    private EtudiantService etudiantService;
    
    private List<Etudiant> listeEtudiant;
    
    /**
     * On connecte tableModel au service, puis on récupère les étudiants
     */
    public ListeEtudiantCsvModele() {
        this.etudiantService = EtudiantService.getInstance();
        
        /** ---------------------- */
        this.listeEtudiant = this.etudiantService.findEtudiants();
    }

    /**
     * Liste des étudiants récupérée dans EtudiantService
     * @return 
     */
    public List<Etudiant> getListeEtudiant(){
        return this.listeEtudiant;
    }
    
    /**
     * Indique le nombre de lignes
     * @return 
     */
    @Override
    public int getRowCount() {
        return this.listeEtudiant.size();
    }

    /**
     * Indique le nombre de colonnes
     * @return 
     */
    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    
    /**
     * Récupère le contenu d'une cellule
     * @return 
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch (columnIndex) {
            case 0:
                // Numéro de l'étudiant
                return this.listeEtudiant.get(rowIndex).getNumeroEt();

            case 1:
                // nom de l'ue
                return this.listeEtudiant.get(rowIndex).getNom();

            case 2:
                // Prénom de l'étudiant
                return this.listeEtudiant.get(rowIndex).getPrenom();

            case 3:
                // Mention de l'étudiant
                return this.listeEtudiant.get(rowIndex).getMention();
                
            case 4:
                // Parcours de l'étudiant
                return this.listeEtudiant.get(rowIndex).getParcours();
                
            default:
                throw new IllegalArgumentException();
        }
    }
}