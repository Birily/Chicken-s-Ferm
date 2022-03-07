public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String userGuess1 = "2";
        String result1 = dot.checkYourself(userGuess1);
        String userGuess2 = "2";
        String result2 = dot.checkYourself(userGuess2);
    }
}
