/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.l3.gestiondesetudiants.modele;

/**
 *
 * @author Nouar
 */
public class Parcours {
    

    private String intitule_parcours; 
  
  
 /**
     * Initialisation d'une UE
     * Si la valeur de credit_ue n'est pas 3 ou 6, on ne crée pas l'objet
     * @param id_parcours = numéro du parcours
     * @param intitule_parcours= intitulé du parcours
     * @param   id_mention = numéro de la mention 
     */


    public Parcours (String intitule_parcours) 
    {
       
        this.intitule_parcours = intitule_parcours;
        
    }

    public String getIntitule_parcours() {
        return intitule_parcours;
    }
    
      
}