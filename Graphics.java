public class Graphics {

    //private Fortress fortress;
    //private BadGuy army;
    //This is the castle
    public static void printFortress(Fortress fortress){
        //prints this regardless of the value
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("                __    __    __    __    __    __    __");
        System.out.println("               l  l__l  l__l  l__l  l__l  l__l  l__l  l");
        System.out.println("               l                                      l");
        //
        if (fortress.getFortressHeight() <= 800 && fortress.getFortressHeight() > 600)
        {
            System.out.println("               l                                      l");
            System.out.println("               l                                      l");
            System.out.println("               l                                      l");
            System.out.println("               l                                      l");
            System.out.println("               l                                      l");
            
        }
        else if (fortress.getFortressHeight() < 600 && fortress.getFortressHeight() > 400)
        {
            System.out.println("               l                                      l");
            System.out.println("               l                                      l");
            System.out.println("               l                                      l");
            System.out.println("               l                                      l");
        }
        else if (fortress.getFortressHeight() < 400 && fortress.getFortressHeight() > 200)
        {
            System.out.println("               l                                      l");
        }
        else if (fortress.getFortressHeight() < 200 && fortress.getFortressHeight() > 100)
        {
            System.out.println("               l                                      l");
            System.out.println("               l                                      l");
        }
        else if (fortress.getFortressHeight() < 100 && fortress.getFortressHeight() > 80)
        {
            System.out.println("               l                                      l");
        }
        
        System.out.println(" __    __    __l                                      l__    __    __");
        System.out.println("l  l__l  l__l  l______________________________________l  l__l  l__l  l");
        if (fortress.getFortressHeight() > 80 && fortress.getFortressHeight() > 60)
        {
        System.out.println("l              l                                      l              l");
        System.out.println("l              l                                      l              l");
        }
        if (fortress.getFortressHeight() > 60 && fortress.getFortressHeight() > 40)
        {
        System.out.println("l              l                                      l              l");
        System.out.println("l              l                                      l              l");
        System.out.println("l              l                                      l              l");
        }
        if (fortress.getFortressHeight() > 40 && fortress.getFortressHeight() > 20)
        {
        System.out.println("l              l                                      l              l");
        System.out.println("l  __          l                                      l              l");
        System.out.println("l l__l         l              _________               l              l");
        System.out.println("l __l__l       l             l  l   l  l              l              l");
        System.out.println("l___l          l             l  l   l  l              l           __ l");
        System.out.println("l              l             l  l   l  l              l         _l___l");
        System.out.println("l              l             l  l   l  l              l        l__l  l");
        System.out.println("l              l             l  l   l  l              l          l___l");
        }
        if (fortress.getFortressHeight() > 20 && fortress.getFortressHeight() > 10)
        {
        System.out.println("l______________l_____________l__l___l__l______________l______________l");
        }
        /*
        if (fortress.getFortressHeight() < 10)
        {
            System.out.println("No castle!!!");
        }
        */
        System.out.println("\n");
        System.out.println("\n");
    }
    
    /* this was the original army but I had a lot of difficulties making the guys disappear and I wanted the guys to do a lot more 
    so I ended up going a completely different route to solve the problem
    public static void printArmy(BadGuy army)
    {
        // finish the badGuy class to replace army with r
        if (army.getArmyNumber() > 100)
        {
            System.out.println(" o o o o o o o o o");
            for (int r = (army.getArmyNumber() / 100) - 2; r >= 0; r--)
            {
                int line = 2;
                if (line % 2 == 0)
                {
                    for(int i = 0; i <= 8; i++)
                    {
                        System.out.print("o");
                        if (i < 8)
                        {
                            System.out.print("l");
                        }
                        else
                        {
                            System.out.print("l \n");
                        }
                        line++;
                    }
                }
                if (line % 2 == 1)
                {
                    for (int j = 0; j <= 8; j++)
                    {
                        System.out.print("l");
                        if (j < 8)
                        {
                            System.out.print("o");
                        }
                        else
                        {
                            System.out.print("o \n");
                        }
                        line++;
                    }
                }
            }
            System.out.println(" l l l l l l l l l");
        }
        else
        {
            System.out.println("army has been defeated!");
        }
        
    }
    */
    
    
    // prints the army in each row
    public static void printArmy(BadGuy army)
    {
        printRowWithKnights (army);
        printRowWithKing (army);
    }
    
//looks weird because is condensed if statements
// iterates over the row and prints the army guy if they are alive or a blank. 
// each army guy is 7 char wide and 7 lines deep.  
// when printing do not print end of line until after each guy
public static void printRowWithKnights (BadGuy army) {
    for (int r = 1; r <= 6; r++) {
        //r represents the line of the guy needed to print
        if (army.getArmyGuysRow1Value(0) == true) { printBowMan (r); } else {  printBlank(r); }
        if (army.getArmyGuysRow1Value(1) == true) { printPesantWithSpear (r); } else {  printBlank(r); }
        if (army.getArmyGuysRow1Value(2) == true) { printPesantWithSword (r); } else {  printBlank(r); }
        if (army.getArmyGuysRow1Value(3) == true) { printKnight (r); } else {  printBlank(r); }
        if (army.getArmyGuysRow1Value(4) == true) { printKnight (r); } else {  printBlank(r); }
        if (army.getArmyGuysRow1Value(5) == true) { printKnight (r); } else {  printBlank(r); }
        if (army.getArmyGuysRow1Value(6) == true) { printPesantWithSword (r); } else {  printBlank(r); }
        if (army.getArmyGuysRow1Value(7) == true) { printPesantWithSpear (r); } else {  printBlank(r); }
        if (army.getArmyGuysRow1Value(8) == true) { printBowMan (r); } else {  printBlank(r); }
        System.out.println("");
    }
}
public static void printRowWithKing (BadGuy army) {
    for (int r = 1; r <= 6; r++) {
        //r represents the line of the guy needed to print
        if (army.getArmyGuysRow2Value(0) == true) { printBowMan (r); } else {  printBlank(r); }
        if (army.getArmyGuysRow2Value(1) == true) { printPesantWithSpear (r) ; } else {  printBlank(r); }
        if (army.getArmyGuysRow2Value(2) == true) { printPesantWithSword (r); } else {  printBlank(r); }
        if (army.getArmyGuysRow2Value(3) == true) { printKnight (r); } else {  printBlank(r); }
        if (army.getArmyGuysRow2Value(4) == true) { printKing (r) ; } else {  printBlank(r); }
        if (army.getArmyGuysRow2Value(5) == true) { printKnight (r) ; } else {  printBlank(r); }
        if (army.getArmyGuysRow2Value(6) == true) { printPesantWithSword (r); } else {  printBlank(r); }
        if (army.getArmyGuysRow2Value(7) == true) { printPesantWithSpear (r); } else {  printBlank(r); }
        if (army.getArmyGuysRow2Value(8) == true) { printBowMan (r); } else {  printBlank(r); }
        System.out.println("");
    }
}
///////////////// All of these are guys that are going to be printed

//switch statement that is basically helps so I don't have to do a bunch of if and elif statements.. 
//cases are basicallly if and else statements that check the value of r and print the line needed for the guy
//in this program we iterate over each line the r is set to one thus case starts on case one
//basically iterates r=1 print case1 r=2 print case2 r=3 print case3 etc
// Knight 
public static void printKnight (int r) {
    switch (r) {
        case 1: System.out.print("     | "); //is a print because those in this case1 are going to print on the case line
        break;
        case 2: System.out.print("  O  | ");//ditto
        break;
        case 3: System.out.print("()Y==o ");
        break;
        case 4: System.out.print(" /_\\   ");
        break;
        case 5: System.out.print("_|_|___");
        break;
        case 6: System.out.print("       ");
        break;
    }
}

// Bow Man
public static void printBowMan (int r) {
    switch (r) {
        case 1: System.out.print("       ");
        break;
        case 2: System.out.print("  O )  ");
        break;
        case 3: System.out.print(" <|-}> ");
        break;
        case 4: System.out.print(" /_\\)  ");
        break;
        case 5: System.out.print("_]_[___");
        break;
        case 6: System.out.print("       ");
        break;
    }
}



// Pesant with sword
public static void printPesantWithSword (int r) {
    switch (r) {
        case 1: System.out.print("       ");
        break;
        case 2: System.out.print(" \\  o  ");
        break;
        case 3: System.out.print("  \\/|> ");
        break;
        case 4:  System.out.print("   /\\  ");
        break;
        case 5:  System.out.print("___\\_\\_");
        break;
        case 6: System.out.print("       ");
        break;
    }
}

// Pesant with spear and shield
public static void printPesantWithSpear (int r) {
    switch (r) {
        case 1: System.out.print("        ");
        break;
        case 2: System.out.print(" ^  o   ");
        break;
        case 3: System.out.print(" | /|\\| ");
        break;
        case 4: System.out.print(" | /\\ | ");
        break;
        case 5: System.out.print("_|_\\_\\_ ");
        break;
        case 6: System.out.print("        ");
        break;
    }
}

// King
public static void printKing (int r) {
    switch (r) {
        case 1: System.out.print(" [A] | ");
        break;
        case 2: System.out.print("  O  | ");
        break;
        case 3: System.out.print("()|==o ");
        break;
        case 4: System.out.print(" /_\\   "); 
        break;
        case 5: System.out.print("_|_|____");
        break;
        case 6: System.out.print("       ");
    }
}

public static void printBlank (int r) {
    System.out.print("       ");
}

public static void clearScreen () {
    for (int i = 0; i < 500; i ++)
        System.out.println("");
} 


 

}