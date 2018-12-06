import javax.swing.*;
import java.awt.*;

public class CarteVaisseauColon extends JButton {


    private Effet effet;
    Toolkit tk = Toolkit.getDefaultToolkit();
    int xSize = ((int) tk.getScreenSize().getWidth());
    int ySize = ((int) tk.getScreenSize().getHeight());


    public CarteVaisseauColon(String chemin, Effet ef){
        ImageIcon img = new ImageIcon(chemin);
        this.setIcon(img);
        this.effet = ef;
        setPreferredSize(new Dimension(xSize/4,ySize/15));
        setBorder(null);

    }

    public Effet getEffet() {
        return effet;
    }

    public void setEffet(Effet effet) {
        this.effet = effet;
    }

}
