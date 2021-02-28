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
public class ListeUeCsv {
   private ArrayList<UE> listeUe;
   public ListeUeCsv() {
      listeUe = new ArrayList<UE>();
   }
   public void add(UE UEs) {
      listeUe.add(UEs);
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
                    listeUe.add(ue);
                } catch (ValeurCreditErronee ex) {
                    Logger.getLogger(ListeUeCsv.class.getName()).log(Level.SEVERE, null, ex);
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
   Object[][] data = new Object[listeUe.size()][5];
       for (int i = 0; i < listeUe.size(); i++) {
          data[i][0] = listeUe.get(i).getId_Ue();
          data[i][1] = listeUe.get(i).getNom_Ue();
          data[i][2] = listeUe.get(i).getCredit_Ue();
          data[i][3] = listeUe.get(i).getMention().getIntituleMention();
          data[i][4] = listeUe.get(i).getParcours().getIntitule_parcours();
       }
       return data;
   }
}