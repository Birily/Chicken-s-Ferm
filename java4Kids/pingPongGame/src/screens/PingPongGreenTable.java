package screens;

import engine.PingPongGameEngine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PingPongGreenTable extends JPanel implements GameConstant, ActionListener {

    JLabel label;
    JButton buttonChange;
    JLabel labelCompSpeed;
    JLabel labelBallSpeed;
    JFormattedTextField compSpeed;
    JFormattedTextField ballSpeed;
    //public Point point = new Point(0,0);
    private int computerRacket_Y = COMPUTER_RACKET_Y_START;
    public int ComputerRacket_X = 15;
    private int kidRacket_Y = KID_RACKET_Y_START;
    private int ballX = BALL_START_X;
    private int ballY = BALL_START_Y;

    Dimension preferredSize = new Dimension(TABLE_WIDTH,TABLE_HEIGHT);

    //Этот метод устанавливает ращмер
    //вызывается виртуальной Java машиной
    public Dimension getPreferredSize(){
        return preferredSize;
    }

    //Конструктор. Создаёт обработчик событий мыши.
    PingPongGreenTable(){
        PingPongGameEngine gameEngine = new PingPongGameEngine(this);
        //обрабатывает клики мыши для отображения её координат
        addKeyListener(gameEngine);
        //обрабатывает движения мыши для передвижения ракеток
        addMouseMotionListener(gameEngine);

    }

    void addPanelToFrame(Container container){
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.add(this);
        label = new JLabel("Press N for a new game, S to serve or Q to quit");
        container.add(label);
        labelCompSpeed = new JLabel("CompSpeed(0..10)");
        container.add(labelCompSpeed);
        compSpeed = new JFormattedTextField();
        compSpeed.addActionListener(this);
        container.add(compSpeed);
        labelBallSpeed = new JLabel("BallSpeed(0..10)");
        container.add(labelBallSpeed);
        ballSpeed = new JFormattedTextField();
        ballSpeed.addActionListener(this);
        container.add(ballSpeed);
        buttonChange = new JButton("Change");
        buttonChange.addActionListener(this);
        container.add(buttonChange);

    }

    //Перерисовать окно. Этот метод вызывается виртуальной машиной, когда нужно
    //обновить экран или вызывается метод repaint() из PingPongGameEngine
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //Нарисовать стол
        g.setColor(Color.GREEN);
        g.fillRect(0,0,TABLE_WIDTH,TABLE_HEIGHT);

        //нарисовать правую ракетку
        g.setColor(Color.yellow);
        g.fillRect(KID_RACKET_X,kidRacket_Y,RACKET_WIDTH,RACKET_LENGTH);

        //Нарисовать левую ракетку
        g.setColor(Color.blue);
        g.fillRect(ComputerRacket_X,computerRacket_Y,RACKET_WIDTH,RACKET_LENGTH);

        //Нарисовать мяч
        g.setColor(Color.red);
        g.fillOval(ballX,ballY,10,10);

        g.setColor(Color.white);
        g.drawRect(10,10,300,TABLE_HEIGHT-30);
        g.drawLine(160,10,160,210);

        requestFocus();
    }

    //Установить текущее положение ракетки ребёнка
    public void setKidRacket_Y(int yCoordinate){
        this.kidRacket_Y = yCoordinate;
        repaint();
    }

    //Вернуть текущее положение ракетки ребёнка
    public int getKidRacket_Y(){
        return kidRacket_Y;
    }

    //Установить текущее положение ракетки компьютера
    public void setComputerRacket_Y(int yCoordinate){
        this.computerRacket_Y = yCoordinate;
        repaint();
    }
    public void setMessageText(String text){
        label.setText(text);
        repaint();
    }

    //Установить позицию мяча
    public void setBallPosition(int xPos, int yPos){
        ballX = xPos;
        ballY = yPos;
        repaint();
    }


    public static void main(String[] args) {
	//Создать экземпляр окна
        JFrame f = new JFrame("Ping Pong Green Table");

        //Убедиться, что окно может быть закрыто по нажатию на крестик в углу
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        PingPongGreenTable table = new PingPongGreenTable();
        table.addPanelToFrame(f.getContentPane());

        //Установить размер окна и сделать его видимым
        //f.setBounds(0,0,TABLE_WIDTH+5,TABLE_HEIGHT+40);
        f.pack();
        f.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buttonChange){
            PingPongGameEngine.setBallIncrement(ballSpeed.getText());
            PingPongGameEngine.setRacketIncrement(compSpeed.getText());
        }
    }
}
