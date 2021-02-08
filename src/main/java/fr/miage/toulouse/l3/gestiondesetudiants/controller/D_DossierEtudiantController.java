/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.l3.gestiondesetudiants.controller;

import fr.miage.toulouse.l3.gestiondesetudiants.modele.JTableEtudiants;
import fr.miage.toulouse.l3.gestiondesetudiants.view.D_DossierEtudiant;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
/**
 * controler de la partie de l'application dédiée au directeur d'étude
 * @author SophiaNachin
 */
public class D_DossierEtudiantController  {
    TableModel model;
    D_DossierEtudiant dde;
    JTableEtudiants listeEtudiants;
    
    /**
     * On transmet le modèle etudiant, et la vue D_DossierEtudiant 
     * @param e
     * @param 
     * @param dde 
     */
    public D_DossierEtudiantController(TableModel model,JTableEtudiants listeEtudiants , D_DossierEtudiant dde){
        this.model = model;
        this.listeEtudiants = listeEtudiants;
        this.dde = dde;
        initView();
    }
   
    /**
     * Initialisation de la vue à charger
     */
    private void initView(){
        int index = listeEtudiants.getJTable().getSelectedRow();
        String nom = model.getValueAt(index, 0).toString();
        String prenom = model.getValueAt(index, 1).toString();
        String numeroEt = model.getValueAt(index, 2).toString();
        String mention = model.getValueAt(index, 3).toString();
        String parcours = model.getValueAt(index, 4).toString();
        this.dde.getnumEtudiantLabel().setText(numeroEt);
        this.dde.getNomLabel().setText(nom);
        this.dde.getPrenomLabel().setText(prenom);
        this.dde.getMentionLabel().setText(mention);
        this.dde.getParcoursLabel().setText(parcours);
    }
    
   
}
