public class TemperatureConverter {
    public String convertTemp(int temperature, char convertTo){

        return switch (convertTo) {
            case ('F') -> ("Temperature is " + temperature + " F");
            case ('C') -> ("Temperature is " + temperature + " C");
            default -> "What is it?";
        };

    }
}
