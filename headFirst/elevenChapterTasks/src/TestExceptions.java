//page 359
public class TestExceptions {
    public static void main(String[] args) {

//        String test = "Нет";
//        Начало try
//        Начало опасного метода
//        Конец опасного метода
//        Конец try
//        finally
//        Конец main
        String test = "Да";
//        Начало try
//        Начало опасного метода
//        Жуткое исключение
//        finally
//        Конец main
        try {
            System.out.println("Начало try");
            doRisky(test);
            System.out.println("Конец try");
        } catch (Exception e) {
            System.out.println("Жуткое исключение");
        } finally {
            System.out.println("finally");
        }
        System.out.println("Конец main");
    }

    static void doRisky(String test) throws Exception {
        System.out.println("Начало опасного метода");
        if ("Да".equals(test)) {
            throw new Exception();
        }
        System.out.println("Конец опасного метода");

    }

}

