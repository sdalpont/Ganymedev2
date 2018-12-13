import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreationJoueur extends JFrame {
    private JMenuBar menuBar = new JMenuBar();
    private JMenu option = new JMenu("Option");
    private JMenu aide = new JMenu("Aide");
    private JPanel pan = new JPanel();
    JLabel Joueur2 = new JLabel("Joueur 2");
    JLabel Joueur3 = new JLabel("Joueur 3");
    JLabel Joueur4 = new JLabel("Joueur 4");
    JLabel Joueur1 = new JLabel("Joueur 1");
    JTextArea j1 = new JTextArea(2,25);
    JTextArea j2 = new JTextArea(2,25);
    JTextArea j3 = new JTextArea(2,25);
    JTextArea j4 = new JTextArea(2,25);

    Model model = new Model();

    private JButton valider = new JButton("Valider");

    private Menu menu = new Menu();

    public CreationJoueur(String nbrJoueur){
        CardLayout cardL = new CardLayout();
        JPanel content = new JPanel();
        setSize(400,300);
        setTitle("Ganymère");
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //ajout barre d'outil
        menuBar.add(option);
        menuBar.add(aide);

        if(nbrJoueur == "1"){

            pan.add(Joueur1);
            pan.add(j1);

        }

        else if(nbrJoueur=="2"){

            pan.add(Joueur1);
            pan.add(j1);
            pan.add(Joueur2);
            pan.add(j2);

        }

        else if(nbrJoueur=="3"){

            pan.add(Joueur1);
            pan.add(j1);
            pan.add(Joueur2);
            pan.add(j2);
            pan.add(Joueur3);
            pan.add(j3);
        }

        else if(nbrJoueur=="4"){

            pan.add(Joueur1);
            pan.add(j1);
            pan.add(Joueur2);
            pan.add(j2);
            pan.add(Joueur3);
            pan.add(j3);
            pan.add(Joueur4);
            pan.add(j4);

        }
        valider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(nbrJoueur=="2"){
                    Joueur nouvJ1 = new Joueur(1,j1.getText());
                    Joueur nouvJ2 = new Joueur(2,j2.getText());
                    Vue vue = new Vue(model);
                    VuePlateauJoueur vuePlateauJoueur1 = new VuePlateauJoueur();
                    VuePlateauJoueur vuePlateauJoueur2 = new VuePlateauJoueur();
                    ControlTerre terre = new ControlTerre(model,vue,vuePlateauJoueur1);
                    ControlTerre terre1 = new ControlTerre(model,vue,vuePlateauJoueur2);
                    ControlMars mars = new ControlMars(model,vue,vuePlateauJoueur1);
                    ControlMars mars1 = new ControlMars(model,vue,vuePlateauJoueur2);
                    Control1TuileColon tuile = new Control1TuileColon(model,vue,vuePlateauJoueur1);
                    Control1TuileColon tuile2 = new Control1TuileColon(model,vue,vuePlateauJoueur2);
                    Control1VaisseauColon control1VaisseauColon = new Control1VaisseauColon(model,vue,vuePlateauJoueur1);
                    Control1VaisseauColon control1VaisseauColon2 = new Control1VaisseauColon(model,vue,vuePlateauJoueur2);



                }/*
                else if(nbrJoueur=="3"){
                    Joueur nouvJ1 = new Joueur(1,j1.getText());
                    Joueur nouvJ2 = new Joueur(2,j2.getText());
                    Joueur nouvJ3 = new Joueur(3,j3.getText());
                    Vue vue = new Vue(model);
                    Vue vue2 = new Vue(model);
                    Vue vue3 = new Vue(model);

                    ControlTerre terre = new ControlTerre(model,vue,v);
                    ControlTerre terre1 = new ControlTerre(model,vue2);
                    ControlMars mars = new ControlMars(model,vue);
                    ControlMars mars1 = new ControlMars(model,vue2);

                    Control1TuileColon tuile = new Control1TuileColon(model,vue);
                    Control1TuileColon tuile2 = new Control1TuileColon(model,vue2);
                    Control1VaisseauColon control1VaisseauColon = new Control1VaisseauColon(model,vue);
                    Control1VaisseauColon control1VaisseauColon2 = new Control1VaisseauColon(model,vue2);

                }
                else if(nbrJoueur=="3"){
                    Joueur nouvJ1 = new Joueur(1,j1.getText());
                    Joueur nouvJ2 = new Joueur(2,j2.getText());
                    Joueur nouvJ3 = new Joueur(3,j3.getText());
                    Joueur nouvJ4 = new Joueur(4, j4.getText());
                    Vue vue = new Vue(model);
                    Vue vue2 = new Vue(model);
                    Vue vue3 = new Vue(model);
                    Vue vue4 = new Vue(model);

                    ControlTerre terre = new ControlTerre(model,vue);
                    ControlTerre terre1 = new ControlTerre(model,vue2);
                    ControlMars mars = new ControlMars(model,vue);
                    ControlMars mars1 = new ControlMars(model,vue2);

                    Control1TuileColon tuile = new Control1TuileColon(model,vue);
                    Control1TuileColon tuile2 = new Control1TuileColon(model,vue2);
                    Control1VaisseauColon control1VaisseauColon = new Control1VaisseauColon(model,vue);
                    Control1VaisseauColon control1VaisseauColon2 = new Control1VaisseauColon(model,vue2);

                }*/
                dispose();
            }
        });


        this.setContentPane(pan);

        setJMenuBar(menuBar);

        pan.add(valider);

    }

    class ItemState implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            System.out.println("ActionListener : action sur ");
        }
    }
}
