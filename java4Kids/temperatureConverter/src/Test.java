public class Test {

    public static void main(String[] args) {
	    TemperatureConverter tC = new TemperatureConverter();
        System.out.println(tC.convertTemp(36, 'C'));
        System.out.println(tC.convertTemp(79,'F'));
        System.out.println(tC.convertTemp(79,'D'));

        //ReportCard rc = new ReportCard();           //При статическом методе это лишнее
        System.out.println("Grade is "+ReportCard.convertGrades(76));

        /*
         Хуйня получится, т.к. изза того что Девид первый в массиве(players[0])
         будет возвращаться в начало цикла из-за continue
         */
//        String[] players = {"David", "Daniel", "Anna", "Gregory"};
//        int totalPlayers = players.length;
//        int counter = 0;
//        while (counter<totalPlayers){
//
//            String thePlayer = players[counter];
//            if (thePlayer.equals("David")){             //ещё здесь на последней итеррации в консоле ругается , что нету player[4]
//                continue;
//            }
//            System.out.println("Congratulations, " + thePlayer + " !");
//            counter++;
//        }

    }
}
