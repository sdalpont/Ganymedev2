import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control1TuileColon extends Control1 implements ActionListener {

    public Control1TuileColon(Model model, Vue vue){
        super(model,vue);
        vue.setButtonController1(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vue.getBoardTuileColon().get(0)) {
            vue.getMainTuileColon().add(vue.getBoardTuileColon().get(0));
            TuileColon tuile1 = vue.getBoardTuileColon().get(0);
            vue.getTuileColonList().remove(0);
            tuile1.setIcon(vue.getTuileColonList().get(0).getIcon());
            tuile1.setEffetTuile(vue.getTuileColonList().get(0).getEffetTuile());
        }

        else if (e.getSource() == vue.getBoardTuileColon().get(1)) {
            vue.getMainTuileColon().add(vue.getBoardTuileColon().get(1));
            TuileColon tuile1 = vue.getBoardTuileColon().get(1);
            vue.getTuileColonList().remove(0);
            tuile1.setIcon(vue.getTuileColonList().get(0).getIcon());
            tuile1.setEffetTuile(vue.getTuileColonList().get(0).getEffetTuile());
        }


        else if (e.getSource() == vue.getBoardTuileColon().get(2)) {
            vue.getMainTuileColon().add(vue.getBoardTuileColon().get(2));
            TuileColon tuile1 = vue.getBoardTuileColon().get(2);
            vue.getTuileColonList().remove(0);
            tuile1.setIcon(vue.getTuileColonList().get(0).getIcon());
            tuile1.setEffetTuile(vue.getTuileColonList().get(0).getEffetTuile());
        }

        else if (e.getSource() == vue.getBoardTuileColon().get(3)) {
            vue.getMainTuileColon().add(vue.getBoardTuileColon().get(3));
            TuileColon tuile1 = vue.getBoardTuileColon().get(3);
            vue.getTuileColonList().remove(0);
            tuile1.setIcon(vue.getTuileColonList().get(0).getIcon());
            tuile1.setEffetTuile(vue.getTuileColonList().get(0).getEffetTuile());
        }
    }
}
