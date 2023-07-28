import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock {
    static JFrame frame = new JFrame("Digital Clock");
    static Container container = new Container();
    static JLabel digit = new JLabel("",JLabel.CENTER);
    static Font clockFont = new Font("Tahoma",Font.BOLD,140);
    static Color foregroundColor= new Color(23,244,203);
    static Color backgroundColor = new Color(9,27,49);
    private void updateTime(){
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        digit.setFont(clockFont);
        digit.setBounds(0,0,700,300);
        digit.setForeground(foregroundColor);
        digit.setText(sdf.format(now));
        frame.add(digit);
    }

    public static void main(String[] args) {
        DigitalClock dc = new DigitalClock();

        frame.getContentPane().setBackground(backgroundColor);
        frame.setUndecorated(true);
        frame.setSize(700,300);
        frame.setLocation(400,200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        dc.updateTime();
        Timer timer = new Timer(1000, e-> dc.updateTime());
        timer.start();

        frame.setLayout(null);
        frame.setVisible(true);
        container.add(frame);
    }
}