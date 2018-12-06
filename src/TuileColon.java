import javax.swing.*;
import java.awt.*;

public class TuileColon extends JButton {

    private EffetTuile effetTuile;
    private Couleur couleur;

    Toolkit tk = Toolkit.getDefaultToolkit();
    int xSize = ((int) tk.getScreenSize().getWidth());
    int ySize = ((int) tk.getScreenSize().getHeight());

    public TuileColon(EffetTuile effetTuile, Couleur couleur , String chemin){
        this.effetTuile = effetTuile;
        this.couleur = couleur;
        ImageIcon img = new ImageIcon(chemin);
        this.setIcon(img);
        setPreferredSize(new Dimension(xSize/5,xSize/15));
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
