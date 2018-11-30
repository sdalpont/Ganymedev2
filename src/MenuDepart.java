import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDepart extends JFrame {
    private ImageIcon menu;
    private JLabel image;
    private JButton jouer;
    private JPanel menuTout;

    public MenuDepart(){
        initAttribut();
        creerVue();
        setSize(500,500);
        setTitle("Ganymède");
        setResizable(false);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display();
    }

    public void initAttribut() {

        menu=new ImageIcon("src/ganymede.jpeg");
        image=new JLabel(menu);

        jouer=new JButton("Jouer");
    }

    public void creerVue(){
        menuTout=new JPanel();
        menuTout.add(image);
        menuTout.add(jouer);
        setContentPane(menuTout);
        jouer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu menu=new Menu();
                menu.setVisible(true);

                MenuDepart menu1=new MenuDepart();
                menu1.dispose();


            }
        });


    }

    public void display() {
        setVisible(true);
    }

}
