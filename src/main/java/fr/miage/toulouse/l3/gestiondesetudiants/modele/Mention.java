package fr.miage.toulouse.l3.gestiondesetudiants.modele;

import java.util.ArrayList;

/**
 *
 * @author Nouar
 */
public class Mention {
    
    private String intituleMention; 
    private ArrayList<Parcours> parcoursAssocies; 
    private ArrayList <UE> ueDispo;   

    /**Initiation d'une mention 
     * @param idMention = numéro de la mention 
     * @param intituleMention = intitulé de la mention
 * @param intituleMention = intitulé de la mention
     */
    
      public Mention (String intituleMention ) //ArrayList<Parcours > parcoursAssocies
      {
        this.intituleMention = intituleMention;
        //this.parcoursAssocies = parcoursAssocies;
      }

    public String getIntituleMention() {
        return intituleMention;
    }
    
    
}
