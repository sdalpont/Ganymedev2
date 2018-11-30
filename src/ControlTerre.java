import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlTerre extends Control1 implements ActionListener {

    public ControlTerre(Model model, Vue vue) {
        super(model, vue);
        vue.setButtonController3(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vue.getBoardTerreList().get(0)) {
            vue.getMainTerreList().add(vue.getBoardTerreList().get(0));
            CarteTerre Terre1 = vue.getBoardTerreList().get(0);
            vue.getCarteTerreList().remove(0);
            Terre1.setIcon(vue.getCarteTerreList().get(0).getIcon());
            Terre1.setActionTerre(vue.getCarteTerreList().get(0).getActionTerre());
            Terre1.setCouleur(vue.getCarteTerreList().get(0).getCouleur());
            Terre1.setDeplacementColonTerre(vue.getCarteTerreList().get(0).getDeplacementColonTerre());
        }

        else if (e.getSource() == vue.getBoardTerreList().get(1)) {
            vue.getMainTerreList().add(vue.getBoardTerreList().get(1));
            CarteTerre Terre1 = vue.getBoardTerreList().get(1);
            vue.getCarteTerreList().remove(0);
            Terre1.setIcon(vue.getCarteTerreList().get(0).getIcon());
            Terre1.setActionTerre(vue.getCarteTerreList().get(0).getActionTerre());
            Terre1.setCouleur(vue.getCarteTerreList().get(0).getCouleur());
            Terre1.setDeplacementColonTerre(vue.getCarteTerreList().get(0).getDeplacementColonTerre());
        }


        else if (e.getSource() == vue.getBoardTerreList().get(2)) {
            vue.getMainTerreList().add(vue.getBoardTerreList().get(2));
            CarteTerre Terre1 = vue.getBoardTerreList().get(2);
            vue.getCarteTerreList().remove(0);
            Terre1.setIcon(vue.getCarteTerreList().get(0).getIcon());
            Terre1.setActionTerre(vue.getCarteTerreList().get(0).getActionTerre());
            Terre1.setCouleur(vue.getCarteTerreList().get(0).getCouleur());
            Terre1.setDeplacementColonTerre(vue.getCarteTerreList().get(0).getDeplacementColonTerre());
        }

        else if (e.getSource() == vue.getBoardTerreList().get(3)) {
            vue.getMainTerreList().add(vue.getBoardTerreList().get(3));
            CarteTerre Terre1 = vue.getBoardTerreList().get(3);
            vue.getCarteTerreList().remove(0);
            Terre1.setIcon(vue.getCarteTerreList().get(0).getIcon());
            Terre1.setActionTerre(vue.getCarteTerreList().get(0).getActionTerre());
            Terre1.setCouleur(vue.getCarteTerreList().get(0).getCouleur());
            Terre1.setDeplacementColonTerre(vue.getCarteTerreList().get(0).getDeplacementColonTerre());
        }
    }
}
