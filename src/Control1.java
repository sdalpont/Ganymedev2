import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.event.*;

public abstract class Control1 {

     Model model;
     Vue vue;


    public Control1(Model model, Vue vue) {
        this.model = model;
        this.vue = vue;
    }


}