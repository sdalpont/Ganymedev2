import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control1VaisseauColon extends Control1 implements ActionListener {

    public Control1VaisseauColon(Model model, Vue vue){
        super(model,vue);
        vue.setButtonController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == vue.getBoardVaisseauColon().get(0)&& vue.getMainVaisseauColon().size() < 4) {
            vue.getMainVaisseauColon().add(vue.getBoardVaisseauColon().get(0));
            CarteVaisseauColon vaisseau1 = vue.getBoardVaisseauColon().get(0);
            vue.getVaisseauColonList().remove(0);
            vaisseau1.setIcon(vue.getVaisseauColonList().get(0).getIcon());
            vaisseau1.setEffet(vue.getVaisseauColonList().get(0).getEffet());
        }

        else if (e.getSource() == vue.getBoardVaisseauColon().get(1)&&vue.getMainVaisseauColon().size() < 4) {
            vue.getMainVaisseauColon().add(vue.getBoardVaisseauColon().get(1));
            CarteVaisseauColon vaisseau1 = vue.getBoardVaisseauColon().get(1);
            vue.getVaisseauColonList().remove(0);
            vaisseau1.setIcon(vue.getVaisseauColonList().get(0).getIcon());
            vaisseau1.setEffet(vue.getVaisseauColonList().get(0).getEffet());
        }


        else if (e.getSource() == vue.getBoardVaisseauColon().get(2)&&vue.getMainVaisseauColon().size() < 4) {
            vue.getMainVaisseauColon().add(vue.getBoardVaisseauColon().get(2));
            CarteVaisseauColon vaisseau1 = vue.getBoardVaisseauColon().get(2);
            vue.getVaisseauColonList().remove(0);
            vaisseau1.setIcon(vue.getVaisseauColonList().get(0).getIcon());
            vaisseau1.setEffet(vue.getVaisseauColonList().get(0).getEffet());
        }
        else{
            System.out.println("vous ne pouver plus prendre de vaisseau colon votre main est pleine");
        }
    }
}

