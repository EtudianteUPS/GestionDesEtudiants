/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.l3.gestiondesetudiants.modele;

/**
 *
 * @author SophiaNachin
 */
public class UEOuverture extends UE{
    public UEOuverture(String id_ue, String nom_ue, int credit_ue) throws ValeurCreditErronee{
        super(id_ue, nom_ue, credit_ue);
    } 
}
