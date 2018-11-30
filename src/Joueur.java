import java.awt.*;

public class Joueur{
    private int id;
    private String name;
    private int pointDeVictoires;
    private int pointDeReputation;
    private Color couleurJoueur;

    public Joueur(int id, String name) {
        this.id = id;
        this.name = name;
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
            case 0 : couleurJoueur = Color.YELLOW; break;
            case 1 : couleurJoueur = Color.RED; break;
            case 2 : couleurJoueur = Color.BLUE; break;
            case 3 : couleurJoueur = Color.GREEN; break;
            default: couleurJoueur = Color.BLACK;break;
        }
        return couleurJoueur;
    }
}
