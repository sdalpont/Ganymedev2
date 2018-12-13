import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlMars extends Control1 implements ActionListener {


    public ControlMars(Model model, Vue vue, VuePlateauJoueur vuePlateauJoueur){
        super(model,vue,vuePlateauJoueur);
        vue.setButtonController2(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (vue.getCarteMarsList().size() > 1) {
            if (e.getSource() == vue.getBoardMarsList().get(0)) {

                vue.getMainMarsList().add(vue.getBoardMarsList().get(0));
                CarteMars Mars1 = vue.getBoardMarsList().get(0);
                vue.getCarteMarsList().remove(0);
                Mars1.setIcon(vue.getCarteMarsList().get(0).getIcon());
                Mars1.setActionMars(vue.getCarteMarsList().get(0).getActionMars());
                Mars1.setCouleur(vue.getCarteMarsList().get(0).getCouleur());
                Mars1.setDeplacementColonMars(vue.getCarteMarsList().get(0).getDeplacementColonMars());


                System.out.println("bouton1");
                System.out.println(vue.getCarteMarsList().get(0).getCouleur());
                System.out.println(vue.getCarteMarsList().size());
                System.out.println(vue.getMainMarsList().get(vue.getMainMarsList().size() - 1).getCouleur());

            } else if (e.getSource() == vue.getBoardMarsList().get(1)) {
                vue.getMainMarsList().add(vue.getBoardMarsList().get(1));
                CarteMars Mars1 = vue.getBoardMarsList().get(1);
                vue.getCarteMarsList().remove(0);
                Mars1.setIcon(vue.getCarteMarsList().get(0).getIcon());
                Mars1.setActionMars(vue.getCarteMarsList().get(0).getActionMars());
                Mars1.setCouleur(vue.getCarteMarsList().get(0).getCouleur());
                Mars1.setDeplacementColonMars(vue.getCarteMarsList().get(0).getDeplacementColonMars());
                System.out.println("bouton2");

            } else if (e.getSource() == vue.getBoardMarsList().get(2)) {
                vue.getMainMarsList().add(vue.getBoardMarsList().get(2));
                CarteMars Mars1 = vue.getBoardMarsList().get(2);
                vue.getCarteMarsList().remove(0);
                Mars1.setIcon(vue.getCarteMarsList().get(0).getIcon());
                Mars1.setActionMars(vue.getCarteMarsList().get(0).getActionMars());
                Mars1.setCouleur(vue.getCarteMarsList().get(0).getCouleur());
                Mars1.setDeplacementColonMars(vue.getCarteMarsList().get(0).getDeplacementColonMars());
                System.out.println("bouton3");

            } else if (e.getSource() == vue.getBoardMarsList().get(3)) {
                vue.getMainMarsList().add(vue.getBoardMarsList().get(3));
                CarteMars Mars1 = vue.getBoardMarsList().get(3);
                vue.getCarteMarsList().remove(0);
                Mars1.setIcon(vue.getCarteMarsList().get(0).getIcon());
                Mars1.setActionMars(vue.getCarteMarsList().get(0).getActionMars());
                Mars1.setCouleur(vue.getCarteMarsList().get(0).getCouleur());
                Mars1.setDeplacementColonMars(vue.getCarteMarsList().get(0).getDeplacementColonMars());
                System.out.println("bouton4");
            }
        } else {

            if (e.getSource() == vue.getBoardMarsList().get(0)) {
                if (vue.getCarteMarsList().size() == 0
                        && vue.getBoardMarsList().get(1).getCouleur() == null
                        && vue.getBoardMarsList().get(2).getCouleur() == null
                        && vue.getBoardMarsList().get(3).getCouleur() == null) {
                    CarteMars Mars1 = vue.getBoardMarsList().get(0);
                    vue.getMainMarsList().add(Mars1);
                    Mars1.setIcon(null);
                    Mars1.setActionMars(null);
                    Mars1.setCouleur(null);
                    Mars1.setDeplacementColonMars(null);
                    model.finDePartie(vue);
                }
                if (vue.getCarteMarsList().size() == 0 && vue.getBoardMarsList().get(0).getCouleur() == null) {
                    vue.creerDialogInfMars("vous ne pouvez plus tirer de carte Mars sur ce bouton");

                } else {
                    CarteMars Mars1 = vue.getBoardMarsList().get(0);
                    if (vue.getCarteMarsList().size() != 0) {
                        vue.getCarteMarsList().remove(0);
                        vue.getMainMarsList().add(Mars1);
                        Mars1.setIcon(null);
                        Mars1.setActionMars(null);
                        Mars1.setCouleur(null);
                        Mars1.setDeplacementColonMars(null);
                    } else {
                        vue.getMainMarsList().add(Mars1);
                        Mars1.setIcon(null);
                        Mars1.setActionMars(null);
                        Mars1.setCouleur(null);
                        Mars1.setDeplacementColonMars(null);
                    }
                }
            }
            System.out.println(vue.getCarteMarsList().size());

            if (e.getSource() == vue.getBoardMarsList().get(1)) {
                if (vue.getCarteMarsList().size() == 0
                        && vue.getBoardMarsList().get(0).getCouleur() == null
                        && vue.getBoardMarsList().get(2).getCouleur() == null
                        && vue.getBoardMarsList().get(3).getCouleur() == null) {
                    CarteMars Mars1 = vue.getBoardMarsList().get(1);
                    vue.getMainMarsList().add(Mars1);
                    Mars1.setIcon(null);
                    Mars1.setActionMars(null);
                    Mars1.setCouleur(null);
                    Mars1.setDeplacementColonMars(null);
                    model.finDePartie(vue);
                    model.finDePartie(vue);
                }
                if (vue.getCarteMarsList().size() == 0 && vue.getBoardMarsList().get(1).getCouleur() == null) {
                    vue.creerDialogInfMars("vous ne pouvez plus tirer de carte Mars sur ce bouton");
                } else {
                    CarteMars Mars1 = vue.getBoardMarsList().get(1);
                    if (vue.getCarteMarsList().size() != 0) {
                        vue.getCarteMarsList().remove(0);
                        vue.getMainMarsList().add(Mars1);
                        Mars1.setIcon(null);
                        Mars1.setActionMars(null);
                        Mars1.setCouleur(null);
                        Mars1.setDeplacementColonMars(null);
                    } else {
                        vue.getMainMarsList().add(Mars1);
                        Mars1.setIcon(null);
                        Mars1.setActionMars(null);
                        Mars1.setCouleur(null);
                        Mars1.setDeplacementColonMars(null);
                    }
                }
            } else if (e.getSource() == vue.getBoardMarsList().get(2)) {
                if (vue.getCarteMarsList().size() == 0
                        && vue.getBoardMarsList().get(0).getCouleur() == null
                        && vue.getBoardMarsList().get(1).getCouleur() == null
                        && vue.getBoardMarsList().get(3).getCouleur() == null) {
                    CarteMars Mars1 = vue.getBoardMarsList().get(2);
                    vue.getMainMarsList().add(Mars1);
                    Mars1.setIcon(null);
                    Mars1.setActionMars(null);
                    Mars1.setCouleur(null);
                    Mars1.setDeplacementColonMars(null);
                    model.finDePartie(vue);
                    model.finDePartie(vue);
                }
                if (vue.getCarteMarsList().size() == 0 && vue.getBoardMarsList().get(2).getCouleur() == null) {
                    vue.creerDialogInfMars("vous ne pouvez plus tirer de carte Mars sur ce bouton");
                } else {
                    CarteMars Mars1 = vue.getBoardMarsList().get(2);
                    if (vue.getCarteMarsList().size() != 0) {

                        vue.getCarteMarsList().remove(0);
                        vue.getMainMarsList().add(Mars1);
                        Mars1.setIcon(null);
                        Mars1.setActionMars(null);
                        Mars1.setCouleur(null);
                        Mars1.setDeplacementColonMars(null);
                    } else {
                        vue.getMainMarsList().add(Mars1);
                        Mars1.setIcon(null);
                        Mars1.setActionMars(null);
                        Mars1.setCouleur(null);
                        Mars1.setDeplacementColonMars(null);
                    }
                }

            } else if (e.getSource() == vue.getBoardMarsList().get(3)) {
                if (vue.getCarteMarsList().size() == 0
                        && vue.getBoardMarsList().get(0).getCouleur() == null
                        && vue.getBoardMarsList().get(1).getCouleur() == null
                        && vue.getBoardMarsList().get(2).getCouleur() == null) {
                    CarteMars Mars1 = vue.getBoardMarsList().get(3);
                    vue.getMainMarsList().add(Mars1);
                    Mars1.setIcon(null);
                    Mars1.setActionMars(null);
                    Mars1.setCouleur(null);
                    Mars1.setDeplacementColonMars(null);
                    model.finDePartie(vue);
                }
                if (vue.getCarteMarsList().size() == 0 && vue.getBoardMarsList().get(3).getCouleur() == null) {
                    vue.creerDialogInfMars("vous ne pouvez plus tirer de carte Mars sur ce bouton");
                } else {
                    CarteMars Mars1 = vue.getBoardMarsList().get(3);
                    if (vue.getCarteMarsList().size() != 0) {

                        vue.getCarteMarsList().remove(0);
                        vue.getMainMarsList().add(Mars1);
                        Mars1.setIcon(null);
                        Mars1.setActionMars(null);
                        Mars1.setCouleur(null);
                        Mars1.setDeplacementColonMars(null);
                    } else {
                        vue.getMainMarsList().add(Mars1);
                        Mars1.setIcon(null);
                        Mars1.setActionMars(null);
                        Mars1.setCouleur(null);
                        Mars1.setDeplacementColonMars(null);
                    }
                }
            }
        }
    }
}

