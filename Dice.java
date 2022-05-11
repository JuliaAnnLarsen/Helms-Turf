public class Dice {
    // d20 dice
    //except now it is 10
    public static int roll() {
        return (int) (Math.random() * (10 - 1) + 1);
    }
}