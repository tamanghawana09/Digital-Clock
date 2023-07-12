import javax.swing.*;
import java.awt.*;

public class DigitalClock extends JFrame {
    public DigitalClock(){
        int x = 500;
        int y = 500;
        setTitle("Digital Clock");
        setSize(800,700);
        setLocation(360,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = getContentPane();

        JLabel timelabel = new JLabel("Time");
        container.add(timelabel);

        setVisible(true);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            new DigitalClock();
        });

    }


}
