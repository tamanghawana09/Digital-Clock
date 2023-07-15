import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class DigitalClock extends JFrame implements ItemListener {
    static DigitalClock dc =  new DigitalClock();
    Container container = getContentPane();

    static JComboBox jcomboBox;
    static JLabel time;
    public DigitalClock(){

        int x = 500;
        int y = 500;
        setTitle("Digital Clock");
        setSize(1000,650);
        setLocation(300,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = getContentPane();
        String s[] = {"Light Mode","Dark Mode"};
        jcomboBox = new JComboBox(s);
        jcomboBox.setBounds(850,10,100,20);
        jcomboBox.addItemListener(dc);
        container.add(jcomboBox);

        time= new JLabel();
        time.setText("00:00:00");
        container.add(time);

        setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            new DigitalClock();
        });

    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == jcomboBox){
            if(jcomboBox.getSelectedItem() == "Light Mode")
            {
                container.setBackground(Color.WHITE);
            }else if(jcomboBox.getSelectedItem() == "Dark Mode"){
                container.setBackground(Color.DARK_GRAY);
            }else{
                JOptionPane.showMessageDialog(this,"Choose for different modes","Not Clicked",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
