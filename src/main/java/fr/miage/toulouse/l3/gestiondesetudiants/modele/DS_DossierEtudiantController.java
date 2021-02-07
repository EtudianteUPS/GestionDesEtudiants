/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.l3.gestiondesetudiants.modele;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SophiaNachin
 */
public class DS_DossierEtudiantModele extends DefaultTableModel{
    private ArrayList<String[]> values;
    private String[] columns;

    public DS_DossierEtudiantModele(ArrayList<String[]> values, String[] columns) {
        this.values = values;
        this.columns = columns;
    }
    
    public DS_DossierEtudiantModele(){
        
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
