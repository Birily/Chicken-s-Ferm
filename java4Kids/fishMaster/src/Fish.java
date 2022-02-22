public class Fish {
    int currentDepth = 0;
    final int DEFAULT_DIVING = 5;

    public Fish(int startingPosition) {
        this.currentDepth = startingPosition;
    }

    public Fish(){
        this.currentDepth=10;

    }

    public int dive(int howDeep){
        this.currentDepth += howDeep;
        if (currentDepth>100){
            System.out.println("Я маленькая рыбка и не могу плавать глубже 100 местров");
            this.currentDepth -= howDeep;
        } else {
            System.out.println("Погружаюсь ещё на "+howDeep+" метров");
            System.out.println("Я на глубине "+currentDepth+" метров");
        }
        return currentDepth;
    }
    public int dive(){
        this.currentDepth +=DEFAULT_DIVING;
        if (currentDepth>100){
            System.out.println("Я маленькая рыбка и не могу плавать глубже 100 метров");
            this.currentDepth -= DEFAULT_DIVING;
        } else {
            System.out.println("Погружаюсь ещё на "+DEFAULT_DIVING+" местров");
            System.out.println("Я на глубине "+currentDepth+" метров");
        }
        return currentDepth;
    }

    public String say(String something){
        return "Разве вы не знаете что рыбы не говорят?";
    }
    public void sleep(){
        System.out.println("Спокойной ночи! До завтра!");
    }


}
