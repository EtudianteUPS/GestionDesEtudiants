/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.l3.gestiondesetudiants.modele;

import fr.miage.toulouse.l3.gestiondesetudiants.exceptions.ValeurCreditErronee;
import java.util.ArrayList;
import java.io.*; //File,FileReader,FileNotFoundException,BufferedReader,IOException
import java.util.logging.Level;
import java.util.logging.Logger;
public class ListeUeEnCoursCsv {
   private ArrayList<UE> ueEnCours;
   public ListeUeEnCoursCsv() {
      ueEnCours = new ArrayList<UE>();
   }
   public void add(UE enCours) {
      ueEnCours.add(enCours);
   }
   public void readFromCSV(String filename) {
      File file = new File(filename);
      FileReader reader = null;
      try {
         reader = new FileReader(file);
      }
      catch (FileNotFoundException e) {
         e.printStackTrace();
         System.exit(1);
      }
      BufferedReader infile = new BufferedReader(reader);
      String line = "";
      try {
         boolean done = false;
         while (!done) {
            line = infile.readLine();
            if (line == null) {
               done = true;
            }
            else {
                String[] tokens = line.trim().split(",");
                String id_ue = tokens[0].trim();
                String nom_ue = tokens[1].trim();
                int credit_ue = Character.getNumericValue(tokens[2].trim().charAt(0));
                
                
                try {
                    UE enCours  = new UE(id_ue, nom_ue, (credit_ue));
                    ueEnCours.add(enCours);
                } catch (ValeurCreditErronee ex) {
                    Logger.getLogger(ListeUeEnCoursCsv.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            }
         }
      }
      catch (IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }
   public Object[][] convert2Data() {
       Object[][] data = new Object[ueEnCours.size()][3];
       for (int i = 0; i < ueEnCours.size(); i++) {
          data[i][0] = ueEnCours.get(i).getId_Ue();
          data[i][1] = ueEnCours.get(i).getNom_Ue();
          data[i][2] = ueEnCours.get(i).getCredit_Ue();
          
       }
       return data;
   }
}