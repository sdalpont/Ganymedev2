import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Menu extends JFrame {
    private JMenuBar menuBar = new JMenuBar();
    private JMenu option = new JMenu("Option");
    private JMenu aide = new JMenu("Aide");
    private JPanel pan = new JPanel();

    String[] nbrJ = {"1","2","3","4"};
    JComboBox nbrJoueur = new JComboBox(nbrJ);
    private JLabel labelJoueur = new JLabel("Nombre de Joueur");
    int joueur = 0;

    private JLabel Joueur2 = new JLabel("Joueur 2");
    private JLabel Joueur3 = new JLabel("Joueur 3");
    private JLabel Joueur4 = new JLabel("Joueur 4");
    private JLabel Joueur1 = new JLabel("Joueur 1");
    private JTextArea j1 = new JTextArea(2,25);
    private JTextArea j2 = new JTextArea(2,25);
    private JTextArea j3 = new JTextArea(2,25);
    private JTextArea j4 = new JTextArea(2,25);


    private JButton valider = new JButton("Valider");


    public Menu(){
        CardLayout cardL = new CardLayout();
        JPanel content = new JPanel();
        setSize(400,300);
        setTitle("Ganymère");
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        this.setContentPane(new Panneau());

        //ajout barre d'outil
        menuBar.add(option);
        menuBar.add(aide);

        nbrJoueur.addItemListener(new ItemState());
        valider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(nbrJoueur.getSelectedItem().toString() == "1"){

                    creationJoueur creat = new creationJoueur("1");
                    creat.setVisible(true);
                    System.out.println("1 joueur");
                }
                if(nbrJoueur.getSelectedItem().toString() == "2"){

                    creationJoueur creat = new creationJoueur("2");
                    creat.setVisible(true);
                    System.out.println("2 joueur");
                }
                if(nbrJoueur.getSelectedItem().toString() == "3"){
                    creationJoueur creat = new creationJoueur("3");
                    creat.setVisible(true);
                    System.out.println("3 joueur");
                }
                if(nbrJoueur.getSelectedItem().toString() == "4"){
                    creationJoueur creat = new creationJoueur("4");
                    creat.setVisible(true);
                    System.out.println("4 joueur");
                }

            }
        });

        //ajout des bouton

        pan.add(nbrJoueur);
        pan.add(labelJoueur);
        pan.add(valider);
        this.setContentPane(pan);

        setJMenuBar(menuBar);

    }

    class ItemState implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            System.out.println("ActionListener : action sur " + nbrJoueur.getSelectedItem());
        }
    }

}
