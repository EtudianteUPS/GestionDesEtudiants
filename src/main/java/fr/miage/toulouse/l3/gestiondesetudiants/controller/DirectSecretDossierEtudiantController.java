/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.l3.gestiondesetudiants.controller;

import fr.miage.toulouse.l3.gestiondesetudiants.modele.JTableEtudiants;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.ListeUeDisponibleCsv;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.ListeUeEnCoursCsv;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.ListeUeValideeCsv;
import fr.miage.toulouse.l3.gestiondesetudiants.view.DirectDossierEtudiant;
import fr.miage.toulouse.l3.gestiondesetudiants.view.SecretDossierEtudiant;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 * controler de la partie de l'application dédiée au directeur d'étude
 * @author SophiaNachin
 */
public class DirectSecretDossierEtudiantController  {
    String numEtudiant;
    DirectDossierEtudiant dde;
    SecretDossierEtudiant sde;
    private ListeUeEnCoursCsv myListEnCours;
    private ListeUeValideeCsv myListUeValidee;
    private ListeUeDisponibleCsv myListUeDispo;
    private Object[][] data;
    private String [] columnNamesEnCours = {"Code id de l'UE", "Nom UE", "Crédits ECTS"};
    private String[] columnNamesDispo={"Code id de l'UE", "Nom UE", "Crédits ECTS", "Mention", "Parcours"};
    private String[] columnNamesValidee={"Code id de l'UE", "Nom UE", "Crédits ECTS", "Mention", "Parcours"};
    private String[] columnNamesDispoSec={"Code id de l'UE", "Nom UE", "Crédits ECTS", "Mention", "Parcours", "Sélection"};
    DefaultTableModel tableModel;
    
    
    /**
     * On transmet le modèle etudiant, et la vue DirectDossierEtudiant 
    
     * @param dde 
     */
    public DirectSecretDossierEtudiantController(String numEtudiant,DirectDossierEtudiant dde){
        this.numEtudiant = numEtudiant;
        this.dde = dde;
        initViewD();
    }
   
    public DirectSecretDossierEtudiantController(String numEtudiant, SecretDossierEtudiant sde){
        this.numEtudiant = numEtudiant;
        this.sde = sde;
        initViewS();
    }
    
    /**
     * Initialisation de la vue à charger
     */
    private void initViewD(){
        myListEnCours = new ListeUeEnCoursCsv();
        myListUeDispo = new ListeUeDisponibleCsv();
        myListUeValidee = new ListeUeValideeCsv();
        
        String str = "donnees/"+this.numEtudiant+"_ListeUeEnCours.csv";
        myListEnCours.readFromCSV(str);
        data = myListEnCours.convert2Data();
        tableModel = new DefaultTableModel(data, columnNamesEnCours);
        dde.getUeEnCoursjTable().setModel(tableModel);
        
        str = "donnees/"+this.numEtudiant+"_ListeUeValidee.csv";
        myListUeValidee.readFromCSV(str);
        data = myListUeValidee.convert2Data();
        tableModel = new DefaultTableModel(data, columnNamesValidee);
        dde.getUeValideejTable().setModel(tableModel);
        
        str = "donnees/"+this.numEtudiant+"_ListeUeDisponible.csv";
        myListUeDispo.readFromCSV(str);
        data = myListUeDispo.convert2Data();
        tableModel = new DefaultTableModel(data, columnNamesDispo);
        dde.getUeDisponibleJTable().setModel(tableModel);
        

        /*int index = listeEtudiants.getJTable().getSelectedRow();
        String nom = model.getValueAt(index, 0).toString();
        String prenom = model.getValueAt(index, 1).toString();
        String numeroEt = model.getValueAt(index, 2).toString();
        String mention = model.getValueAt(index, 3).toString();
        String parcours = model.getValueAt(index, 4).toString();
        this.dde.getnumEtudiantLabel().setText(numeroEt);
        this.dde.getNomLabel().setText(nom);
        this.dde.getPrenomLabel().setText(prenom);
        this.dde.getMentionLabel().setText(mention);
        this.dde.getParcoursLabel().setText(parcours);*/
    }
    
    /**
     * Initialisation de la vue à charger
     */
    private void initViewS(){
        myListUeDispo = new ListeUeDisponibleCsv();

        String str = "donnees/"+this.numEtudiant+"_ListeUeDisponible.csv";
        myListUeDispo.readFromCSV(str);
        data = myListUeDispo.convert2Data();
        tableModel = new DefaultTableModel(data, columnNamesDispoSec);
        sde.getUeDisponibleJTable().setModel(tableModel);
    }
    
    public void initController(){
        /*this.dde.setVisible(true);
        this.sde.setVisible(true);*/
    }
}
