/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.l3.gestiondesetudiants.modele;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author SophiaNachin
 */
public class DS_DossierEtudiantController extends DefaultTableModel{
    private ArrayList<String[]> values;
    private String[] columns;

    public DS_DossierEtudiantController(ArrayList<String[]> values, String[] columns) {
        this.values = values;
        this.columns = columns;
    }
    
    public DS_DossierEtudiantController(){
        
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
    
    
    
    private static void showUeEnCoursData(){
        //Parsing CSV Data
        File csv_file=new File("donnees/listeUEMiashsMiage.csv");
        DefaultTableModel csv_data=new DefaultTableModel();
        
        try{
            int start=0;
            InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream(csv_file));
            CSVParser csvParser= CSVFormat.DEFAULT.parse(inputStreamReader);
            for(CSVRecord csvRecord:csvParser){
                if(start==0){
                    start=1;
                    csv_data.addColumn(csvRecord.get(0));
                    csv_data.addColumn(csvRecord.get(1));
                    csv_data.addColumn(csvRecord.get(2));
                    csv_data.addColumn(csvRecord.get(3));
                    csv_data.addColumn(csvRecord.get(4));
                }
                else{
                    Vector row=new Vector();
                    row.add(csvRecord.get(0));
                    row.add(csvRecord.get(1));
                    row.add(csvRecord.get(2));
                    row.add(csvRecord.get(3));
                    row.add(csvRecord.get(4));
                    csv_data.addRow(row);
                }
            }
        }
        catch (Exception e){
            System.out.println("Error in Parsing CSV File");
        }
        
        //UeEnCoursjTable.setModel(csv_data);
    }
}
