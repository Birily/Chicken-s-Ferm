import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreal implements ActionListener {
    JTextArea text;

    public static void main(String[] args) {
        TextAreal textAreal = new TextAreal();
        textAreal.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JButton button = new JButton("Just click me!");
        button.addActionListener(this);

        text = new JTextArea(10,20);
        text.setLineWrap(true);

        JScrollPane jScrollPane = new JScrollPane(text);
        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(jScrollPane);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH , button);

        frame.setSize(350,350);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        text.append("button clicked \n");
    }
}
