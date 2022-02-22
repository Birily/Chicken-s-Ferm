import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.FileSystem;
import java.nio.file.Path;

public class FileCopyEngine implements ActionListener {
    FileCopySwing parent;
    JFileChooser chooseFrom;
    JFileChooser chooseTo;

    public FileCopyEngine(FileCopySwing parent) {
        this.parent = parent;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()== parent.buttonCopyFrom){
            this.chooseFrom = new JFileChooser();
            chooseFrom.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            chooseFrom.showDialog(parent.windowContent, "Choose File");
            //parent.pathCopyFrom.setText(chooseFrom.getCurrentDirectory().toString()+"\\"+chooseFrom.getSelectedFile());
            parent.pathCopyFrom.setText(chooseFrom.getSelectedFile().toString());
        }

        if (e.getSource()== parent.buttonCopyTo){
            this.chooseTo = new JFileChooser();
            chooseTo.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            chooseTo.showDialog(parent.windowContent, "Choose where");
            //parent.pathCopyTo.setText(chooseTo.getCurrentDirectory().toString()+"\\");
            parent.pathCopyTo.setText(chooseTo.getSelectedFile().toString()+"\\");
        }

        if (e.getSource()== parent.buttonCopy){
            if (!"".equals(parent.pathCopyFrom.getText()) || !"".equals(parent.pathCopyTo.getText())){
                fileCopy(parent.pathCopyFrom.getText(),parent.pathCopyTo.getText()+"cloned file.txt");
                //JOptionPane.showConfirmDialog(null, parent.pathCopyFrom.getText()+"\n"+parent.pathCopyTo.getText(), "Чё-то не так пошло", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showConfirmDialog(null, "Пути заданы некорректно", "Чё-то не так пошло", JOptionPane.PLAIN_MESSAGE);
            }
        }


    }

    public void fileCopy(String path1, String path2){
        FileReader myFile = null;
        BufferedReader buff = null;
        FileWriter myFile1 = null;
        BufferedWriter buff1 = null;

        try {
            myFile = new FileReader(path1);
            buff = new BufferedReader(myFile);
            myFile1 = new FileWriter(path2);
            buff1 = new BufferedWriter(myFile1);
            while (true) {
                String line = buff.readLine();
                if (line == null) break;
                buff1.write(line+"\n");
                System.out.println("Считано и записано: "+line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert buff != null;
                buff.close();
                myFile.close();
                assert buff1 != null;
                buff1.flush();
                buff1.close();
                myFile1.close();
            } catch (IOException e1){
                e1.printStackTrace();
            }
        }
    }
}
