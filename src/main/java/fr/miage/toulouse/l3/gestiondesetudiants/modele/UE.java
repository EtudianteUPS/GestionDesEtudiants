/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.l3.gestiondesetudiants.modele;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SophiaNachin
 */
public class UE {
    private String id_ue;
    private String nom_ue;
    private int credit_ue;
    private Mention mention;
    private Parcours parcours;
    private ArrayList<UE> prerequis_ue;   
    
    /**
     * Initialisation d'une UE
     * Si la valeur de credit_ue n'est pas 3 ou 6, on ne crée pas l'objet
     * @param id_ue
     * @param nom_ue
     * @param credit_ue
     * @throws ValeurCreditErronee 
     */
    public UE(String id_ue, String nom_ue, int credit_ue) throws ValeurCreditErronee{
        if (credit_ue != 3 && credit_ue != 6)
               throw new ValeurCreditErronee(credit_ue);
        else{
            this.id_ue = id_ue;
            this.nom_ue = nom_ue;
            this.credit_ue = credit_ue;
        }
    }
    
    /**
     * 
     * @param id_ue
     * @param nom_ue
     * @param credit_ue
     * @param id_mention
     * @param prerequis_ue
     * @throws ValeurCreditErronee 
     */
    public UE(String id_ue, String nom_ue, int credit_ue, Mention mention, Parcours parcours, ArrayList<UE> prerequis_ue) throws ValeurCreditErronee{
        this(id_ue,nom_ue, credit_ue);
        this.mention = mention;
        this.parcours = parcours;
        this.prerequis_ue = prerequis_ue;
    }
    
   
    public String getId_Ue(){
        return this.id_ue;
    }
    
    public String getNom_Ue(){
        return this.nom_ue;
    }
    
    public int getCredit_Ue(){
        return this.credit_ue;
    }

    public Mention getMention() {
        return mention;
    }

    public Parcours getParcours() {
        return parcours;
    }
    
    
    public ArrayList<UE> getPrerequis_Ue(){
        return this.prerequis_ue;
    }
    /**
     * @return les caractéristiques de l'ue et, si elle a des prerequis, la liste de ses prerequis
     */
    public String toString(){
        String str = this.id_ue + "," + this.nom_ue + "," + this.credit_ue + "," + this.mention + "," + this.parcours;        
        if (this.prerequis_ue != null){
            str += ",'" ;
            for (UE ue : this.prerequis_ue) {
                str += ue.toString()+",";
            }
            str+="'";
        }
        return str;
    }
    
    public String[] toStringTab(){
        String[] str = {this.getId_Ue(),this.getNom_Ue(), String.valueOf(this.getCredit_Ue())};
        return str;
    }
    
    
    
    public static void main(String[] args) throws IOException{
        /* Creation du repertoire et ajout du fichier tmp.txt dedans 
            File dir = new File("donnees");
            dir.mkdirs();
            File tmp = new File(dir, "tmp.txt");
            try {
                tmp.createNewFile();

                //File tempfile = new File("user.dir/tmp", "tempfile.txt");
            } catch (IOException ex) {
                Logger.getLogger(UE.class.getName()).log(Level.SEVERE, null, ex);
            }
        */
        
        //Instantiating the CSVWriter class
        
        /*CSVWriter writer = new CSVWriter(new FileWriter("donnees/listeUEMiashsMiage.csv"));
        try{
            String[] title = {"idUE","Nom UE","Crédits","Mention","Parcours"};
            UE S1UE1 = new UE("S1Inf","Informatique",6,"MIASHS","MIAGE",null);
            UE S1UE2 = new UE("S1Mat","Mathématiques",6,"MIASHS","MIAGE",null);
            UE S1UE3 = new UE("S1Phy","Physique",6,"MIASHS","MIAGE",null);
            UE S1UE4 = new UE("S1Chi","Chimie",6,"MIASHS","MIAGE",null);
            UE S1UE5 = new UE("S1Dev","Devenir étudiant",3,"MIASHS","MIAGE",null);
            
            UE S2UE1 = new UE("S2Tni","Traitement numérique de l'information",6,"MIASHS","MIAGE",null);
            UE S2UE2 = new UE("S2Alg","Algorithmique",6,"MIASHS","MIAGE",null);
            UE S2UE3 = new UE("S2Log","Logique",6,"MIASHS","MIAGE",null);
            UE S2UE4 = new UE("S2Mnu","Méthodes numériques",6,"MIASHS","MIAGE",null);
            UE S2UE5 = new UE("S2Cde","Connaissance de l'entreprise",3,"MIASHS","MIAGE",null);
            
            UE S3UE1 = new UE("S3Cma","Calcul Matriciel",6,"MIASHS","MIAGE",null);
            UE S3UE2 = new UE("S3Ihm","Interaction Homme Machine",6,"MIASHS","MIAGE",null);
            UE S3UE3 = new UE("S3Sy1","Systèmes 1",6,"MIASHS","MIAGE",null);
            UE S3UE4 = new UE("S3Dee","Développement et environnement",6,"MIASHS","MIAGE",null);
            UE S3UE5 = new UE("S3Sap","Système d'information",3,"MIASHS","MIAGE",null);
            
            UE S4UE1 = new UE("S4Sy2","Systèmes 2",6,"MIASHS","MIAGE",null);
            UE S4UE2 = new UE("S4Bd1","Base de données 1",6,"MIASHS","MIAGE",null);
            UE S4UE3 = new UE("S4Sia","SIA Web",6,"MIASHS","MIAGE",null);
            UE S4UE4 = new UE("S4Ieg","Interactivité et Gamification",6,"MIASHS","MIAGE",null);
            UE S4UE5 = new UE("S4Cpt","Compétences",3,"MIASHS","MIAGE",null);
            
            ArrayList<String[]> listeUe = new ArrayList<String[]>();
            
            listeUe.add(S1UE1.toStringTab());
            listeUe.add(S1UE2.toStringTab());
            listeUe.add(S1UE3.toStringTab());
            listeUe.add(S1UE4.toStringTab());
            listeUe.add(S1UE5.toStringTab());
            
            listeUe.add(S2UE1.toStringTab());
            listeUe.add(S2UE2.toStringTab());
            listeUe.add(S2UE3.toStringTab());
            listeUe.add(S2UE4.toStringTab());
            listeUe.add(S2UE5.toStringTab());
            
            listeUe.add(S3UE1.toStringTab());
            listeUe.add(S3UE2.toStringTab());
            listeUe.add(S3UE3.toStringTab());
            listeUe.add(S3UE4.toStringTab());
            listeUe.add(S3UE5.toStringTab());
            
            listeUe.add(S4UE1.toStringTab());
            listeUe.add(S4UE2.toStringTab());
            listeUe.add(S4UE3.toStringTab());
            listeUe.add(S4UE4.toStringTab());
            listeUe.add(S4UE5.toStringTab());
            
            //Writing data to the csv file
            writer.writeNext(title);
            writer.writeAll(listeUe);
            writer.flush();
        }
        catch(ValeurCreditErronee v){
            v.printStackTrace();
        }*/
    }
}
