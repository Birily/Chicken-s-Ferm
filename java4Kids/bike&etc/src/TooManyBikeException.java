public class TooManyBikeException extends Exception {
    public TooManyBikeException() {
        super("Мы не сможем доставить столько велосипедов за раз.");
    }
    public TooManyBikeException(String s){
        super(s);
    }
}
