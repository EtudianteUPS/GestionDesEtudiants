package fr.miage.toulouse.l3.gestiondesetudiants.services;

import fr.miage.toulouse.l3.gestiondesetudiants.modele.UE;
import fr.miage.toulouse.l3.gestiondesetudiants.outils.CSVReader;
import java.util.ArrayList;

/**
 *
 * @author SophiaNachin
 */
public class UEService {
    private ArrayList<UE> listeUe;
    //private List<IView> views = new ArrayList<>();
    private static UEService instance;
    
    /**
     * Singleton qui retourne l'instance 
     * @return instance
     */
    public synchronized static UEService getInstance(){
        if (instance == null){
            instance = new UEService();
        }
        return instance;
    }
    
    /**
     * Constructeur privé
     */
    private UEService(){
        super();
    }
    
    /**
     * Récupère les UEs
     * @return listeUe
     */
    public synchronized ArrayList<UE> findUEs(String chemin){
        //chargerDepuisCsv();
        /*if (this.listeUe!=null){
            return this.listeUe;
        }*/
        this.listeUe=new ArrayList<UE>();

        new CSVReader().readUeFromCSV(chemin, this.listeUe);

        return this.listeUe;
    }
    
    /**
     * Si la liste n'est pas vide alors il n'est pas nécessaire de charger les données
     * Sinon, on charge les données avec la méthode readFromCSV
     */
    /*private void chargerDepuisCsv(){
        
    }*/
    
    
    public void setListeUe(ArrayList<UE> liste){
        this.listeUe = liste;
        //notifyViews();
    }
    
    /*public void addUe(String id, String nomUe, int credit) {
        try {
            UE ue;
            ue = new UE(id, nomUe, credit);
            this.listeUe.add(ue);
        } catch (ValeurCreditErronee ex) {
            Logger.getLogger(UEService.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }*/
    
    /*
    public void addView(IView v){
        views.add(v);
        v.notify(listeUe);
    }

    public void removeView(IView v){
        views.remove(v);
    }

    public void notifyViews(){
        for (IView v:views){
            v.notify(listeUe);
        }
    }
    */
}
