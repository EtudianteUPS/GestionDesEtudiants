package fr.miage.toulouse.l3.gestiondesetudiants.view;

import fr.miage.toulouse.l3.gestiondesetudiants.modele.Mention;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.Parcours;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.UE;
import java.util.ArrayList;

/**
 *
 * @author racim
 */
public interface IView {
    void notify(String numEt, String nom, String prenom, Mention mention, Parcours parcours);
    
    void notify(String[] columnNames, ArrayList<UE> listeUe);
}
