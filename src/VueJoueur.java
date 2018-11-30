import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class VueJoueur extends JFrame{
    Joueur joueur;
    JLabel lname1, lname2, lptReputation1, lptReputation2, lptVictoire1, lptVictoire2, liconJoueur;
    Icon iconJoueur;

    private JButton augmenterScore = new JButton("Tirer carte");

    public VueJoueur(Joueur joueur, int nbJoueur){
        this.joueur = joueur;
        initAttribut();
        creerVue();
        setLocation(10*nbJoueur,10);



        // titre, icon, position initiale et non redimensionable
        setTitle("Jeu");
//        setLocation(10,10);
        setResizable(false);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display();
    }


    public void initAttribut() {
        lname1 = new JLabel("Nom : ");
        lptReputation1 = new JLabel("Points de Réputation : ");
        lptVictoire1 = new JLabel("Points de Victoire : ");

        lname2 = new JLabel(String.valueOf(joueur.getName()));
        lptReputation2 = new JLabel(String.valueOf(joueur.getPointDeReputation()));
        lptVictoire2 = new JLabel(String.valueOf(joueur.getPointDeVictoires()));

        iconJoueur = new ImageIcon(new ImageIcon("Joueur1.jpg").getImage().getScaledInstance(80,80, Image.SCALE_DEFAULT));

        liconJoueur = new JLabel("Joueur");
        //liconJoueur.setIcon(iconJoueur);
        liconJoueur.setForeground(Color.blue);
    }

    public void creerVue(){

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



        JPanel pAffichage = new JPanel();
        pAffichage.setLayout(new BoxLayout(pAffichage,BoxLayout.Y_AXIS));
//        pAffichage.setLayout(new GridLayout(1,3,10,10));
//        pAffichage.setBorder(BorderFactory.createEmptyBorder(5,10,5,10));
        pAffichage.add(pIconJoueur);
        pAffichage.add(pName);
        pAffichage.add(pPtReputation);
        pAffichage.add(pPtVictoire);

        JPanel pBox = new JPanel();
        pBox.add(pAffichage);
        pBox.add(augmenterScore);
        augmenterScore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               lptVictoire2.setText(""+joueur.augmenterPoint(joueur));
            }
        });

        setContentPane(pBox);
    }


    public void display() {
        setVisible(true);
    }

    public void undisplay() {
        setVisible(false);
    }

}
