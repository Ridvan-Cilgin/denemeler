package footballPlayer;

public class FootballPlayer {
     int no;
     String name;
     int minutes;
     boolean inPlay;
     int numberOfGoals;

    public void play(int i) {
        minutes = minutes +i;
    }

    public void score() {
        numberOfGoals++;
    }
}
