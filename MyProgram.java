import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        // Default values for testning the empire
        /*
        String userEmpire = "Castle"; // "";
        int userHeight = 800;   // 0;
        String userMaterial = "stone"; //""; // need to be set to "" to actually ask for the material ????????
        int usernumTrebucht = 5; // -1;
        
        String difficulty = "easy";   // ""; // need to be set to "" to actually ask for the difficulty ????????
        int armyNumbers = 800;
        */
        
        // instanciated values for running the program
        String userEmpire = ""; // "";
        int userHeight = 0;   // -0;
        String userMaterial = ""; //""; // need to be set to "" to actually ask for the material ????????
        int usernumTrebucht = -1; // -1;
        
        String difficulty = "";   // ""; // need to be set to "" to actually ask for the difficulty ????????
        int armyNumbers = 0;
        
        // scanner class
        Scanner input = new Scanner(System.in);
        
        
        //String empire, int height, String material, int wallThickness, boolean moat, int numTrebucht, 
        //original parameter that needed to be in the fortress constructor.
        while (userEmpire == "") {
            System.out.println("What do you want to name your empire?");
            userEmpire = input.nextLine();
            //name of the empire
        }
        
        while (userHeight > 801 || userHeight < 1 ) {
            System.out.println("How tall do you want your fortress to be: 0-800? (feet)");
            userHeight = input.nextInt();
            input.nextLine();
            //returns the height of the fortress to the graphics class and updates.
        }
        /*
        // Was originally going to use this to determine how fast the fortress got destroyed but wasn't able to finish it.
        while (!(userMaterial.equals("stone") || userMaterial.equals("wood") || userMaterial.equals("hay")))
        {
            System.out.println("What material would you like your fortress to be: stone, wood, or hay?");
            userMaterial = input.nextLine();
        }
        
        // for the weapon class
        // was going to have the army take down the tebuchts too but I ran out of time.
        while (usernumTrebucht > 5 || usernumTrebucht < 0) {
            System.out.println("How many trebutchs would you like on your fortress: 0-5?");
            usernumTrebucht = input.nextInt();
            input.nextLine();
        }
        */
        
        // for the army class
        //difficulty affects the probability of your winning your battle
        //also sets the amount of army that appears
        //relates to the:
        //alwaysKillGuyRow1
        //alwaysKillGuyRow2
        //meathods in the BadGuy Class
        while (! (difficulty.equals("easy") || difficulty.equals("medium") || difficulty.equals("hard")))
        {
            System.out.println("What difficulty level would you like? easy, medium, hard");
            difficulty = input.nextLine();
        }
        
        if (difficulty == "easy")
        {
            armyNumbers = 200;
        }
        else if (difficulty == "medium")
        {
            armyNumbers = 400;
        }
        else
        {
            armyNumbers = 800;
        }
        
        // draws original castle
        //Fortress object, yes I know that I am not using the userMaterial and usernumTrebucht
        Fortress newFortress = new Fortress(userEmpire, userHeight, userMaterial, usernumTrebucht);
        newFortress.show(); //this displays their fortress
        //Army object
        BadGuy newArmy = new BadGuy(armyNumbers, difficulty);
        newArmy.show(); //displays the army
        //weapon objects
        Weapon fortressWeapons = new Weapon();
        //this determines who attacks 
        Dice attacker = new Dice();
        //
        Dice destroyArmy = new Dice();
        Dice destroyFortress = new Dice();
        
        Score userScore = new Score();
        // draw original army 
        
        boolean playing = true;
        
        String ArmyAttack = "";
        String FortressAttack = "";
        boolean playagain = true;
        
            while (playing)
            {
                System.out.println("___________________________________________________________________________________");
                System.out.println("Welcome to Helms Turf (Inspire by Helms Deep from Lord of the Rings.");
                System.out.println("Objective: use your trebutchs to destroy the army before they destroy your fortress");
                System.out.println("Press ENTER to attack");
                input.nextLine();
                
                Graphics.clearScreen (); //scroll 500 times so that I don't have to constantly update
                int whoGoes = attacker.roll(); //determines who goes
                if (whoGoes % 2 == 0){
                    ArmyAttack = fortressWeapons.destroyArmy(destroyArmy.roll(), newArmy, userScore);

                    //for you to attack army
                }
                else {
                    FortressAttack = fortressWeapons.destroyFortress(destroyFortress.roll(), newFortress);

                    //for army to attack you
                }
                // redraw fortress and army beneath
                newFortress.show();
                newArmy.show();
                System.out.println("");
                System.out.println(FortressAttack);
                System.out.println(ArmyAttack);
                //checks if we are still playing
                if (newArmy.isArmyGuysDefeated() == true || newFortress.isFortressDefeated() == true) {
                    // All army men are dead.
                    playing = false; 
                }
            }
            userScore.showStats(newFortress);
            //prints the results
            if (newArmy.isArmyGuysDefeated() == true){
                System.out.println("You win! The army was destroyed!");
            }
            else{
                System.out.println("You lost! The fortress was destroyed!");
            }
            //Definetly knocking out the nested loop requirement
            int rating = 50;
            while (rating > 5 || rating <= 0 ) {
                while (rating != 5){
                    System.out.println("How would you rate this program on a scale of 1-5?");
                    rating = input.nextInt();
                    input.nextLine();
                }
            }
            System.out.println("Thanks for giving us a 5 star rating with 2 enthusiastic thumbs up!");
            
            
    }
}