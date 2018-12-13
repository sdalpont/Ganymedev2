
import java.awt.*;

public class Plateau {

    Joueur joueur ;

    public Plateau(Joueur joueur){
        this.joueur = joueur ;
    }

    public String savePlateau(Plateau plateau){
       // Vue.
        return ("Le plateau a été sauvegardé pour le joueur"+plateau.joueur.getName()) ;
    }


}
