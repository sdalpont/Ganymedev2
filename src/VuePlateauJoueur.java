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

//    Joueur joueur;
    JLabel lname1, lname2, lptReputation1, lptReputation2, lptVictoire1, lptVictoire2, liconJoueur;
    Icon iconJoueur;
    private JButton augmenterScore = new JButton("Tirer carte");
    private JButton augmenterRep = new JButton("Augmenter reputation");
    private JButton laideReputation = new JButton("?");

    protected VuePlateauJoueur(Joueur joueur){

        creerWidget(joueur);
        ajouterWigetVersion();
        pack();
        setTitle("Plateau de "+joueur.getName());
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = (int)(tk.getScreenSize().getWidth()/2);
        int ySize = (int)(tk.getScreenSize().getHeight()/2);
        setSize(xSize,ySize/2);
        switch (joueur.getId()){
            case 1 : setLocation(0,ySize); break;
            case 2 : setLocation(xSize,ySize); break;
            case 3 : setLocation(0,ySize+ySize/2); break;
            case 4 : setLocation(xSize,ySize+ySize/2); break;
            default: setLocation(0,0); break;
        }
        setVisible(true);                                 // Affiche la fenetre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Gestion de la fermeture
    }

    private void creerWidget(Joueur joueur) {
        lname1 = new JLabel("Nom : ");
        lptReputation1 = new JLabel("Points de Réputation : ");
        lptVictoire1 = new JLabel("Points de Victoire : ");

        lname2 = new JLabel(String.valueOf(joueur.getName()));
        lptReputation2 = new JLabel(String.valueOf(joueur.getPointDeReputation()));
        lptVictoire2 = new JLabel(String.valueOf(joueur.getPointDeVictoires()));

        liconJoueur = new JLabel("Joueur "+joueur.getId());
        liconJoueur.setForeground(joueur.getCouleurJoueur(joueur.getId()));
    }

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

        JPanel pName = new JPanel();
        pName.add(lname1);
        pName.add(lname2);

        JPanel pPtReputation = new JPanel();
        pPtReputation.add(lptReputation1);
        pPtReputation.add(lptReputation2);

        JPanel pPtVictoire= new JPanel();
        pPtVictoire.add(lptVictoire1);
        pPtVictoire.add(lptVictoire2);

        JPanel pIconJoueur = new JPanel();
        pIconJoueur.add(liconJoueur);

        JPanel pAffichageJoueur = new JPanel();
        pAffichageJoueur.setLayout(new BoxLayout(pAffichageJoueur,BoxLayout.Y_AXIS));
        pAffichageJoueur.add(pIconJoueur);
        pAffichageJoueur.add(pName);
        pAffichageJoueur.add(pPtReputation);
        pAffichageJoueur.add(pPtVictoire);

        JPanel panAll = new JPanel();
        panAll.setPreferredSize(new Dimension(500,600));
        panAll.add(pAffichageJoueur);
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
