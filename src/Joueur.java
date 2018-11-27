public class Joueur{
    private int id;
    private String name;
    private int pointDeVictoires;
    private int pointDeReputation;

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
}
