import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control1VaisseauColon extends Control1 implements ActionListener {

    public Control1VaisseauColon(Model model, Vue vue){
        super(model,vue);
        vue.setButtonController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (vue.getCarteVaisseauColonList().size() > 1) {
            if (e.getSource() == vue.getBoardVaisseauColonList().get(0)) {

                vue.getMainVaisseauColonList().add(vue.getBoardVaisseauColonList().get(0));
                CarteVaisseauColon VaisseauColon1 = vue.getBoardVaisseauColonList().get(0);
                vue.getCarteVaisseauColonList().remove(0);
                VaisseauColon1.setIcon(vue.getCarteVaisseauColonList().get(0).getIcon());
                VaisseauColon1.setEffet(vue.getCarteVaisseauColonList().get(0).getEffet());

                System.out.println("bouton1");
                System.out.println(vue.getCarteVaisseauColonList().get(0).getEffet());
                System.out.println(vue.getCarteVaisseauColonList().size());
                System.out.println(vue.getMainVaisseauColonList().get(vue.getMainVaisseauColonList().size() - 1).getEffet());

            }
            if (e.getSource() == vue.getBoardVaisseauColonList().get(1)) {

                vue.getMainVaisseauColonList().add(vue.getBoardVaisseauColonList().get(1));
                CarteVaisseauColon VaisseauColon1 = vue.getBoardVaisseauColonList().get(1);
                vue.getCarteVaisseauColonList().remove(0);
                VaisseauColon1.setIcon(vue.getCarteVaisseauColonList().get(0).getIcon());
                VaisseauColon1.setEffet(vue.getCarteVaisseauColonList().get(0).getEffet());
                System.out.println("bouton2");

            } else if (e.getSource() == vue.getBoardVaisseauColonList().get(2)) {
                vue.getMainVaisseauColonList().add(vue.getBoardVaisseauColonList().get(2));
                CarteVaisseauColon VaisseauColon1 = vue.getBoardVaisseauColonList().get(2);
                vue.getCarteVaisseauColonList().remove(0);
                VaisseauColon1.setIcon(vue.getCarteVaisseauColonList().get(0).getIcon());
                VaisseauColon1.setEffet(vue.getCarteVaisseauColonList().get(0).getEffet());
                System.out.println("bouton3");

            } else if (e.getSource() == vue.getBoardVaisseauColonList().get(3)) {
                vue.getMainVaisseauColonList().add(vue.getBoardVaisseauColonList().get(3));
                CarteVaisseauColon VaisseauColon1 = vue.getBoardVaisseauColonList().get(3);
                vue.getCarteVaisseauColonList().remove(0);
                VaisseauColon1.setIcon(vue.getCarteVaisseauColonList().get(0).getIcon());
                VaisseauColon1.setEffet(vue.getCarteVaisseauColonList().get(0).getEffet());
                System.out.println("bouton4");
            }
        } else {

            if (e.getSource() == vue.getBoardVaisseauColonList().get(0)) {
                if (vue.getCarteVaisseauColonList().size() == 0
                        && vue.getBoardVaisseauColonList().get(1).getEffet() == null
                        && vue.getBoardVaisseauColonList().get(2).getEffet() == null ){
                    CarteVaisseauColon VaisseauColon1 = vue.getBoardVaisseauColonList().get(0);
                    vue.getMainVaisseauColonList().add(VaisseauColon1);
                    VaisseauColon1.setIcon(null);
                    VaisseauColon1.setEffet(null);
                    model.finDePartie(vue);
                }
                if (vue.getCarteVaisseauColonList().size() == 0 && vue.getBoardVaisseauColonList().get(0).getEffet() == null) {
                    vue.creerDialogInfVaisseauColon("vous ne pouvez plus tirer de carte VaisseauColon sur ce bouton");

                } else {
                    CarteVaisseauColon VaisseauColon1 = vue.getBoardVaisseauColonList().get(0);
                    if (vue.getCarteVaisseauColonList().size() != 0) {
                        vue.getCarteVaisseauColonList().remove(0);
                        vue.getMainVaisseauColonList().add(VaisseauColon1);
                        VaisseauColon1.setIcon(null);
                        VaisseauColon1.setEffet(null);
                    } else {
                        vue.getMainVaisseauColonList().add(VaisseauColon1);
                        VaisseauColon1.setIcon(null);
                        VaisseauColon1.setEffet(null);
                    }
                }
            }
            System.out.println(vue.getCarteVaisseauColonList().size());

            if (e.getSource() == vue.getBoardVaisseauColonList().get(1)) {
                if (vue.getCarteVaisseauColonList().size() == 0
                        && vue.getBoardVaisseauColonList().get(0).getEffet() == null
                        && vue.getBoardVaisseauColonList().get(2).getEffet() == null) {
                    CarteVaisseauColon VaisseauColon1 = vue.getBoardVaisseauColonList().get(1);
                    vue.getMainVaisseauColonList().add(VaisseauColon1);
                    VaisseauColon1.setIcon(null);
                    VaisseauColon1.setEffet(null);
                    model.finDePartie(vue);
                    model.finDePartie(vue);
                }
                if (vue.getCarteVaisseauColonList().size() == 0 && vue.getBoardVaisseauColonList().get(1).getEffet() == null) {
                    vue.creerDialogInfVaisseauColon("vous ne pouvez plus tirer de carte VaisseauColon sur ce bouton");
                } else {
                    CarteVaisseauColon VaisseauColon1 = vue.getBoardVaisseauColonList().get(1);
                    if (vue.getCarteVaisseauColonList().size() != 0) {
                        vue.getCarteVaisseauColonList().remove(0);
                        vue.getMainVaisseauColonList().add(VaisseauColon1);
                        VaisseauColon1.setIcon(null);
                        VaisseauColon1.setEffet(null);
                    } else {
                        vue.getMainVaisseauColonList().add(VaisseauColon1);
                        VaisseauColon1.setIcon(null);
                        VaisseauColon1.setEffet(null);
                    }
                }
            } else if (e.getSource() == vue.getBoardVaisseauColonList().get(2)) {
                if (vue.getCarteVaisseauColonList().size() == 0
                        && vue.getBoardVaisseauColonList().get(0).getEffet() == null
                        && vue.getBoardVaisseauColonList().get(1).getEffet() == null) {
                    CarteVaisseauColon VaisseauColon1 = vue.getBoardVaisseauColonList().get(2);
                    vue.getMainVaisseauColonList().add(VaisseauColon1);
                    VaisseauColon1.setIcon(null);
                    VaisseauColon1.setEffet(null);
                    model.finDePartie(vue);
                    model.finDePartie(vue);
                }
                if (vue.getCarteVaisseauColonList().size() == 0 && vue.getBoardVaisseauColonList().get(2).getEffet() == null) {
                    vue.creerDialogInfVaisseauColon("vous ne pouvez plus tirer de carte VaisseauColon sur ce bouton");
                } else {
                    CarteVaisseauColon VaisseauColon1 = vue.getBoardVaisseauColonList().get(2);
                    if (vue.getCarteVaisseauColonList().size() != 0) {

                        vue.getCarteVaisseauColonList().remove(0);
                        vue.getMainVaisseauColonList().add(VaisseauColon1);
                        VaisseauColon1.setIcon(null);
                        VaisseauColon1.setEffet(null);
                    } else {
                        vue.getMainVaisseauColonList().add(VaisseauColon1);
                        VaisseauColon1.setIcon(null);
                        VaisseauColon1.setEffet(null);
                    }
                }
            }
        }
    }
}

