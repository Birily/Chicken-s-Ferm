package engine;

import screens.GameConstant;
import screens.PingPongGreenTable;

import javax.swing.*;
import java.awt.event.*;
//import java.awt.event.MouseListener;
import java.util.Random;

public class PingPongGameEngine implements KeyListener, MouseMotionListener, GameConstant, Runnable {
    private PingPongGreenTable table;
    private int kidRacket_Y = KID_RACKET_Y_START;
    private int computerRacket_Y = COMPUTER_RACKET_Y_START;
    private int kidScore;
    private int computerScore;
    private int ballX;
    private int ballY;
    private volatile boolean movingLeft = true;
    private volatile boolean ballServed = true;
    //значение вертикального передвижения мяча в пикселях
    private int verticalSlide;
    Thread worker;
    //Шаги перемещения мяча в пикселях
    private static int ballIncrement = 3;
    //Макс и мин координаты мяча
    private int BALL_MIN_X = 1 + ballIncrement;
    private int BALL_MIN_Y = 1 + ballIncrement;
    private int BALL_MAX_X = TABLE_WIDTH- ballIncrement;
    private int BALL_MAX_Y = TABLE_HEIGHT- ballIncrement;
    private static int racketIncrement = 2;


    //Конструктор. Содержит ссылку на объект стола
    public PingPongGameEngine(PingPongGreenTable greenTable){
        table = greenTable;
        this.worker = new Thread(this);
        worker.start();
    }

    public static void setBallIncrement(String i){
        if(Integer.parseInt(i)>0 && Integer.parseInt(i)<10){
        ballIncrement = Integer.parseInt(i);} else JOptionPane.showConfirmDialog(null,
                "Please input volume >0 and <10","Incorrect volume",JOptionPane.DEFAULT_OPTION);
    }
    public static void setRacketIncrement(String i){
        if(Integer.parseInt(i)>0 && Integer.parseInt(i)<10){
            racketIncrement = Integer.parseInt(i);} else JOptionPane.showConfirmDialog(null,
                "Please input volume >0 and <10","Incorrect volume",JOptionPane.DEFAULT_OPTION);
    }

    //Обязательные методы из интерфейса MouseMotionListener
    @Override
    public void mouseDragged(MouseEvent e){}

    @Override
    public void mouseMoved(MouseEvent e){
        int mouse_Y = e.getY();

        //Если мышь находится выше ракетки ребёнка и не выходит запределы
        //стола - передвинуть её вверх, в противном случае - опустить вниз
        if (mouse_Y<kidRacket_Y && kidRacket_Y>TABLE_TOP){
            kidRacket_Y -= racketIncrement;
        } else if (kidRacket_Y<TABLE_BOTTOM){
            kidRacket_Y += racketIncrement;
        }

        //Установить новое положение ракетки
        table.setKidRacket_Y(kidRacket_Y);
    }

    @Override
    public void keyPressed(KeyEvent e){
        char key = e.getKeyChar();
        if ('n'==key || 'N' ==key){
            startNewGame();
        } else if ('q'==key || 'Q'==key){
            endGame();
        } else if ('s'==key || 'S'==key){
            kidServe();
        }
    }

    @Override
    public void keyReleased(KeyEvent e){

    }

    @Override
    public void keyTyped(KeyEvent e){

    }

    public void startNewGame(){
        computerScore = 0;
        kidScore = 0;
        table.setMessageText("Score computer: "+computerScore+", Kid: "+kidScore);
        kidServe();
    }
    public void endGame(){
        System.exit(0);
    }

