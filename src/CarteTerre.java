import javax.swing.*;
import java.awt.*;

public class CarteTerre extends JButton {
    private ActionTerre actionTerre;
    private DeplacementColonTerre deplacementColonTerre;
    private Couleur couleur;

    public CarteTerre(String chemin, ActionTerre actionTerre, DeplacementColonTerre deplacementColonTerre, Couleur couleur){
        this.actionTerre = actionTerre;
        this.deplacementColonTerre = deplacementColonTerre;
        this.couleur = couleur;
        ImageIcon img = new ImageIcon(chemin);
        this.setIcon(img);
        setPreferredSize(new Dimension(50,75));
    }


    public ActionTerre getActionTerre() {
        return actionTerre;
    }

    public void setActionTerre(ActionTerre actionTerre) {
        this.actionTerre = actionTerre;
    }

    public DeplacementColonTerre getDeplacementColonTerre() {
        return deplacementColonTerre;
    }

    public void setDeplacementColonTerre(DeplacementColonTerre deplacementColonTerre) {
        this.deplacementColonTerre = deplacementColonTerre;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }
}
