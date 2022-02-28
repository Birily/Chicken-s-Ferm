import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NoThreadSample extends JFrame implements ActionListener {
    NoThreadSample(){

        GridLayout gl = new GridLayout(2,1);
        this.getContentPane().setLayout(gl);

        JButton myButton = new JButton("Kill Time");
        myButton.addActionListener(this);

        this.getContentPane().add(myButton);
        this.getContentPane().add(new JTextField());

    }

    @Override
    public void actionPerformed(ActionEvent e){
        for (int i=0;i<30000;i++){
            this.setTitle("i="+i);
        }
    }

    public static void main(String[] args) {
        NoThreadSample myWindow = new NoThreadSample();
        myWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myWindow.setSize(250,100);
        myWindow.setLocationRelativeTo(null);
        myWindow.setVisible(true);
    }


}
