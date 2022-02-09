import javax.swing.*;
import java.awt.*;

public class Calculator {
    JPanel windowContent;
    JFormattedTextField displayField;
//    JButton button0;
//    JButton button1;
//    JButton button2;
//    JButton button3;
//    JButton button4;
//    JButton button5;
//    JButton button6;
//    JButton button7;
//    JButton button8;
//    JButton button9;
    JButton buttonPoint;
    JButton buttonEqual;
    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonSlash;
    JButton buttonAsterisk;
    JPanel p1;
    JPanel p2;

    //В конструкторе создаются все компоненты и добавляются на
    //фрейм с помощью комбинации BorderLayout и GridLayout

    Calculator(){
        windowContent = new JPanel();

        //Задаём схему для этой панели

        BorderLayout bl =new BorderLayout();
        windowContent.setLayout(bl);

        //Создаём и отображаем поле добавляем в северную область окна

        displayField = new JFormattedTextField();
        displayField.setHorizontalAlignment(SwingConstants.RIGHT);
        windowContent.add("North",displayField);


        Button[] numButtons = new Button[10];
        for(int i=0; i< numButtons.length;i++){
            numButtons[i]=new Button(String.valueOf(i));
        }


            //Создаём кнопки, используя конструктор класс JButton,
        //который принимает текст кнопки в качестве параметра

//        button0 = new JButton("0");
//        button1 = new JButton("1");
//        button2 = new JButton("2");
//        button3 = new JButton("3");
//        button4 = new JButton("4");
//        button5 = new JButton("5");
//        button6 = new JButton("6");
//        button7 = new JButton("7");
//        button8 = new JButton("8");
//        button9 = new JButton("9");
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonSlash = new JButton("/");
        buttonAsterisk = new JButton("*");

        //Создаём панель с Grid Layout котрая содержит 12 кнопок -
        //10 кнопок с числами и кнопки с точной и знаком равно

        p1 = new JPanel();
        GridLayout gl = new GridLayout(4,3);
        p1.setLayout(gl);

        //добавляем кнопки на p1

//        p1.add(button0);
//        p1.add(button1);
//        p1.add(button2);
//        p1.add(button3);
//        p1.add(button4);
//        p1.add(button5);
//        p1.add(button6);
//        p1.add(button7);
//        p1.add(button8);
//        p1.add(button9);
        for (Button numButton : numButtons) {
            p1.add(numButton);
        }
        p1.add(buttonPoint);
        p1.add(buttonEqual);
        
        //Перемещаем панель p1 в центральную область проекта
        
        windowContent.add("Center",p1);

        p2 = new JPanel();
        GridLayout gl2 = new GridLayout(4,1);
        p2.setLayout(gl2);

        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonSlash);
        p2.add(buttonAsterisk);

        windowContent.add("East",p2);


        //создаём фрейм и задаём его основную панель
        
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);

        //делаем размер окна достаточным для того чтобы
        //вместить все компоненты и делаем видимым

        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }

}