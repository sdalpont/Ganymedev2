import java.awt.*;
import java.util.ArrayList;


public class Joueur{
    int id;
    String name;
    int pointDeVictoires;
    int pointDeReputation;
    Color couleurJoueur;
    int nbrAction ;



    public Joueur(int id, String name) {
        this.id = id;
        this.name = name;
        nbrAction = 1;
        pointDeVictoires = 0;
        pointDeReputation = 0;

    }

    public int augmenterPoint(Joueur j){
        j.pointDeVictoires +=1;
        return j.pointDeVictoires ;
    }

    public int augmenterRep(Joueur j){
        j.pointDeReputation +=1;
        return j.pointDeReputation ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPointDeVictoires() {
        return pointDeVictoires;
    }

    public void setPointDeVictoires(int pointDeVictoires) {
        this.pointDeVictoires = pointDeVictoires;
    }

    public int getPointDeReputation() {
        return pointDeReputation;
    }

    public void setPointDeReputation(int pointDeReputation) {
        this.pointDeReputation = pointDeReputation;
    }

    public Color getCouleurJoueur(int id) {
        switch (id){
            /*jaune rouge bleu vert*/
            case 1 : couleurJoueur = Color.YELLOW; break;
            case 2 : couleurJoueur = Color.RED; break;
            case 3 : couleurJoueur = Color.BLUE; break;
            case 4 : couleurJoueur = Color.GREEN; break;
            default: couleurJoueur = Color.BLACK; break;
        }
        return couleurJoueur;
    }

    public int getNbrAction(){return nbrAction;}

    public void setNbrAction(int nbrAction){this.nbrAction = nbrAction ;}
}
