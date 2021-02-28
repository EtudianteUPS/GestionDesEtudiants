/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.l3.gestiondesetudiants.modele;

import fr.miage.toulouse.l3.gestiondesetudiants.exceptions.ValeurCreditErronee;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.Mention;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.Parcours;
import java.util.ArrayList;
import java.io.*; //File,FileReader,FileNotFoundException,BufferedReader,IOException
import java.util.logging.Level;
import java.util.logging.Logger;
public class ListeUeValideeCsv {
   private ArrayList<UE> ueValidee;
   public ListeUeValideeCsv() {
      ueValidee = new ArrayList<UE>();
   }
   public void add(UE ue) {
      ueValidee.add(ue);
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
                String mention = tokens[3].trim();
                String parcours = tokens[4].trim();
                
                
                try {
                    UE ue = new UE(id_ue, nom_ue, (credit_ue), new Mention(mention), new Parcours(parcours));
                    ueValidee.add(ue);
                } catch (ValeurCreditErronee ex) {
                    Logger.getLogger(ListeUeValideeCsv.class.getName()).log(Level.SEVERE, null, ex);
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
       Object[][] data = new Object[ueValidee.size()][5];
       for (int i = 0; i < ueValidee.size(); i++) {
          data[i][0] = ueValidee.get(i).getId_Ue();
          data[i][1] = ueValidee.get(i).getNom_Ue();
          data[i][2] = ueValidee.get(i).getCredit_Ue();
          data[i][3] = ueValidee.get(i).getMention().getIntituleMention();
          data[i][4] = ueValidee.get(i).getParcours().getIntitule_parcours();
       }
       return data;
   }
}