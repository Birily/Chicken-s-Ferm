import javax.swing.*;
import java.awt.*;

public class Calculator {
    JPanel windowContent;
    JFormattedTextField displayField;
    JButton buttonPoint;
    JButton buttonEqual;
    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonDivine;
    JButton buttonMultiply;
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

        //Создаём кнопки, используя конструктор класс JButton,
        //который принимает текст кнопки в качестве параметра

        JButton[] numButtons = new JButton[10];
        for(int i=0; i< numButtons.length;i++){
            numButtons[i]=new JButton(String.valueOf(i));
        }

        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonDivine = new JButton("/");
        buttonMultiply = new JButton("*");

        //Создаём панель с Grid Layout котрая содержит 12 кнопок -
        //10 кнопок с числами и кнопки с точной и знаком равно

        p1 = new JPanel();
        GridLayout gl = new GridLayout(4,3);
        p1.setLayout(gl);

        //добавляем кнопки на p1

        for(int i=1; i< numButtons.length;i++) {
            p1.add(numButtons[i]);
        }
        p1.add(numButtons[0]);
        p1.add(buttonPoint);
        p1.add(buttonEqual);
        
        //Перемещаем панель p1 в центральную область проекта
        
        windowContent.add("Center",p1);

        p2 = new JPanel();
        GridLayout gl2 = new GridLayout(4,1);
        p2.setLayout(gl2);

        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonDivine);
        p2.add(buttonMultiply);

        windowContent.add("East",p2);


        //создаём фрейм и задаём его основную панель
        
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);

        //делаем размер окна достаточным для того чтобы
        //вместить все компоненты и делаем видимым

        frame.pack();
        frame.setVisible(true);

        //привязываем логику

        CalculatorEngine calcEngine = new CalculatorEngine(this);

        //задаём кнопкам действия

        for (JButton numButton : numButtons){
            numButton.addActionListener(calcEngine);
        }
        buttonPoint.addActionListener(calcEngine);
        buttonEqual.addActionListener(calcEngine);
        buttonPlus.addActionListener(calcEngine);
        buttonMinus.addActionListener(calcEngine);
        buttonDivine.addActionListener(calcEngine);
        buttonMultiply.addActionListener(calcEngine);


    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }

}

// блять ну я и тупой, как же я долго это делал. то отдыхал, то кодить пытался, а сёння на протяжении дня чё-то пытался натыкивал и вконце ток вкурил как с эти индексом делать
// и потом ток через пол часа допёр КУДА этот кусок еблокода сунуть в программу:)