package fr.miage.toulouse.l3.gestiondesetudiants.modele;

import fr.miage.toulouse.l3.gestiondesetudiants.view.IView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FatimatouCisse
 */

public class Etudiant {
    private String nom;
    private String prenom;
    private String numeroEt;
    private Mention mention;
    private Parcours parcours;
    
    private List<IView> etudiantViews = new ArrayList<>();
    private static Etudiant instance;
    
    public static Etudiant getInstance(){
        if (instance == null){
            instance = new Etudiant();
        }
        return instance;
    }

    public Etudiant(String n, String p, String numEt, Mention mention, Parcours parcours) {
        nom = n.trim();
        prenom = p.trim();
        numeroEt = numEt.trim();
        this.mention = mention;
        this.parcours = parcours;
        //notifyViews();
    }

    private Etudiant() {
        this.nom = "";
        this.prenom = "";
        this.numeroEt = "";
        this.mention = new Mention("null");
        this.parcours = new Parcours("null");
    }
    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
        notifyViews();
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
        notifyViews();
    }

    public String getNumeroEt() {
        return numeroEt;
    }

    public void setNumeroEt(String numeroEt) {
        this.numeroEt = numeroEt;
        notifyViews();
    }

    public Mention getMention() {
        return mention;
    }
    
    public void setMention(Mention mention) {
        this.mention = mention;
        notifyViews();
    }

    public Parcours getParcours() {
        return parcours;
    }
    
    public void setParcours(Parcours parcours) {
        this.parcours = parcours;
        notifyViews();
    }
    
    
    public void addView(IView v){
        etudiantViews.add(v);
        v.notify(this.numeroEt, this.nom, this.prenom, this.mention, this.parcours);
    }

    public void removeView(IView v){
        etudiantViews.remove(v);
    }

    public void notifyViews(){
        for (IView v:etudiantViews){
            v.notify(this.numeroEt, this.nom, this.prenom, this.mention, this.parcours);
        }
    }
}
