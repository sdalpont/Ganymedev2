import javax.swing.*;
import java.awt.*;

public class CarteVaisseauColon extends JButton {


    private Effet effet;



    public CarteVaisseauColon(String chemin, Effet ef){
        ImageIcon img = new ImageIcon(chemin);
        this.setIcon(img);
        this.effet = ef;
        setPreferredSize(new Dimension(75,50));

    }

    public Effet getEffet() {
        return effet;
    }

    public void setEffet(Effet effet) {
        this.effet = effet;
    }

}
