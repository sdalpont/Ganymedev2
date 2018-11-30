import javax.swing.*;
import java.awt.*;

public class TuileColon extends JButton {

    private EffetTuile effetTuile;
    private Couleur couleur;

    public TuileColon(EffetTuile effetTuile, Couleur couleur , String chemin){
        this.effetTuile = effetTuile;
        this.couleur = couleur;
        ImageIcon img = new ImageIcon(chemin);
        this.setIcon(img);
        setPreferredSize(new Dimension(100,60));
    }

    public EffetTuile getEffetTuile() {
        return effetTuile;
    }

    public void setEffetTuile(EffetTuile effetTuile) {
        this.effetTuile = effetTuile;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }
}
