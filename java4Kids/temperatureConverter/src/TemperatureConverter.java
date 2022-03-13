public class TemperatureConverter {
    public String convertTemp(int temperature, char convertTo){

        return switch (convertTo) {
            case ('F') -> ("Temperature is " + (((double)temperature*9/5)+32) + " F");
            case ('C') -> ("Temperature is " + (((double)temperature-32)*5/9) + " C");
            default -> "What is it?";
        };

    }
}
