import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlTerre extends Control1 implements ActionListener {

    public ControlTerre(Model model, Vue vue) {
        super(model, vue);
        vue.setButtonController3(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (vue.getCarteTerreList().size() > 1) {
            if (e.getSource() == vue.getBoardTerreList().get(0)) {

                vue.getMainTerreList().add(vue.getBoardTerreList().get(0));
                CarteTerre Terre1 = vue.getBoardTerreList().get(0);
                vue.getCarteTerreList().remove(0);
                Terre1.setIcon(vue.getCarteTerreList().get(0).getIcon());
                Terre1.setActionTerre(vue.getCarteTerreList().get(0).getActionTerre());
                Terre1.setCouleur(vue.getCarteTerreList().get(0).getCouleur());
                Terre1.setDeplacementColonTerre(vue.getCarteTerreList().get(0).getDeplacementColonTerre());

                System.out.println("bouton1");
                System.out.println(vue.getCarteTerreList().get(0).getCouleur());
                System.out.println(vue.getCarteTerreList().size());
                System.out.println(vue.getMainTerreList().get(vue.getMainTerreList().size() - 1).getCouleur());

            }
            if (e.getSource() == vue.getBoardTerreList().get(1)) {

                vue.getMainTerreList().add(vue.getBoardTerreList().get(1));
                CarteTerre Terre1 = vue.getBoardTerreList().get(1);
                vue.getCarteTerreList().remove(0);
                Terre1.setIcon(vue.getCarteTerreList().get(0).getIcon());
                Terre1.setActionTerre(vue.getCarteTerreList().get(0).getActionTerre());
                Terre1.setCouleur(vue.getCarteTerreList().get(0).getCouleur());
                Terre1.setDeplacementColonTerre(vue.getCarteTerreList().get(0).getDeplacementColonTerre());
                System.out.println("bouton2");

            } else if (e.getSource() == vue.getBoardTerreList().get(2)) {
                vue.getMainTerreList().add(vue.getBoardTerreList().get(2));
                CarteTerre Terre1 = vue.getBoardTerreList().get(2);
                vue.getCarteTerreList().remove(0);
                Terre1.setIcon(vue.getCarteTerreList().get(0).getIcon());
                Terre1.setActionTerre(vue.getCarteTerreList().get(0).getActionTerre());
                Terre1.setCouleur(vue.getCarteTerreList().get(0).getCouleur());
                Terre1.setDeplacementColonTerre(vue.getCarteTerreList().get(0).getDeplacementColonTerre());
                System.out.println("bouton3");

            } else if (e.getSource() == vue.getBoardTerreList().get(3)) {
                vue.getMainTerreList().add(vue.getBoardTerreList().get(3));
                CarteTerre Terre1 = vue.getBoardTerreList().get(3);
                vue.getCarteTerreList().remove(0);
                Terre1.setIcon(vue.getCarteTerreList().get(0).getIcon());
                Terre1.setActionTerre(vue.getCarteTerreList().get(0).getActionTerre());
                Terre1.setCouleur(vue.getCarteTerreList().get(0).getCouleur());
                Terre1.setDeplacementColonTerre(vue.getCarteTerreList().get(0).getDeplacementColonTerre());
                System.out.println("bouton4");
            }
        } else {

            if (e.getSource() == vue.getBoardTerreList().get(0)) {
                if (vue.getCarteTerreList().size() == 0
                        && vue.getBoardTerreList().get(1).getCouleur() == null
                        && vue.getBoardTerreList().get(2).getCouleur() == null
                        && vue.getBoardTerreList().get(3).getCouleur() == null) {
                    CarteTerre Terre1 = vue.getBoardTerreList().get(0);
                    vue.getMainTerreList().add(Terre1);
                    Terre1.setIcon(null);
                    Terre1.setActionTerre(null);
                    Terre1.setCouleur(null);
                    Terre1.setDeplacementColonTerre(null);
                    model.finDePartie(vue);
                }
                if (vue.getCarteTerreList().size() == 0 && vue.getBoardTerreList().get(0).getCouleur() == null) {
                    vue.creerDialogInfTerre("vous ne pouvez plus tirer de carte Terre sur ce bouton");

                } else {
                    CarteTerre Terre1 = vue.getBoardTerreList().get(0);
                    if (vue.getCarteTerreList().size() != 0) {
                        vue.getCarteTerreList().remove(0);
                        vue.getMainTerreList().add(Terre1);
                        Terre1.setIcon(null);
                        Terre1.setActionTerre(null);
                        Terre1.setCouleur(null);
                        Terre1.setDeplacementColonTerre(null);
                    } else {
                        vue.getMainTerreList().add(Terre1);
                        Terre1.setIcon(null);
                        Terre1.setActionTerre(null);
                        Terre1.setCouleur(null);
                        Terre1.setDeplacementColonTerre(null);
                    }
                }
            }
            System.out.println(vue.getCarteTerreList().size());

            if (e.getSource() == vue.getBoardTerreList().get(1)) {
                if (vue.getCarteTerreList().size() == 0
                        && vue.getBoardTerreList().get(0).getCouleur() == null
                        && vue.getBoardTerreList().get(2).getCouleur() == null
                        && vue.getBoardTerreList().get(3).getCouleur() == null) {
                    CarteTerre Terre1 = vue.getBoardTerreList().get(1);
                    vue.getMainTerreList().add(Terre1);
                    Terre1.setIcon(null);
                    Terre1.setActionTerre(null);
                    Terre1.setCouleur(null);
                    Terre1.setDeplacementColonTerre(null);
                    model.finDePartie(vue);
                    model.finDePartie(vue);
                }
                if (vue.getCarteTerreList().size() == 0 && vue.getBoardTerreList().get(1).getCouleur() == null) {
                    vue.creerDialogInfTerre("vous ne pouvez plus tirer de carte Terre sur ce bouton");
                } else {
                    CarteTerre Terre1 = vue.getBoardTerreList().get(1);
                    if (vue.getCarteTerreList().size() != 0) {
                        vue.getCarteTerreList().remove(0);
                        vue.getMainTerreList().add(Terre1);
                        Terre1.setIcon(null);
                        Terre1.setActionTerre(null);
                        Terre1.setCouleur(null);
                        Terre1.setDeplacementColonTerre(null);
                    } else {
                        vue.getMainTerreList().add(Terre1);
                        Terre1.setIcon(null);
                        Terre1.setActionTerre(null);
                        Terre1.setCouleur(null);
                        Terre1.setDeplacementColonTerre(null);
                    }
                }
            } else if (e.getSource() == vue.getBoardTerreList().get(2)) {
                if (vue.getCarteTerreList().size() == 0
                        && vue.getBoardTerreList().get(0).getCouleur() == null
                        && vue.getBoardTerreList().get(1).getCouleur() == null
                        && vue.getBoardTerreList().get(3).getCouleur() == null) {
                    CarteTerre Terre1 = vue.getBoardTerreList().get(2);
                    vue.getMainTerreList().add(Terre1);
                    Terre1.setIcon(null);
                    Terre1.setActionTerre(null);
                    Terre1.setCouleur(null);
                    Terre1.setDeplacementColonTerre(null);
                    model.finDePartie(vue);
                    model.finDePartie(vue);
                }
                if (vue.getCarteTerreList().size() == 0 && vue.getBoardTerreList().get(2).getCouleur() == null) {
                    vue.creerDialogInfTerre("vous ne pouvez plus tirer de carte Terre sur ce bouton");
                } else {
                    CarteTerre Terre1 = vue.getBoardTerreList().get(2);
                    if (vue.getCarteTerreList().size() != 0) {

                        vue.getCarteTerreList().remove(0);
                        vue.getMainTerreList().add(Terre1);
                        Terre1.setIcon(null);
                        Terre1.setActionTerre(null);
                        Terre1.setCouleur(null);
                        Terre1.setDeplacementColonTerre(null);
                    } else {
                        vue.getMainTerreList().add(Terre1);
                        Terre1.setIcon(null);
                        Terre1.setActionTerre(null);
                        Terre1.setCouleur(null);
                        Terre1.setDeplacementColonTerre(null);
                    }
                }

            } else if (e.getSource() == vue.getBoardTerreList().get(3)) {
                if (vue.getCarteTerreList().size() == 0
                        && vue.getBoardTerreList().get(0).getCouleur() == null
                        && vue.getBoardTerreList().get(1).getCouleur() == null
                        && vue.getBoardTerreList().get(2).getCouleur() == null) {
                    CarteTerre Terre1 = vue.getBoardTerreList().get(3);
                    vue.getMainTerreList().add(Terre1);
                    Terre1.setIcon(null);
                    Terre1.setActionTerre(null);
                    Terre1.setCouleur(null);
                    Terre1.setDeplacementColonTerre(null);
                    model.finDePartie(vue);
                }
                if (vue.getCarteTerreList().size() == 0 && vue.getBoardTerreList().get(3).getCouleur() == null) {
                    vue.creerDialogInfTerre("vous ne pouvez plus tirer de carte Terre sur ce bouton");
                } else {
                    CarteTerre Terre1 = vue.getBoardTerreList().get(3);
                    if (vue.getCarteTerreList().size() != 0) {

                        vue.getCarteTerreList().remove(0);
                        vue.getMainTerreList().add(Terre1);
                        Terre1.setIcon(null);
                        Terre1.setActionTerre(null);
                        Terre1.setCouleur(null);
                        Terre1.setDeplacementColonTerre(null);
                    } else {
                        vue.getMainTerreList().add(Terre1);
                        Terre1.setIcon(null);
                        Terre1.setActionTerre(null);
                        Terre1.setCouleur(null);
                        Terre1.setDeplacementColonTerre(null);
                    }
                }
            }
        }
    }
}