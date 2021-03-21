package fr.miage.toulouse.l3.gestiondesetudiants.outils;

import fr.miage.toulouse.l3.gestiondesetudiants.modele.UE;
import java.util.ArrayList;

/**
 *
 * @author SophiaNachin
 */
public class ConvertList2Data {
    
    public Object[][] convertList2Data(int taille, ArrayList<UE> liste) {
        Object[][] data = new Object[liste.size()][taille];
        for (int i = 0; i < liste.size(); i++) {
            if (taille == 3){
                data[i][0] = liste.get(i).getId_Ue();
                data[i][1] = liste.get(i).getNom_Ue();
                data[i][2] = liste.get(i).getCredit_Ue();
            }
            else{
                data[i][0] = liste.get(i).getId_Ue();
                
                data[i][1] = liste.get(i).getNom_Ue();
                
                data[i][2] = liste.get(i).getCredit_Ue();
                
                data[i][3] = liste.get(i).getMention().getIntituleMention();
                data[i][4] = liste.get(i).getParcours().getIntituleParcours();
            }
          
       }
       return data;
   }
}
