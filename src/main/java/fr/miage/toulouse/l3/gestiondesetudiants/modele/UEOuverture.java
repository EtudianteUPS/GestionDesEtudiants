package fr.miage.toulouse.l3.gestiondesetudiants.modele;

import fr.miage.toulouse.l3.gestiondesetudiants.exceptions.ValeurCreditErronee;
import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author SophiaNachin
 */
public class UEOuverture extends UE{
    public UEOuverture(String id_ue, String nom_ue, int credit_ue) throws ValeurCreditErronee{
        super(id_ue, nom_ue, credit_ue);
    }
    
    public static void main(String[] args) throws IOException{
        CSVWriter writer = new CSVWriter(new FileWriter("donnees/listeUEOuverture.csv"));
        try{
            String[] title = {"idUE","Nom UE","Crédits"};
            UEOuverture S1The = new UEOuverture("S1The","Théâtre",3);
            UE S2Sos = new UE("S2Sos","SOS Anglais",3);
            UE S3Cin = new UE("S3Cin","Cinéma",3);
            UE S4Spo = new UE("S4Spo","Sport",3);
            
            ArrayList<String[]> listeUeOuverture = new ArrayList<String[]>();
            
            listeUeOuverture.add(S1The.toStringTab());
            listeUeOuverture.add(S2Sos.toStringTab());
            listeUeOuverture.add(S3Cin.toStringTab());
            listeUeOuverture.add(S4Spo.toStringTab());
            
            //Writing data to the csv file
            writer.writeNext(title);
            writer.writeAll(listeUeOuverture);
            writer.flush();
        }
        catch(ValeurCreditErronee v){
            v.printStackTrace();
        }
    }
}
