import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VuePlateauJoueur extends JFrame {

    private CarteVaisseauColon carteVaisseauColon1;
    private CarteVaisseauColon carteVaisseauColon2;
//    Vue vue;

    protected VuePlateauJoueur(){

        creerWidget();
        ajouterWigetVersion();
        pack();
        setTitle("Plateau Joueur");
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = (int)(tk.getScreenSize().getWidth());
        int ySize = (int)(tk.getScreenSize().getHeight()/2);
        setSize(xSize,ySize);
        setLocation(0,ySize);
        setVisible(true);                                 // Affiche la fenetre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Gestion de la fermeture
    }

    private void creerWidget() {}

    private void ajouterWigetVersion() {
        JButton colon = new JButton();
        JButton colon1 = new JButton();
        JButton colon2 = new JButton();

        JPanel colonGrid = new JPanel();
        colonGrid.setPreferredSize(new Dimension(150,150));
        colonGrid.add(colon);
        colonGrid.add(colon1);
        colonGrid.add(colon2);
        colonGrid.setLayout(new GridLayout(3,1));


        JButton mars = new JButton("mars");
        mars.setPreferredSize(new Dimension(100,150));
        JButton terre = new JButton("terre");
        terre.setPreferredSize(new Dimension(100,150));
        carteVaisseauColon1 = new CarteVaisseauColon(null,null);
        carteVaisseauColon1.setPreferredSize(new Dimension(100,150));
        carteVaisseauColon2 = new CarteVaisseauColon(null,null);
        carteVaisseauColon2.setPreferredSize(new Dimension(100,150));

        JPanel plateau = new JPanel();
        plateau.add(colonGrid);

        plateau.add(mars);
        plateau.add(terre);
        plateau.add(carteVaisseauColon1);
        plateau.add(carteVaisseauColon2);

        JPanel panAll = new JPanel();
        panAll.setPreferredSize(new Dimension(500,600));
        panAll.add(plateau);
        setContentPane(panAll);
    }
    public void setCarteVaisseauColon1(CarteVaisseauColon carteVaisseauColon1) {
        this.carteVaisseauColon1 = carteVaisseauColon1;
    }

    public CarteVaisseauColon getCarteVaisseauColon1() {
        return carteVaisseauColon1;
    }

    public CarteVaisseauColon getCarteVaisseauColon2() {
        return carteVaisseauColon2;
    }

    public void setCarteVaisseauColon2(CarteVaisseauColon carteVaisseauColon2) {
        this.carteVaisseauColon2 = carteVaisseauColon2;
    }
}
