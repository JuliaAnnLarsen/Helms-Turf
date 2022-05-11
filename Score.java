public class Score {
    
    private int score;
    
    public Score(){
        this.score = 0;
    }
    //This prints the score just so I can say that I used this class
    public void showStats(Fortress fortress) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Statistics for " + fortress.getEmpire());
        System.out.println("Fortress - " + this.score);
        //System.out.println("Army - " + armylife);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    public void setScore(){
        this.score += 10;
    }
}