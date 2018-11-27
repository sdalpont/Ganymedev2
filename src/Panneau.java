import javax.swing.*;
import java.awt.*;

public class Panneau extends JPanel {
    public void paintComponent(Graphics g){
        Font font = new Font("Courrier", Font.BOLD, 20);
        g.setFont(font);
        g.setColor(Color.black);
        g.drawString("Ganymère",10,20);
    }

}
