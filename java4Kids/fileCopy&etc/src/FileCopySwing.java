import javax.swing.*;
import java.awt.*;

public class FileCopySwing {
    JPanel windowContent;
    JPanel browsePanel;
    JLabel copyFrom;
    JLabel copyTo;
    JFormattedTextField pathCopyFrom;
    JFormattedTextField pathCopyTo;
    JButton buttonCopyFrom;
    JButton buttonCopyTo;
    JFileChooser copyFileFrom;
    JFileChooser copyFileTo;
    JButton buttonCopy;

    public FileCopySwing(){
        this.windowContent = new JPanel();
        BorderLayout b1 = new BorderLayout();
        windowContent.setLayout(b1);

        this.browsePanel =new JPanel();
        GridLayout g1 = new GridLayout(2,3);
        browsePanel.setLayout(g1);

        this.copyFrom = new JLabel("Copy From: ");
        copyFrom.setHorizontalAlignment(SwingConstants.CENTER);
        browsePanel.add(copyFrom);

        this.pathCopyFrom = new JFormattedTextField();
        pathCopyFrom.setHorizontalAlignment(SwingConstants.RIGHT);
        browsePanel.add(pathCopyFrom);

        this.buttonCopyFrom = new JButton("Copy From");
        buttonCopyFrom.setHorizontalAlignment(SwingConstants.CENTER);
        browsePanel.add(buttonCopyFrom);

//        this.copyFileFrom = new JFileChooser();
//        browsePanel.add(copyFileFrom);

        this.copyTo = new JLabel("Copy to: ");
        copyTo.setHorizontalAlignment(SwingConstants.CENTER);
        browsePanel.add(copyTo);

        this.pathCopyTo = new JFormattedTextField();
        pathCopyTo.setHorizontalAlignment(SwingConstants.RIGHT);
        browsePanel.add(pathCopyTo);

        this.buttonCopyTo = new JButton("Copy to");
        buttonCopyTo.setHorizontalAlignment(SwingConstants.CENTER);
        browsePanel.add(buttonCopyTo);

//        this.copyFileTo = new JFileChooser();
//        browsePanel.add(copyFileTo);

        windowContent.add("North", browsePanel);

        this.buttonCopy = new JButton("Copy");
        buttonCopy.setHorizontalAlignment(SwingConstants.CENTER);

        windowContent.add("Center", buttonCopy);

        JFrame frame = new JFrame("FileCopy");
        frame.setContentPane(windowContent);
        frame.pack();
        frame.setVisible(true);

        FileCopyEngine fileCopyEngine = new FileCopyEngine(this);

        buttonCopyFrom.addActionListener(fileCopyEngine);
        buttonCopyTo.addActionListener(fileCopyEngine);
        buttonCopy.addActionListener(fileCopyEngine);

    }


    public static void main(String[] args) {
        new FileCopySwing();
    }

}
