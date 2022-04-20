import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI1B {
    JFrame frame;
    JButton colorButton;
    JButton labelButton;
    JLabel jLabel;

    public static void main(String[] args) {
        SimpleGUI1B gui = new SimpleGUI1B();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jLabel = new JLabel("Hi, I'm a Label");
        frame.getContentPane().add(BorderLayout.WEST, jLabel);

        MyDrawPanel myDrawPanel = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.CENTER, myDrawPanel);

        colorButton = new JButton("Change color");
        colorButton.addActionListener(new ColorButtonListener());
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);

        labelButton = new JButton("Chang label");
        labelButton.addActionListener(new LabelButtonListener());
        frame.getContentPane().add(BorderLayout.EAST, labelButton);

        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    class ColorButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }

    class LabelButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            jLabel.setText("Ouch!");
        }
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        frame.repaint();
//    }
}
//407