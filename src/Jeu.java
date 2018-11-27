import java.util.ArrayList;

public class Jeu {
    ArrayList<Joueur> listJoueur;

    public Jeu(int nbJoueur) {
        listJoueur = new ArrayList<Joueur>();
        for (int i=0; i<nbJoueur; i++) {
            int j = i+1;
            listJoueur.add(new Joueur(i+1,"joueur"+j));
        }
    }

    public ArrayList<Joueur> getListJoueur() {
        return listJoueur;
    }
}
