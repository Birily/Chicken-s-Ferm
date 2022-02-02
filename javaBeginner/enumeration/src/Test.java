public class Test {
    // Object -> Enum -> Season
    // Объекты Enum'a - статические (константы)
    public static void main(String[] args) {
        Animal animal = Animal.CAT;
//
//        switch (animal){
//            case CAT -> System.out.println("It's a cat!");
//            case DOG -> System.out.println("It's a dog!");
//
//        }

        Season season = Season.SUMMER;
//
//        System.out.println(season instanceof Enum);
//        System.out.println(season instanceof Season);
//
//        switch (season){
//            case SUMMER -> System.out.println("It's warm outside!");
//            case AUTUMN -> System.out.println("It's wet outside!");
//            case WINTER -> System.out.println("It's cold outside!");
//        }
//
//        System.out.println(season.getClass());


//        System.out.println(animal.getTranslation());
        System.out.println(animal.name());
        System.out.println(season.getTemperature());
        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());
        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());


    }
}
