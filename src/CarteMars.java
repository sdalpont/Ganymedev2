import javax.swing.*;
import java.awt.*;

public class CarteMars extends JButton {

    private Couleur couleur;
    private DeplacementColonMars deplacementColonMars;
    private ActionMars actionMars;

    public CarteMars(String chemin , ActionMars actionMars, DeplacementColonMars deplacementColonMars, Couleur couleur){
        this.couleur = couleur;
        this.deplacementColonMars = deplacementColonMars;
        this.actionMars = actionMars;
        ImageIcon img = new ImageIcon(chemin);
        this.setIcon(img);
        setPreferredSize(new Dimension(50,75));
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public DeplacementColonMars getDeplacementColonMars() {
        return deplacementColonMars;
    }

    public void setDeplacementColonMars(DeplacementColonMars deplacementColonMars) {
        this.deplacementColonMars = deplacementColonMars;
    }

    public ActionMars getActionMars() {
        return actionMars;
    }

    public void setActionMars(ActionMars actionMars) {
        this.actionMars = actionMars;
    }
}
