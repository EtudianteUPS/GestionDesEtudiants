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
    
    private  int id_parcours;
    private String intitule_parcours; 
    private int id_mention;
  
 /**
     * Initialisation d'une UE
     * Si la valeur de credit_ue n'est pas 3 ou 6, on ne crée pas l'objet
     * @param id_parcours = numéro du parcours
     * @param intitule_parcours= intitulé du parcours
     * @param   id_mention = numéro de la mention 
     */


public Parcours (int id_parcours, String intitule_parcours , int id_mention) 
      {
        this.id_parcours = id_parcours;
        this.intitule_parcours = intitule_parcours;
        this. id_mention =  id_mention;
      }
    
      
      }