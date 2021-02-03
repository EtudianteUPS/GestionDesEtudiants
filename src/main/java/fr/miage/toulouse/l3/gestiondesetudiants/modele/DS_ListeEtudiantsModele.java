
package fr.miage.toulouse.l3.gestiondesetudiants.modele;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FatimatouCisse
 */
public class DS_ListeEtudiantsModele extends DefaultTableModel {
    private ArrayList<String[]> values;
    private String[] columns;

    public DS_ListeEtudiantsModele(ArrayList<String[]> values, String[] columns) {
        this.values = values;
        this.columns = columns;
    }

    public DS_ListeEtudiantsModele() {
    }

    
    
    
    
    @Override
    public Object getValueAt(int row, int column) {
        return values.get(row)[column];
    }

    @Override
    public String getColumnName(int column) {
        System.err.println("getColumn name");
        return columns[column];
    }

    @Override
    public int getColumnCount() {
        System.out.println("DS_ListeEtudiantsModele.getColumnCount()");
        if (columns == null)
            return 0;
        return columns.length;
    }

    @Override
    public int getRowCount() {
        if (values == null)
            return 0;
        return values.size(); //To change body of generated methods, choose Tools | Templates.
    }
    
}