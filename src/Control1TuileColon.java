import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control1TuileColon extends Control1 implements ActionListener {

    public Control1TuileColon(Model model, Vue vue, VuePlateauJoueur vuePlateauJoueur){
        super(model,vue,vuePlateauJoueur);
        vue.setButtonController1(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i<vue.joueurList.size(); i++){
            if(vuePlateauJoueur.plateauTuileJoueur.get(0).getIcon() != null){
                if (e.getSource() == vue.getBoardTuileColon().get(0) && vue.getMainTuileColon().size() < 1) {
                    vue.getMainTuileColon().add(vue.getBoardTuileColon().get(0));
                    TuileColon tuile1 = vuePlateauJoueur.plateauTuileJoueur.get(0);
                    vue.getTuileColonList().remove(0);
                    tuile1.setIcon(vue.getTuileColonList().get(0).getIcon());
                    tuile1.setEffetTuile(vue.getTuileColonList().get(0).getEffetTuile());
                    vue.getMainTuileColon().remove(0);
                }

                else if (e.getSource() == vue.getBoardTuileColon().get(1)&& vue.getMainTuileColon().size() < 1) {
                    vue.getMainTuileColon().add(vue.getBoardTuileColon().get(1));
                    TuileColon tuile1 = vuePlateauJoueur.plateauTuileJoueur.get(0);
                    vue.getTuileColonList().remove(0);
                    tuile1.setIcon(vue.getTuileColonList().get(0).getIcon());
                    tuile1.setEffetTuile(vue.getTuileColonList().get(0).getEffetTuile());
                    vue.getMainTuileColon().remove(0);
                }


            else if (e.getSource() == vue.getBoardTuileColon().get(2)&& vue.getMainTuileColon().size() < 1) {
                vue.getMainTuileColon().add(vue.getBoardTuileColon().get(2));
                TuileColon tuile1 = vuePlateauJoueur.plateauTuileJoueur.get(2);
                vue.getTuileColonList().remove(0);
                tuile1.setIcon(vue.getTuileColonList().get(0).getIcon());
                tuile1.setEffetTuile(vue.getTuileColonList().get(0).getEffetTuile());
                vue.getMainTuileColon().remove(0);
            }

            else if (e.getSource() == vue.getBoardTuileColon().get(2)&& vue.getMainTuileColon().size() < 1) {
                vue.getMainTuileColon().add(vue.getBoardTuileColon().get(2));
                TuileColon tuile1 = vuePlateauJoueur.plateauTuileJoueur.get(2);
                vue.getTuileColonList().remove(0);
                tuile1.setIcon(vue.getTuileColonList().get(0).getIcon());
                tuile1.setEffetTuile(vue.getTuileColonList().get(0).getEffetTuile());
                vue.getMainTuileColon().remove(0);
            }
            else{
                System.out.println("Indication : Vous ne pouvez plus prendre de Tuile colonvousa avez épuisez toutes vos actions");
            }
        }
        }
    }
}
