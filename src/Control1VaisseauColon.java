import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control1VaisseauColon extends Control1 implements ActionListener {
    boolean vaisseau1EstNull = true;
    boolean vaisseau2EstNull = true;

    public Control1VaisseauColon(Model model, Vue vue, VuePlateauJoueur vuePlateauJoueur) {
        super(model, vue, vuePlateauJoueur);
        vue.setButtonController(this);
//        vuePlateauJoueur.setButtonController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (vue.getCarteVaisseauColonList().size() > 1) {
            if (e.getSource() == vue.getBoardVaisseauColonList().get(0)) {
                placementDesVaisseauSurLePlateauJoueur(0);

                System.out.println("bouton1");
                System.out.println(vue.getCarteVaisseauColonList().get(0).getEffet());
                System.out.println(vue.getCarteVaisseauColonList().size());
                System.out.println(vue.getMainVaisseauColonList().get(vue.getMainVaisseauColonList().size() - 1).getEffet());

            }
            if (e.getSource() == vue.getBoardVaisseauColonList().get(1)) {
                placementDesVaisseauSurLePlateauJoueur(1);

                System.out.println("bouton2");

            } else if (e.getSource() == vue.getBoardVaisseauColonList().get(2)) {
                placementDesVaisseauSurLePlateauJoueur(2);

                System.out.println("bouton3");

            }
        } else {

            if (e.getSource() == vue.getBoardVaisseauColonList().get(0)) {
                if (vue.getCarteVaisseauColonList().size() == 0
                        && vue.getBoardVaisseauColonList().get(1).getEffet() == null
                        && vue.getBoardVaisseauColonList().get(2).getEffet() == null) {
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
                    setCarteVaisseauNull(VaisseauColon1);
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
                    setCarteVaisseauNull(VaisseauColon1);
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
                    setCarteVaisseauNull(VaisseauColon1);
                }
            }
        }
    }

    private void setCarteVaisseauNull(CarteVaisseauColon vaisseauColon1) {
        if (vue.getCarteVaisseauColonList().size() != 0) {
            vue.getCarteVaisseauColonList().remove(0);
            vue.getMainVaisseauColonList().add(vaisseauColon1);
            vaisseauColon1.setIcon(null);
            vaisseauColon1.setEffet(null);
        } else {
            vue.getMainVaisseauColonList().add(vaisseauColon1);
            vaisseauColon1.setIcon(null);
            vaisseauColon1.setEffet(null);
        }
    }

    private void placementDesVaisseauSurLePlateauJoueur(int i) {

        CarteVaisseauColon vaisseauColon1Joueur = vuePlateauJoueur.getCarteVaisseauColon1();
        CarteVaisseauColon vaisseauColon2Joueur = vuePlateauJoueur.getCarteVaisseauColon2();
        if (vaisseau1EstNull) {
            vaisseau1EstNull = false;
            vaisseauColon1Joueur.setIcon(vue.getBoardVaisseauColonList().get(i).getIcon());
            vaisseauColon1Joueur.setEffet(vue.getBoardVaisseauColonList().get(i).getEffet());
        } else if (vaisseau2EstNull) {
            vaisseau2EstNull = false;
            vaisseauColon2Joueur.setIcon(vue.getBoardVaisseauColonList().get(i).getIcon());
            vaisseauColon2Joueur.setEffet(vue.getBoardVaisseauColonList().get(i).getEffet());
        }/* else {
            System.out.println("On ne peut plus piocher de cartes");
        }*/

        vue.getMainVaisseauColonList().add(vue.getBoardVaisseauColonList().get(i));
        CarteVaisseauColon VaisseauColon1 = vue.getBoardVaisseauColonList().get(i);
        vue.getCarteVaisseauColonList().remove(0);
        VaisseauColon1.setIcon(vue.getCarteVaisseauColonList().get(0).getIcon());
        VaisseauColon1.setEffet(vue.getCarteVaisseauColonList().get(0).getEffet());
    }
}

