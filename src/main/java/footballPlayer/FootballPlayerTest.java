package footballPlayer;


public class FootballPlayerTest {
    public static void main(String[] args) {
        FootballPlayer alex = new FootballPlayer();
        alex.no = 10;
        alex.name = "Alex De Souza";
        alex.minutes = 0;
        alex.inPlay = true;
        alex.numberOfGoals = 0;


        alex.play(90);
        alex.score();
        alex.score();


        System.out.println("Number of goals Alex scored: "

                + alex.numberOfGoals); // number of goals 2
        System.out.println("Alex played totally " + alex.minutes

                + " minutes so far."); // minutes is 90



        alex.play(60);
        alex.score();
 

        System.out.println("Number of goals Alex scored: "

                + alex.numberOfGoals); // number of goals 2
        System.out.println("Alex played totally " + alex.minutes

                + " minutes so far."); // minutes is 90


        
        

        FootballPlayer oguzhan = new FootballPlayer();
        oguzhan.no = 10;
        oguzhan.name = "Oğuzhan";
        oguzhan.minutes = 0;
        oguzhan.inPlay = true;
        oguzhan.numberOfGoals = 0;


        oguzhan.play(90);
        oguzhan.score();
        oguzhan.score();


        System.out.println("Number of goals oguzhan scored: "

                + oguzhan.numberOfGoals); // number of goals 2
        System.out.println("oguzhan played totally " + oguzhan.minutes

                + " minutes so far."); // minutes is 90



        oguzhan.play(60);
        oguzhan.score();


        System.out.println("Number of goals oguzhan scored: "

                + oguzhan.numberOfGoals); // number of goals 2
        System.out.println("oguzhan played totally " + oguzhan.minutes

                + " minutes so far."); // minutes is 90

    }
}
