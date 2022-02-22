public class TestArguments {
    public static void main(String[] args) {
        int numberOfArg = args.length;
        for (int i=0;i<numberOfArg;i++){
            System.out.println("I've got "+ args[i]);
        }
    }
}