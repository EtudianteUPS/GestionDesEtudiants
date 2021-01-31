/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.l3.gestiondesetudiants.modele;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author SophiaNachin
 */
public class UE {
    private String id_ue;
    private String nom_ue;
    private int credit_ue;
    private int id_mention;
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
    public UE(String id_ue, String nom_ue, int credit_ue, int id_mention, ArrayList<UE> prerequis_ue) throws ValeurCreditErronee{
        this(id_ue,nom_ue, credit_ue);
        this.id_mention = id_mention;
        this.prerequis_ue = prerequis_ue;
    }
    
    /**
     * @return les caractéristiques de l'ue et, si elle a des prerequis, la liste de ses prerequis
     */
    public String toString(){
        String str = "Code : " + this.id_ue + ", Libellé : " + this.nom_ue + ", crédit ECTS : " + this.credit_ue + ", code de la mention : " + this.id_mention + '\n';        
        if (this.prerequis_ue != null){
            str += "Liste des prérequis nécessaires pour valider l'UE : " + this.nom_ue + '\n';
            for (UE ue : this.prerequis_ue) {
                str += "   " + ue.toString();
            }
        }
        return str;
    }
}