    public void run(){
        //p213
        boolean canBounce = false;
        while (true){
            if (ballServed){ //Если мяч движется
                //шаг 0. отскок от границ стала
                if (ballY==BALL_MIN_Y){
                    verticalSlide=+2;
                }
                if (ballY==210){
                    verticalSlide=-2;
                }
                // Шаг 1. Мяч движется влево?
                if (movingLeft && ballX>BALL_MIN_X){
                    canBounce = (ballY>=computerRacket_Y && ballY<(computerRacket_Y+RACKET_LENGTH)?true:false);
                    ballX -= ballIncrement;
                    //Добавить смещение вверх или вниз к любым движениям мяча влево или вправо
                    //bouncing(rd.nextBoolean());
                    ballMoveUp();
                    table.setBallPosition(ballX,ballY);
                    //Может отскочить?
                    if (ballX<=COMPUTER_RACKET_X && canBounce){
                        movingLeft=false;
                    }
                }
                //Шаг 2. Мяч движется вправо?
                if (!movingLeft && ballX<=BALL_MAX_X){
                    canBounce = (ballY>=kidRacket_Y && ballY<(kidRacket_Y+RACKET_LENGTH)? true:false);
                    ballX += ballIncrement;
                    ballMoveUp();
                    //bouncing(rd.nextBoolean());
                    table.setBallPosition(ballX,ballY);
                    //Може отскочить?
                    if (ballX>=KID_RACKET_X-5 && canBounce){
                        movingLeft = true;
                    }
                }
                //Шаг 3. Перемещать ракетку компьютера вверх или вниз, чтобы блокировать мяч
                if (computerRacket_Y<ballY && computerRacket_Y<TABLE_BOTTOM){
                    computerRacket_Y += racketIncrement;
                } else if (computerRacket_Y>TABLE_TOP){
                    computerRacket_Y -= racketIncrement;
                }
                table.setComputerRacket_Y(computerRacket_Y);
                //Шаг 4. Приостановить
                try {
                    Thread.sleep(SLEEP_TIME);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                //Шаг 5. Обновить счёт если мяч в зелёной области, но не движется
                if(isBallOnTheTable()){
                    if (ballX>BALL_MAX_X){
                        computerScore++;
                        displeyScore();
                    } else  if (ballX<BALL_MIN_X){
                        kidScore++;
                        displeyScore();
                    }
                }
            }// Конец if ballServed
        }// конец while
    }// конец run()

    private void bouncing(boolean rd){

        if (true){
            ballMoveUp();
        } else {
            ballMoveDown();
        }

    }

    private int getRandomNubberVS(int min, int max){
        return (int) (Math.random() +(max-min)+min);
    }

    //Подать с текущей позиции ребёнка
    private  void kidServe(){
        ballServed = true;
        ballX = KID_RACKET_X-1;
        ballY = kidRacket_Y;
        if (ballY>TABLE_HEIGHT/2){
            verticalSlide=-1;
        } else {
            verticalSlide=1;
        }
        table.setBallPosition(ballX,ballY);
        table.setKidRacket_Y(kidRacket_Y);
    }

    private  void displeyScore(){
        ballServed = false;
        if (computerScore==WINNING_SCORE){
            table.setMessageText("Computer won! "+ computerScore + " : " + kidScore);
            JOptionPane.showConfirmDialog(null,"Computer won! "+ computerScore + " : " + kidScore,"У нас победитель!!!", JOptionPane.DEFAULT_OPTION);
            endGame();
        } else if(kidScore==WINNING_SCORE){
            table.setMessageText("You won! "+ kidScore + " : " + computerScore);
            JOptionPane.showConfirmDialog(null,"You won! "+ computerScore + " : " + kidScore,"У нас победитель!!!", JOptionPane.DEFAULT_OPTION);
            endGame();
        } else {
            table.setMessageText("Computer: " + computerScore + " You: " + kidScore);
        }
    }

    //Проверить не пересёк ли мяч верхнюю или нижнюю границу стола
    private boolean isBallOnTheTable(){
        if (ballY >= BALL_MIN_Y && ballY <= BALL_MAX_Y){
            return true;
        } else {
            return false;
        }

    }

    private void ballMoveUp(){
        ballY +=verticalSlide;
    }
    private void ballMoveDown(){
        ballY -=verticalSlide;
    }

}
