/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.l3.gestiondesetudiants.modele;

import java.io.FileReader;
import java.util.Arrays;
 
import au.com.bytecode.opencsv.CSVReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Gère les liste des étudiants, rend des listes triées selon plusieurs critères.
 * @author Toky
 */
public class GestionDesEtudiants {
    
    public ArrayList<String[]> listeEtudiant(){
        
        ArrayList<String[]> liste = new ArrayList<>();
    
     try{
            //Build reader instance
          CSVReader reader = new CSVReader(new FileReader("ListeEtudiant.csv"), ',', '"', 1);

          //Read all rows at once
          List<String[]> allRows = reader.readAll();

          //Read CSV line by line and use the string array as you want
         for(String[] row : allRows){
            liste.add(row);
            System.out.println(Arrays.toString(row));
        }
         
         return liste;
     }
     catch(Exception ex){
         ex.printStackTrace();
         return new ArrayList<>();
     }
   }
    
}
