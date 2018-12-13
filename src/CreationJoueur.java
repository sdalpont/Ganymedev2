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

    Joueur nouvJ1 ;
    Joueur nouvJ2;
    Joueur nouvJ3 ;
    Joueur nouvJ4;

    Model model = new Model();
    Vue vue = new Vue(model);

    private JButton valider = new JButton("Valider");

    private Menu menu = new Menu();

    public CreationJoueur(String nbrJoueur){
        vue.setVisible(false);
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
                    vue.setVisible(true);
                    Joueur nouvJ1 = new Joueur(1,j1.getText());
                    Joueur nouvJ2 = new Joueur(2,j2.getText());

                    vue.joueurList.add(nouvJ1);
                    vue.joueurList.add(nouvJ2);

                    VuePlateauJoueur vuePlateauJoueur1 = new VuePlateauJoueur(nouvJ1);
                    VuePlateauJoueur vuePlateauJoueur2 = new VuePlateauJoueur(nouvJ2);

                    ControlTerre terre = new ControlTerre(model,vue,vuePlateauJoueur1);
                    ControlTerre terre1 = new ControlTerre(model,vue,vuePlateauJoueur2);

                    ControlMars mars = new ControlMars(model,vue,vuePlateauJoueur1);
                    ControlMars mars1 = new ControlMars(model,vue,vuePlateauJoueur2);

                    Control1TuileColon tuile = new Control1TuileColon(model,vue,vuePlateauJoueur1);
                    Control1TuileColon tuile2 = new Control1TuileColon(model,vue,vuePlateauJoueur2);

                    Control1VaisseauColon control1VaisseauColon = new Control1VaisseauColon(model,vue,vuePlateauJoueur1);
                    Control1VaisseauColon control1VaisseauColon2 = new Control1VaisseauColon(model,vue,vuePlateauJoueur2);

                }
                else if(nbrJoueur=="3"){
                    vue.setVisible(true);
                    nouvJ1 = new Joueur(1,j1.getText());
                    nouvJ2 = new Joueur(2, j2.getText());
                    nouvJ3 = new Joueur(3,j3.getText());

                   vue.joueurList.add(nouvJ1);
                   vue.joueurList.add(nouvJ2);
                   vue.joueurList.add(nouvJ3);

                    VuePlateauJoueur vuePlateauJoueur1 = new VuePlateauJoueur(nouvJ1);
                    VuePlateauJoueur vuePlateauJoueur2 = new VuePlateauJoueur(nouvJ2);
                    VuePlateauJoueur vuePlateauJoueur3 = new VuePlateauJoueur(nouvJ3);

                    ControlTerre terre1 = new ControlTerre(model,vue,vuePlateauJoueur1);
                    ControlTerre terre2 = new ControlTerre(model,vue,vuePlateauJoueur2);
                    ControlTerre terre3 = new ControlTerre(model,vue,vuePlateauJoueur3);

                    ControlMars mars1 = new ControlMars(model,vue,vuePlateauJoueur1);
                    ControlMars mars2 = new ControlMars(model,vue,vuePlateauJoueur2);
                    ControlMars mars3 = new ControlMars(model,vue,vuePlateauJoueur3);

                    Control1TuileColon tuile1 = new Control1TuileColon(model,vue,vuePlateauJoueur1);
                    Control1TuileColon tuile2 = new Control1TuileColon(model,vue,vuePlateauJoueur2);
                    Control1TuileColon tuile3 = new Control1TuileColon(model,vue,vuePlateauJoueur3);

                    Control1VaisseauColon control1VaisseauColon1 = new Control1VaisseauColon(model,vue,vuePlateauJoueur1);
                    Control1VaisseauColon control1VaisseauColon2 = new Control1VaisseauColon(model,vue,vuePlateauJoueur2);
                    Control1VaisseauColon control1VaisseauColon3 = new Control1VaisseauColon(model,vue,vuePlateauJoueur3);

                }
                else if(nbrJoueur=="4"){
                    vue.setVisible(true);
                    Joueur nouvJ1 = new Joueur(1,j1.getText());
                    Joueur nouvJ2 = new Joueur(2,j2.getText());
                    Joueur nouvJ3 = new Joueur(3,j3.getText());
                    Joueur nouvJ4 = new Joueur(4,j4.getText());

                    vue.joueurList.add(nouvJ1);
                    vue.joueurList.add(nouvJ2);
                    vue.joueurList.add(nouvJ3);
                    vue.joueurList.add(nouvJ4);

                    VuePlateauJoueur vuePlateauJoueur1 = new VuePlateauJoueur(nouvJ1);
                    VuePlateauJoueur vuePlateauJoueur2 = new VuePlateauJoueur(nouvJ2);
                    VuePlateauJoueur vuePlateauJoueur3 = new VuePlateauJoueur(nouvJ3);
                    VuePlateauJoueur vuePlateauJoueur4 = new VuePlateauJoueur(nouvJ4);

                    ControlTerre terre1 = new ControlTerre(model,vue,vuePlateauJoueur1);
                    ControlTerre terre2 = new ControlTerre(model,vue,vuePlateauJoueur2);
                    ControlTerre terre3 = new ControlTerre(model,vue,vuePlateauJoueur3);
                    ControlTerre terre4 = new ControlTerre(model,vue,vuePlateauJoueur4);

                    ControlMars mars1 = new ControlMars(model,vue,vuePlateauJoueur1);
                    ControlMars mars2 = new ControlMars(model,vue,vuePlateauJoueur2);
                    ControlMars mars3 = new ControlMars(model,vue,vuePlateauJoueur3);
                    ControlMars mars4 = new ControlMars(model,vue,vuePlateauJoueur4);

                    Control1TuileColon tuile1 = new Control1TuileColon(model,vue,vuePlateauJoueur1);
                    Control1TuileColon tuile2 = new Control1TuileColon(model,vue,vuePlateauJoueur2);
                    Control1TuileColon tuile3 = new Control1TuileColon(model,vue,vuePlateauJoueur3);
                    Control1TuileColon tuile4 = new Control1TuileColon(model,vue,vuePlateauJoueur4);

                    Control1VaisseauColon control1VaisseauColon1 = new Control1VaisseauColon(model,vue,vuePlateauJoueur1);
                    Control1VaisseauColon control1VaisseauColon2 = new Control1VaisseauColon(model,vue,vuePlateauJoueur2);
                    Control1VaisseauColon control1VaisseauColon3 = new Control1VaisseauColon(model,vue,vuePlateauJoueur3);
                    Control1VaisseauColon control1VaisseauColon4 = new Control1VaisseauColon(model,vue,vuePlateauJoueur4);

                }
                dispose();
            }
        });


        this.setContentPane(pan);

        setJMenuBar(menuBar);

        pan.add(valider);

    }

    public Joueur getJoueur1(){return nouvJ1 ;}
    public Joueur getJoueur2(){return nouvJ2 ;}
    public Joueur getJoueur3(){return nouvJ3 ;}
    public Joueur getJoueur4(){return nouvJ4 ;}



    class ItemState implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            System.out.println("ActionListener : action sur ");
        }
    }

}
