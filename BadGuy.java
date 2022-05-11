public class BadGuy {
    
/*
    private String name;

    // Items
    private Weapon weapon;

    // Hero Stats
    private int hitPoints;
    private int stamina;

    // Score
    private Score score;

    /////////////////////////////////////////////////////
    // Constructors
    /////////////////////////////////////////////////////

    // I have included 2 constructors, add other constructors for your program's use cases

    // Default Constructor
    public BadGuy() {
        // ** make sure that you are instantiating your instance variables **
        this.name = "Army";

        // Default weapon
        this.weapon = new Weapon();

        this.hitPoints = 100;
        this.stamina = 100;

        // Default score
        this.score = new Score();
    }

    // Constructor with all parameters
    public BadGuy(String name, Weapon weapon, int hitPoints, int stamina, Score score) {
        this.name = name;
        this.weapon = weapon;
        this.hitPoints = hitPoints;
        this.stamina = stamina;
        this.score = score;
    }

    /////////////////////////////////////////////////////
    // Class Methods
    /////////////////////////////////////////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public boolean isDead() {
        return this.hitPoints <= 0;
    }
    */
    /////////////////////////////////////////////////////
    // Instance Variables
    /////////////////////////////////////////////////////
    /// bad guy character is going to be the army //
    ///kinda like Lenagen verses the ants senerio///
    private String difficulty;
    private int armyNumbers;
    private boolean[] armyGuysRow1;
    private boolean[] armyGuysRow2;
    
    
    
    /////////////////////////////////////////////////////
    // Constructors
    /////////////////////////////////////////////////////
    
    public BadGuy() { 
        this.difficulty = "hard";
        this.armyNumbers = 800;
        armyGuysRow1 = new boolean[9];
        armyGuysRow2 = new boolean[9];
        //setArmyGuysDefaultValue ();
        setArmyGuysDefaultByNumber();
    }
    
    public BadGuy(int armyNumbers, String difficulty) { 
        this.difficulty = difficulty;
        this.armyNumbers = armyNumbers;
        armyGuysRow1 = new boolean[9];
        armyGuysRow2 = new boolean[9];
        //setArmyGuysDefaultByNumber ();
        setArmyGuysDefaultByNumber();
    }
    //determines how many guys show up when the army numbers are greater than a specific value
    public void setArmyGuysDefaultByNumber () {
        if (this.armyNumbers == 800) // 18
        {
            setArmyGuysDefaultValue();
        }
        else if (this.armyNumbers >= 700) // 17
        {
            setArmyGuysRow1OtherValue(true, true, true, false, true, true, true, true, true);
            setArmyGuysRow2OtherValue(true, true, true, true, true, true, true, true, true);
        }
        else if (this.armyNumbers >= 600) // 15
        {
            setArmyGuysRow1OtherValue(false, true, true, false, true, true, true, true, false);
            setArmyGuysRow2OtherValue(true, true, true, true, true, true, true, true, true);
        }
        else if (this.armyNumbers >= 500) // 14
        {
            setArmyGuysRow1OtherValue(false, true, true, false, true, false, true, true, false);
            setArmyGuysRow2OtherValue(true, true, true, true, true, true, true, true, true);
        }
        else if (this.armyNumbers >= 400) // 10
        {
            setArmyGuysRow1OtherValue(false, false, true, false, true, false, true, false, false);
            setArmyGuysRow2OtherValue(true, true, false, true, true, true, false, true, true);
        }
        else if (this.armyNumbers >= 300) // 8
        {
            setArmyGuysRow1OtherValue(false, false, true, false, true, false, true, false, false);
            setArmyGuysRow2OtherValue(false, true, true, false, true, false, true, true, false);
        }
        else if (this.armyNumbers >= 200) // 6
        {
            setArmyGuysRow1OtherValue(false, false, true, false, true, false, true, false, false);
            setArmyGuysRow2OtherValue(false, false, false, true, true, true, false, false, false);
        }
        else if (this.armyNumbers >= 100) // 5
        {
            setArmyGuysRow1OtherValue(false, false, true, false, false, false, true, false, false);
            setArmyGuysRow2OtherValue(true, false, true, false, true, false, true, false, true);
        }
        else if (this.armyNumbers >= 0) // 4
        {
            setArmyGuysRow1OtherValue(false, false, false, false, true, false, false, false, false);
            setArmyGuysRow2OtherValue(false, false, false, true, true, true, false, false, false);
        }
    }
    
    public void setArmyGuysDefaultValue () {
        // sets all army guys alive
        //if (armyNumbers < 800 || armyNumbers > 600)
        for(int i = 0; i <= 8; i++)
        {
            this.armyGuysRow1[i] = true; 
            this.armyGuysRow2[i] = true;
        }
    }
    public void setArmyGuysRow1OtherValue(boolean gr0, boolean gr1, boolean gr2, boolean gr3, boolean gr4, boolean gr5, boolean gr6, boolean gr7, boolean gr8){
            // sets army guys alive in row 1 based on boolean values
            this.armyGuysRow1[0] =  gr0; 
            this.armyGuysRow1[1] =  gr1;
            this.armyGuysRow1[2] =  gr2;
            this.armyGuysRow1[3] =  gr3;
            this.armyGuysRow1[4] =  gr4;
            this.armyGuysRow1[5] =  gr5;
            this.armyGuysRow1[6] =  gr6;
            this.armyGuysRow1[7] =  gr7;
            this.armyGuysRow1[8] =  gr8;
    }
    public void setArmyGuysRow2OtherValue(boolean gr0, boolean gr1, boolean gr2, boolean gr3, boolean gr4, boolean gr5, boolean gr6, boolean gr7, boolean gr8){
            // sets army guys alive in row 2 based on boolean values
            this.armyGuysRow2[0] =  gr0; 
            this.armyGuysRow2[1] =  gr1;
            this.armyGuysRow2[2] =  gr2;
            this.armyGuysRow2[3] =  gr3;
            this.armyGuysRow2[4] =  gr4;
            this.armyGuysRow2[5] =  gr5;
            this.armyGuysRow2[6] =  gr6;
            this.armyGuysRow2[7] =  gr7;
            this.armyGuysRow2[8] =  gr8;
    }       
    //test if specific guy is alive in the rows
    public boolean getArmyGuysRow1Value (int i) {
        return armyGuysRow1[i];
    }
    
    public boolean getArmyGuysRow2Value (int i) {
        return armyGuysRow2[i];
    }
    //prints the army
    public void show(){
        Graphics.printArmy(this);
        // draw after constructing the castle
        /// also draw after something happens to the height
    }
    //returns the army number
    public int getArmyNumber() {
        return this.armyNumbers;
    }
    //returns the difficulty aka army numbers
    public String getDifficulty () {
        return this.difficulty;
    }
    //tests if all of the army is dead
    public boolean isArmyGuysDefeated () {
        for(int i = 0; i <= 8; i++)
        {
            if (this.armyGuysRow1[i] == true) return false; 
            if (this.armyGuysRow2[i] == true) return false;
        }
        return true;
    }
    //helps with the probability when one guy is alive
    public boolean alwaysKillGuyRow1 () {
        for(int i = 0; i <= 8; i++) {
            if (this.armyGuysRow1[i] == true) {
                killArmyGuyRow1(i);
                return true;
            }
        }
        return false;
    }
    
    public boolean alwaysKillGuyRow2 () {
        for(int i = 8; i >= 0; i--) {
            if (this.armyGuysRow2[i] == true) {
                killArmyGuyRow2(i);
                return true;
            }
        }
        return false;
    }
    //kills specific army guy
    public void killArmyGuyRow1(int i) {
        this.armyGuysRow1[i] = false;
    }
    
    public void killArmyGuyRow2(int i) {
        this.armyGuysRow2[i] = false;
    }
    
    
    
}