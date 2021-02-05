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
    private  int id_mention;
    private String intitule_mention; 
    private ArrayList<Parcours > parcours_associés; 
    private ArrayList <UE> ue_dispo;   

    /**Initiation d'une mention 
     * @param id_mention = numéro de la mention 
     * @param intitule_mention = intitulé de la mention
     * * @param intitule_mention = intitulé de la mention
     */
    
      public Mention (int id_mention,String intitule_mention, ArrayList<Parcours > parcours_associés ) 
      {
        this.id_mention = id_mention;
        this.intitule_mention = intitule_mention;
        this.parcours_associés = parcours_associés;
       }

}
