
public class Appli {
    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater( new Runnable() {
            public void run() {
                Model model = new Model();
                Vue vue = new Vue(model);
                Control1VaisseauColon controlVaisseauColon = new Control1VaisseauColon(model,vue);
                Control1TuileColon controltuile = new Control1TuileColon(model,vue);
                ControlMars controlMars = new ControlMars(model,vue);
                ControlTerre controlTerre = new ControlTerre(model,vue);
            }
        });
    }
}
