public class Fortress {
    private String empire;
    private int height;
    private String material;
    private int numTrebucht;
    //I was going to do an array list for the castle to show which side of the wall should appear but I figured out an alternate solution to make the castle show up
    private boolean[] fortressRow1;
    private boolean[] fortressRow2;
    //private Score score;
    
    // default constructor with set parameters
    public Fortress(){
        this.empire = "Unconquerable Stronghold";
        this.height = 50;
        this.material = "Stone";
        //this.wallThickness = 5;
        //this.moat = true;
        this.numTrebucht = 3;
    }
    
    // Constructor with all of the parameters
    public Fortress(String empire, int height, String material, int numTrebucht) {
        this.empire = empire;
        this.height = height;
        this.material = material;
        //this.wallThickness = wallThickness;
        //this.moat = maot;
        this.numTrebucht = numTrebucht;
    }
    
    /// Classes!!!!!!!!!!!!//
    // I was going to do something cool with these classes but I didn't have the time
    public String getEmpire() {
        return empire;
    }

    public void setEmpire(String empire) {
        this.empire = empire;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setHeight(int height){
        this.height = height;
    }
    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    /*
    public int destroyFortress(int damage) {
        setHeight(getHeight() - damage);
        return getHeight();
    }
    
    public int buildFortress(int constructing, boolean expand) {
        setHeight(height + constructing);
        return getHeight();
        
    }
    */
    
    public void show(){
        Graphics.printFortress(this);
        // draw after constructing the castle
        /// also draw after something happens to the height
    }

    
    public int getFortressHeight() {
        return this.height;
    }
    //tells if the fortress is defeated
    public boolean isFortressDefeated(){
        if (this.height < 40){
            return true;
        }
        else{
            return false;
        }
    }
}