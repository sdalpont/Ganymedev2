import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlMars extends Control1 implements ActionListener {


    public ControlMars(Model model, Vue vue){
        super(model,vue);
        vue.setButtonController2(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vue.getBoardMarsList().get(0)) {
            vue.getMainMarsList().add(vue.getBoardMarsList().get(0));
            CarteMars mars1 = vue.getBoardMarsList().get(0);
            vue.getCarteMarsList().remove(0);
            mars1.setIcon(vue.getCarteMarsList().get(0).getIcon());
            mars1.setActionMars(vue.getCarteMarsList().get(0).getActionMars());
            mars1.setCouleur(vue.getCarteMarsList().get(0).getCouleur());
            mars1.setDeplacementColonMars(vue.getCarteMarsList().get(0).getDeplacementColonMars());
        }

        else if (e.getSource() == vue.getBoardMarsList().get(1)) {
            vue.getMainMarsList().add(vue.getBoardMarsList().get(1));
            CarteMars mars1 = vue.getBoardMarsList().get(1);
            vue.getCarteMarsList().remove(0);
            mars1.setIcon(vue.getCarteMarsList().get(0).getIcon());
            mars1.setActionMars(vue.getCarteMarsList().get(0).getActionMars());
            mars1.setCouleur(vue.getCarteMarsList().get(0).getCouleur());
            mars1.setDeplacementColonMars(vue.getCarteMarsList().get(0).getDeplacementColonMars());
        }


        else if (e.getSource() == vue.getBoardMarsList().get(2)) {
            vue.getMainMarsList().add(vue.getBoardMarsList().get(2));
            CarteMars mars1 = vue.getBoardMarsList().get(2);
            vue.getCarteMarsList().remove(0);
            mars1.setIcon(vue.getCarteMarsList().get(0).getIcon());
            mars1.setActionMars(vue.getCarteMarsList().get(0).getActionMars());
            mars1.setCouleur(vue.getCarteMarsList().get(0).getCouleur());
            mars1.setDeplacementColonMars(vue.getCarteMarsList().get(0).getDeplacementColonMars());
        }

        else if (e.getSource() == vue.getBoardMarsList().get(3)) {
            vue.getMainMarsList().add(vue.getBoardMarsList().get(3));
            CarteMars mars1 = vue.getBoardMarsList().get(3);
            vue.getCarteMarsList().remove(0);
            mars1.setIcon(vue.getCarteMarsList().get(0).getIcon());
            mars1.setActionMars(vue.getCarteMarsList().get(0).getActionMars());
            mars1.setCouleur(vue.getCarteMarsList().get(0).getCouleur());
            mars1.setDeplacementColonMars(vue.getCarteMarsList().get(0).getDeplacementColonMars());
        }
    }
}
