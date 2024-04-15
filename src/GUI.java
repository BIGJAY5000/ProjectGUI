import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    //class attributes
    private JLabel label1;
    private JLabel label2;
    private int value;
    private int count;


    public GUI() {
        //Create Frame
        JFrame frame = new JFrame("Simple GUI");
        //Set Frame Size
        frame.setSize(600, 400);
        //Makes program exit when red button is hit
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Create panel
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20 , 20));
        panel.setLayout(new GridLayout(2, 2, 10, 10));
        frame.add(panel);

        //Buttons
        JButton b1 = new JButton("+1");
        JButton b2 = new JButton("-1");
        label1 = new JLabel("value: " + value);
        label1.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label1);
        label2 = new JLabel("count: " + count);
        label2.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label2);
        panel.add(b1);
        panel.add(b2);

        //Adding actions to buttons
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b1Press();
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b2Press();
            }
        });


        //Create label and add to panel



        //Makes it show up
        //Put this at the end
        frame.setVisible(true);
    }



    public static void main(String[] args) {
        new GUI();
    }

    //Methods that are called when buttons are pressed
    public void b1Press() {
        value += 1;
        count += 1;
        label1.setText("value: " + value);
        label2.setText("count: " + count);

    }
    public void b2Press() {
        value -= 1;
        count += 1;
        label1.setText("value: " + value);
        label2.setText("count: " + count);
    }
}