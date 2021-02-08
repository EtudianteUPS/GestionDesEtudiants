/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.l3.gestiondesetudiants.modele;

import fr.miage.toulouse.l3.gestiondesetudiants.modele.Mention;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.Parcours;
import java.util.ArrayList;
import java.io.*; //File,FileReader,FileNotFoundException,BufferedReader,IOException
public class ListeEtudiantsCsv {
   private ArrayList<Etudiant> etudiants;
   public ListeEtudiantsCsv() {
      etudiants = new ArrayList<Etudiant>();
   }
   public void add(Etudiant sb) {
      etudiants.add(sb);
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
               String nom = tokens[0].trim();
               String prenom = tokens[1].trim();
        
               String numeroEt = tokens[2].trim();
               Mention mention = new Mention (tokens[3].trim());
               Parcours parcours = new Parcours (tokens[4].trim());
               Etudiant sb = new Etudiant(nom,prenom,numeroEt,mention,parcours);
               etudiants.add(sb);
            }
         }
      }
      catch (IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }
   public Object[][] convert2Data() {
       Object[][] data = new Object[etudiants.size()][5];
       for (int i = 0; i < etudiants.size(); i++) {
          data[i][0] = etudiants.get(i).getNom();
          data[i][1] = etudiants.get(i).getPrenom();
          data[i][2] = etudiants.get(i).getNumeroEt();
          data[i][3] = etudiants.get(i).mention.getIntitule_mention();
          data[i][4] = etudiants.get(i).parcours.getIntitule_parcours();
       }
       return data;
   }
}