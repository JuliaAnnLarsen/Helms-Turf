public class Weapon {
    /////////////////////////////////////////////////////
    // Instance Variables
    /////////////////////////////////////////////////////
    private String name;
    private String type;
    private int durability;
    private int baseDamage;

    /////////////////////////////////////////////////////
    // Constructors - add as you see fit
    /////////////////////////////////////////////////////

    // Default Constructor
    public Weapon() {
        this.name = "Trebutch";
        this.type = "catapult";
        //this.durability = 100;
        //this.baseDamage = 100;
    }

    // Constructor with all parameters
    /// this is the secret weapon ///
    public Weapon(String name, String type, int durability, int baseDamage) {
        this.name = name;
        this.type = type;
        this.durability = durability;
        this.baseDamage = baseDamage;
    }

    /////////////////////////////////////////////////////
    // Methods
    /////////////////////////////////////////////////////
/*
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }
    
    //this determines who's turn it is to attack I'm not really using it anymore...
    public void attackerDeterminer(int roll){
        if (roll % 2 == 0) {
            System.out.println("Your turn to attack! \n Attacking...");
        }
        else{
            System.out.println("Army's turn to attack! \n Attacking...");
        }
    }
    */
    public String destroyArmy(int num, BadGuy newArmy, Score score) {
        int armyGuy = (int) (Math.random() * (9));
        if (num % 2 == 0 && num <= 5) {
            if (newArmy.getDifficulty() == "hard") {
                //these will kill the guys that the random number equals
                if (newArmy.getArmyGuysRow1Value(armyGuy)) {
                    newArmy.killArmyGuyRow1(armyGuy);
                    score.setScore();
                    return "Your attack was a success";
                }
            }
            else {
                if (newArmy.alwaysKillGuyRow1 ()){
                    //have a bug that it will get to the last guy but will never kill him because of the probability this kinda solves the problem most of the time
                    //but not always
                    score.setScore();
                    return "Your attack was a success";
                }
            }
        }
        else if (num % 2 == 1 && num > 5){
            
            if (newArmy.getDifficulty() == "hard") {
                if (newArmy.getArmyGuysRow2Value(armyGuy)){
                    newArmy.killArmyGuyRow2(armyGuy);
                    score.setScore();
                    return "Your attack was a success";
                }
            }
            else {
                if (newArmy.alwaysKillGuyRow2 ()){
                    score.setScore();
                    return "Your attack was a success";
                }
            }
        }
        
        return "Your attack failed!"; // num = " + num + " armyGuy = " + armyGuy;
    }
        
    public String destroyFortress(int num, Fortress newFortress) {
        if (num % 2 == 0) {
            int decrease = (int) (newFortress.getHeight() / 16);
            newFortress.setHeight(newFortress.getHeight() - decrease);
            return "Army attack was a success";
        }
        else{
            return "Army failed an attack!";
        }
    }
    
    ////////////////////////////////////
    // Success of the Attack!!!!!!!! //
    //////////////////////////////////
    /*
    int max = 100;
        int min = 0;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
        return rand <= successRate;
        */
}