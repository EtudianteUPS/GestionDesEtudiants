package fr.miage.toulouse.l3.gestiondesetudiants.exceptions;

/**
 *
 * @author SophiaNachin
 */
public class ValeurCreditErronee extends Exception {
    private int valeurErronee;
    
    /**
     * @param valeurErronee 
     */
    public ValeurCreditErronee(int valeurErronee){
        this.valeurErronee = valeurErronee;
    }
    
    @Override
    /**
     * @return le message d'erreur indiquant que la valeur des crédits ECTS n'est pas valabe
     */
    public String toString(){
        return "Valeur crédits ects " + this.valeurErronee + " non comprise entre 3 et 6";
    }
}
