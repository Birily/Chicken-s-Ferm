import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorEngine implements ActionListener {

    Calculator parent;          //ссылка на окно калькулятора
    char selectAction = ' ';    //+, -, /, или *
    double currentResult;

    // констурктор сохраняет ссылку на окно калькулятора в переменной экземпляра класса
    CalculatorEngine(Calculator parent){
        this.parent = parent;

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        //Получаем источник события
        JButton clickedButton = (JButton)e.getSource();
        String displeyFieldText = parent.displayField.getText();
        double displayValue = 0;


        // получить число из дисплея калькулятора, если он не пустой

        if (!"".equals(displeyFieldText)){
            displayValue = Double.parseDouble(displeyFieldText);
        }

        Object src = e.getSource();

        //Для каждой кнопки арифметического действия
        //запомнить его: +,-/,* сохранить текущее число
        //в переменной currentResult, и очистить дисплей
        //для ввода нового числа

//        if(Double.toString(displayValue).indexOf('.')>=0){
//            indexI = Double.toString(displayValue).indexOf('.');
//            if (Double.toString(displayValue).indexOf('.', indexI)!=indexI){
//                JOptionPane.showConfirmDialog(null, "Убери!.. ", "Ля сколько точек", JOptionPane.PLAIN_MESSAGE);
//            }
//        }

//            if (parent.displayField.getText().indexOf('.')!=-1){
//                 JOptionPane.showConfirmDialog(null, "Убери!.. ", "Ля сколько точек", JOptionPane.PLAIN_MESSAGE);
//            }


            if (src == parent.buttonPlus) {
                selectAction = '+';
                currentResult = displayValue;
                parent.displayField.setText("");
            } else if (src == parent.buttonMinus) {
                selectAction = '-';
                currentResult = displayValue;
                parent.displayField.setText("");
            } else if (src == parent.buttonDivine) {
                selectAction = '/';
                currentResult = displayValue;
                if (currentResult <= 0) {
                    JOptionPane.showConfirmDialog(null, "На нуль же делить нельзя.. ", "Ты шо", JOptionPane.PLAIN_MESSAGE);
                } else {
                    parent.displayField.setText("");
                }
            } else if (src == parent.buttonMultiply) {
                selectAction = '*';
                currentResult = displayValue;
                parent.displayField.setText("");
            } else if (src == parent.buttonEqual) {
                switch (selectAction) {
                    case ('+') -> {
                        currentResult += displayValue;
                        parent.displayField.setText("" + currentResult);
                    }
                    case ('-') -> {
                        currentResult -= displayValue;
                        parent.displayField.setText("" + currentResult);
                    }
                    case ('/') -> {
                        currentResult /= displayValue;
                        parent.displayField.setText("" + currentResult);
                    }
                    case ('*') -> {
                        currentResult *= displayValue;
                        parent.displayField.setText("" + currentResult);
                    }
                }
            } else {
                String clickedButtonLabel = clickedButton.getText();
                if (src == parent.buttonPoint){
                    if (parent.displayField.getText().indexOf('.')!=-1){
                        JOptionPane.showConfirmDialog(null, "Убери!.. ", "Ля сколько точек", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        parent.displayField.setText(displeyFieldText + clickedButtonLabel);
                    }
                } else {
                parent.displayField.setText(displeyFieldText + clickedButtonLabel);}
            }

//        Получаем надпись на кнопке
//        String clickedButtonLabel = clickedButton.getText();
//        Добавляем надпись на кнопке
//        JOptionPane.showConfirmDialog(null, "You pressed "+clickedButtonLabel, "Just a test", JOptionPane.PLAIN_MESSAGE);
    }
}
