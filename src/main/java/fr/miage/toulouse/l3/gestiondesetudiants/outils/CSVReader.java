package fr.miage.toulouse.l3.gestiondesetudiants.outils;

import fr.miage.toulouse.l3.gestiondesetudiants.exceptions.ValeurCreditErronee;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.Etudiant;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.Mention;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.Parcours;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.UE;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SophiaNachin
 */
public class CSVReader {
    
    /* 
    //On ne peut pas factoriser, car ça plante lors du test
    private BufferedReader getFile(String filename){
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
        return infile;
    }
    */
    
    
    public void readUeFromCSV(String filename, ArrayList<UE> liste){
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
                //line = getFile(filename).readLine();
                line = infile.readLine();
                if (line == null) {
                    done = true;
                }
                else {
                    try {
                        String[] tokens = line.trim().split(",");  
                        String id_ue = tokens[0].trim();
                        String nom_ue = tokens[1].trim();
                        int credit_ue = Character.getNumericValue(tokens[2].trim().charAt(0));
                        String mention = tokens[3].trim();
                        String parcours = tokens[4].trim();
                        
                        System.out.println("fich : " + filename + ", idUe : " + id_ue + ", nomUe : " +nom_ue+ ", credit : "+credit_ue + ", mention : " + mention + ", parcours : " + parcours );
                        liste.add(new UE(id_ue, nom_ue, credit_ue, new Mention(mention), new Parcours(parcours)));
                    } catch (ValeurCreditErronee ex) {
                        Logger.getLogger(CSVReader.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void readEtudiantFromCSV(String filename, ArrayList<Etudiant> liste){
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

                    liste.add(new Etudiant(nom,prenom,numeroEt,mention,parcours));
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
