package fr.miage.toulouse.l3.gestiondesetudiants.outils;

import fr.miage.toulouse.l3.gestiondesetudiants.view.Accueil;
import fr.miage.toulouse.l3.gestiondesetudiants.view.Principal;

/**
 *
 * @author SophiaNachin
 */
public class AfficherPanel {
    private static int ancienPanel = -1; // accueil
    private int role = -1;
    private static AfficherPanel instance;
    
    /**
     * Singleton qui retourne l'instance 
     * @return instance
     */
    public synchronized static AfficherPanel getInstance(){
        if (instance == null){
            instance = new AfficherPanel();
        }
        return instance;
    }
    
    /**
     * Constructeur privé
     */
    private AfficherPanel(){
        super();
    }
    
    /**
     * Affichage d'un panel en fonction du rôle
     * @param role 
     */
    public void setPanel(int role){
        this.role = role;

        Principal p = Principal.getInstance();
        Accueil acc = Accueil.getInstance();
        
        //removing panel
        p.getjLayeredPane1().removeAll();
        p.getjLayeredPane1().repaint();
        p.getjLayeredPane1().revalidate();
        
        //adding panel
        switch(role){
            case -3 : p.dispose(); acc.setVisible(true); break; //(-2 et -3 n'existe pas mais on en besoin pour savoir quel bouton (directeur ou secrétaria) est cliqué )
            case -2 : p.dispose(); acc.setVisible(true); break;
            case -1 : p.dispose(); acc.setVisible(true); break;
            case 0 : p.getjLayeredPane1().add(p.getSecretJTableEtudiantsPanel1()); this.setAncienPanel(-2); break; //Directeur | ListeEtudiants 
            case 1 : p.getjLayeredPane1().add(p.getSecretJTableEtudiantsPanel1()); this.setAncienPanel(-3); break; //Secrétaire | ListeEtudiants
            case 2 : p.getjLayeredPane1().add(p.getBureauExamenListeUEPanel1()); this.setAncienPanel(-1); break; //Bureau des examens | ListeUe
            case 3 : p.getjLayeredPane1().add(p.getDirectDossierEtudiantPanel1()); this.setAncienPanel(0); break; //Directeur | DossierEtudiant
            case 4 : p.getjLayeredPane1().add(p.getSecretDossierEtudiantPanel1()); this.setAncienPanel(1); break; //Secrétaire | DossierEtudiant
            default : throw new IllegalArgumentException();
        }
        
        if (role > -1){
            p.getjLayeredPane1().repaint(); 
            p.getjLayeredPane1().revalidate(); 
            p.setVisible(true); 
            acc.dispose();
        }
    }
    
    private void setAncienPanel(int a){
        this.ancienPanel = a;
    }
    
    public int getAncienPanel(){
        return this.ancienPanel;
    }
}
