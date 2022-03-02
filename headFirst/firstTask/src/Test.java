public class Test {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x <5){
            //y=x-y;
            //y+=x;
//            y+=2;
//            if(y>4){
//                y-=1;
//            }
//            x+=1;
//            y+=x;
            if(y<5){
                x+=1;
                if(y<3){
                    x-=1;
                }
            }
            y+=2;
            System.out.print(x+""+y+" ");
            x+=1;
        }
    }
}
