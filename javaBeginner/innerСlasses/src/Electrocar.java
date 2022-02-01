public class Electrocar {
    private int id;
    // В случае когда объект можно разложить на объекты можно делоть так
    private class Motor{
        public void startMotor(){
            System.out.println("Motor "+id+" is starting...");
        }
    }

    // Статический вложенный класс. может получать доступ только к статическим полям класса ЭлектромашЫны
    public static class Battery{
        public static void charge(Electrocar electrocar){
            System.out.println("Electrocar's "+electrocar.id+" is charging...");
        }
    }

    public Electrocar(int id){
        this.id=id;
    }
    public void start(){
        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("Electrocar "+id+" is starting...");

        final int X = 1;
        class SomeClass{
            public void someMethod(){
                System.out.println(X);
                System.out.println(id);
            }
        }

        SomeClass someClass = new SomeClass();
        test(someClass);
        someClass.someMethod();



    }
    private void test(Object obj){
        System.out.println("А чё тут тестировать? - Хуй знает..");
    }
}
