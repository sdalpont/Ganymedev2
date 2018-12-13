import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.event.*;

public abstract class Control1 {

     Model model;
     Vue vue;
     VuePlateauJoueur vuePlateauJoueur;


    public Control1(Model model, Vue vue, VuePlateauJoueur vuePlateauJoueur) {
        this.model = model;
        this.vue = vue;
        this.vuePlateauJoueur = vuePlateauJoueur;
    }


}