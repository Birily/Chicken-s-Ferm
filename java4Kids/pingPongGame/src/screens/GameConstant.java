package screens;

public interface GameConstant {
    //Размеры стола
    public final int TABLE_WIDTH = 330;
    public final int TABLE_HEIGHT = 230;
    public final int TABLE_TOP = 12;
    public final int TABLE_BOTTOM = 180;

    //Начальные координаты мяча
    public final int BALL_START_X = TABLE_WIDTH/2;
    public final int BALL_START_Y = TABLE_HEIGHT/2;
    //Размеры, расположения и шаг перемещения ракеток
    public final int KID_RACKET_X = 300;
    public final int KID_RACKET_Y_START = 100;
    public final int COMPUTER_RACKET_X = 15;
    public final int COMPUTER_RACKET_Y_START = 100;

    public final int RACKET_LENGTH = 30;
    public final int RACKET_WIDTH = 5;
    public final int WINNING_SCORE = 5;
    //public final int KID_RACKET_X_START = 300;

    public final int SLEEP_TIME = 10;

}
