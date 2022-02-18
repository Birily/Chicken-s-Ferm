import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderWindow implements ActionListener {
    JPanel windowContent;
    JPanel mainPanel;
    JComboBox<String> txtFieldModel;
    JFormattedTextField txtFieldQuantity;
    JLabel model;
    JLabel quantity;
    JButton confirmButton;
    String[] bikes;

    public OrderWindow() {

        this.mainPanel = new JPanel();
        BorderLayout bl = new BorderLayout();
        mainPanel.setLayout(bl);

        this.windowContent = new JPanel();
        GridLayout gl = new GridLayout(2,2);
        windowContent.setLayout(gl);

        this.model = new JLabel("Model");
        model.setHorizontalAlignment(SwingConstants.CENTER);
        windowContent.add(model);
        this.quantity = new JLabel("Quantity");
        quantity.setHorizontalAlignment(SwingConstants.CENTER);
        windowContent.add(quantity);

        bikes = new String[] {
                "2021 GT SLAMMER",
                "BOARDMAN SLR8.9",
                "GIANT CONTEND SL1",
                "CANNODALE CAAD13 DISC 105",
                "Specialized Allez E5"
        };

        this.txtFieldModel = new JComboBox<>(bikes);
        windowContent.add(txtFieldModel);


        this.txtFieldQuantity = new JFormattedTextField();
        windowContent.add(txtFieldQuantity);

        mainPanel.add("North",windowContent);

        this.confirmButton = new JButton("Place order");
        confirmButton.setHorizontalAlignment(SwingConstants.CENTER);
        mainPanel.add("Center", confirmButton);


        JFrame frame = new JFrame("Order Window");
        frame.setContentPane(mainPanel);
        frame.pack();
        frame.setVisible(true);

        txtFieldModel.addActionListener(this);
        txtFieldQuantity.addActionListener(this);
        confirmButton.addActionListener(this);

    }

    int maxQuality(String bikeModel){
        return switch (bikeModel) {
            case "2021 GT SLAMMER" -> 10;
            case "BOARDMAN SLR8.9" -> 7;
            case "GIANT CONTEND SL1" -> 8;
            case "CANNODALE CAAD13 DISC 105" -> 8;
            case "Specialized Allez E5" -> 5;
            default -> throw new IllegalStateException("Unexpected value: " + bikeModel);
        };
    }

    @Override
    public void actionPerformed(ActionEvent e){

        if (confirmButton==e.getSource()){
            if(!"".equals(txtFieldQuantity.getText())){
                try {
                    this.chekOrder((String)txtFieldModel.getSelectedItem(),Integer.parseInt(txtFieldQuantity.getText()));
                } catch (TooManyBikeException tooManyBikeException) {
                    tooManyBikeException.printStackTrace();
                    JOptionPane.showConfirmDialog(null, "Невозможно доставить " +
                    Integer.parseInt(txtFieldQuantity.getText()) +
                    " велосипедов модели " + txtFieldModel.getSelectedItem() +
                    " за одну доставку", "Тут такое дело, начальник...", JOptionPane.DEFAULT_OPTION);
                }
            } else {
                JOptionPane.showConfirmDialog(null, "Field \"Quantity\" is empty", "Something wrong..", JOptionPane.DEFAULT_OPTION);
            }
        }

    }

    void chekOrder (String bikeModel, int quantity) throws TooManyBikeException{
        if (quantity<=maxQuality(bikeModel)) {
            JOptionPane.showConfirmDialog(null, "Заказ успешно размещён, ожидайте доставочку", "Деньги судаааа!", JOptionPane.DEFAULT_OPTION);
        } else {
        throw new TooManyBikeException("Невозможно доставить " + quantity + " велосипедов модели " + bikeModel + " за одну доставку");
        }

    }

    public static void main(String[] args) {
        new OrderWindow();
    }
}
