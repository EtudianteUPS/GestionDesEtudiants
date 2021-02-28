/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
