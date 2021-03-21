package fr.miage.toulouse.l3.gestiondesetudiants.modele;

import fr.miage.toulouse.l3.gestiondesetudiants.services.UEService;
import fr.miage.toulouse.l3.gestiondesetudiants.view.IView;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ListeUeCsvModele extends AbstractTableModel{
    //columnNames
    private String[] columnNames;
    //data
    private UEService ueService;
    
    private ArrayList<UE> listeUe;
    
    
    private List<IView> views = new ArrayList<>();
   private static ListeUeCsvModele instance;

    
    
    public static ListeUeCsvModele getInstance(){
        if (instance == null){
            instance = new ListeUeCsvModele();
        }
        return instance;
    }

    private ListeUeCsvModele(){
        this.columnNames = null;
        this.ueService = UEService.getInstance();
        this.listeUe = null;
    }
    
    
    /**
     * On connecte tableModel au service, puis on récupère les UEs
     */
    
    public ListeUeCsvModele(String[] column, String chemin) {
        this.columnNames = column;
        this.ueService = UEService.getInstance();
        this.listeUe = this.ueService.findUEs(chemin);
    }
    

    /**
     * Liste des UE récupérée dans UEService
     * @return 
     */
    public ArrayList<UE> getListeUe(){
        return this.listeUe;
    }
    
    /**
     * Indique le nombre de lignes
     * @return 
     */
    @Override
    public int getRowCount() {
        return this.listeUe.size();
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
                // Id de l'Ue
                return this.listeUe.get(rowIndex).getId_Ue();
            case 1:
                // nom de l'ue
                return this.listeUe.get(rowIndex).getNom_Ue();
            case 2:
                // le nombre de crédit de l'ue
                return this.listeUe.get(rowIndex).getCredit_Ue();
            case 3:
                // la mention de l'ue
                return this.listeUe.get(rowIndex).getMention();
            case 4:
                // le parcours de l'ue
                return this.listeUe.get(rowIndex).getParcours();

            default:
                throw new IllegalArgumentException();
        }
    }
    
    
    /* ---------- */ 
    
    public void setListeUe(String chemin){
        this.listeUe = this.ueService.findUEs(chemin);
        notifyViews();
    }

    public void setColumnNames(String[] columnNames) {
        this.columnNames = columnNames;
        notifyViews();
    }
    
    /*
    public void setListeUeModele(String[] columnNames, ArrayList<UE> liste){
        this.listeUe = liste;
        this.columnNames = columnNames;
        notifyViews();
    }*/
    
    public void addView(IView v){
        views.add(v);
        v.notify(this.columnNames, this.listeUe);
    }

    public void removeView(IView v){
        views.remove(v);
    }

    public void notifyViews(){
        for (IView v:views){
            v.notify(this.columnNames, this.listeUe);
        }
    }
    
}