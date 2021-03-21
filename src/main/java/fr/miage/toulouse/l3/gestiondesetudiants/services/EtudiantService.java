package fr.miage.toulouse.l3.gestiondesetudiants.services;
import fr.miage.toulouse.l3.gestiondesetudiants.outils.CSVReader;
import fr.miage.toulouse.l3.gestiondesetudiants.modele.Etudiant;
import java.util.ArrayList;

/**
 *
 * @author SophiaNachin
 */
public class EtudiantService {
    private ArrayList<Etudiant> listeEtudiant;
    //private List<IView> views = new ArrayList<>();
    private static EtudiantService instance;
    
    /**
     * Singleton qui retourne l'instance 
     * @return instance
     */
    public synchronized static EtudiantService getInstance(){
        if (instance == null){
            instance = new EtudiantService();
        }
        return instance;
    }
    
    /**
     * Constructeur privé
     */
    private EtudiantService(){
        super();
    }
    
    /**
     * Récupère les étudiants
     * @return listeUe
     */
    public synchronized ArrayList<Etudiant> findEtudiants(){
        chargerDepuisCsv();
        
        return this.listeEtudiant;
    }
    
    /**
     * Si la liste n'est pas vide alors il n'est pas nécessaire de charger les données
     * Sinon, on charge les données avec la méthode readFromCSV
     */
    private void chargerDepuisCsv(){
        if (this.listeEtudiant!=null){
            return;
        }
        this.listeEtudiant=new ArrayList<Etudiant>();
        
        new CSVReader().readEtudiantFromCSV("donnees/data.csv", this.listeEtudiant);
    }
    
    
    public void setListeEtudiant(ArrayList<Etudiant> liste){
        this.listeEtudiant = liste;
        //notifyViews();
    }

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
    }*/
}
