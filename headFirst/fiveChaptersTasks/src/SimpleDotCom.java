public class SimpleDotCom {
    int[] locationCells;
    int numOfHints=0;

    public static void main(String[] args) {

    }

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        for (int cell : locationCells){
            if (guess==cell){
                result = "Попал!";
                numOfHints++;
                break;
            }
        }
        if (numOfHints == locationCells.length){
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}
