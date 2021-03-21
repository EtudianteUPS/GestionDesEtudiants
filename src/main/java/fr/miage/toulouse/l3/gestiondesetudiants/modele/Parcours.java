package fr.miage.toulouse.l3.gestiondesetudiants.modele;

/**
 *
 * @author Nouar
 */
public class Parcours {
    private String intituleParcours; 
  
 /**
     * Initialisation d'une UE
     * Si la valeur de credit_ue n'est pas 3 ou 6, on ne crée pas l'objet
     * @param id_parcours = numéro du parcours
     * @param intituleParcours= intitulé du parcours
     * @param   id_mention = numéro de la mention 
     */


    public Parcours (String intituleParcours) 
    {
       
        this.intituleParcours = intituleParcours;
        
    }

    public String getIntituleParcours() {
        return intituleParcours;
    }
    
      
}