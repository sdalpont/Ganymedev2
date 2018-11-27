import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class creationJoueur extends JFrame {
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

    private JButton valider = new JButton("Valider");

    private Menu menu = new Menu();

    public creationJoueur(String nbrJoueur){
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
                if(nbrJoueur=="1"){
                    Joueur nouvJ1 = new Joueur(1,j1.getText());
                    VueJoueur vue = new VueJoueur(nouvJ1, 1);


                }
                else if(nbrJoueur=="2"){
                    Joueur nouvJ1 = new Joueur(1,j1.getText());
                    Joueur nouvJ2 = new Joueur(2,j2.getText());
                    VueJoueur vue = new VueJoueur(nouvJ1,1);
                    VueJoueur vue2 = new VueJoueur(nouvJ2,2);
                }
                else if(nbrJoueur=="3"){
                    Joueur nouvJ1 = new Joueur(1,j1.getText());
                    Joueur nouvJ2 = new Joueur(2,j2.getText());
                    Joueur nouvJ3 = new Joueur(3,j3.getText());
                    VueJoueur vue = new VueJoueur(nouvJ1,1);
                    VueJoueur vue2 = new VueJoueur(nouvJ2,2);
                    VueJoueur vue3 = new VueJoueur(nouvJ3,3);
                }
                else if(nbrJoueur=="3"){
                    Joueur nouvJ1 = new Joueur(1,j1.getText());
                    Joueur nouvJ2 = new Joueur(2,j2.getText());
                    Joueur nouvJ3 = new Joueur(3,j3.getText());
                    Joueur nouvJ4 = new Joueur(4, j4.getText());
                    VueJoueur vue = new VueJoueur(nouvJ1,1);
                    VueJoueur vue2 = new VueJoueur(nouvJ2,2);
                    VueJoueur vue3 = new VueJoueur(nouvJ3,3);
                    VueJoueur vue4 = new VueJoueur(nouvJ2,4);

                }
            }
        });


        this.setContentPane(pan);

        setJMenuBar(menuBar);

        pan.add(valider);

        this.setContentPane(pan);

        setJMenuBar(menuBar);
    }

    class ItemState implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            System.out.println("ActionListener : action sur ");
        }
    }
}
