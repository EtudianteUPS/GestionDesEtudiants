import fr.miage.toulouse.l3.gestiondesetudiants.view.Accueil;

/**
 * Runner object that load the code and start the application
 * @author FatimatouCisse
 */
public class Main {    
    /**
     * Main starter methode or entry point for the Java program
     * @param args unused
     */
    public static void main (String[] args)
    {             
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Accueil.getInstance().setVisible(true);
            }
        });        
    }
}
