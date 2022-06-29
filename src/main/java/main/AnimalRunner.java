package main;


import java.util.Scanner;

public class AnimalRunner {

    

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        CanFly userBird = getUserBird(inputScanner);
        int monsterSpeed = getMonsterSpeed(inputScanner);

        int birdSpeed = userBird.fly();
        if (birdSpeed > monsterSpeed) {
            System.out.println("Your bird was fast enough to escape");
        } else {
            System.out.println("Your bird was not fast enough to escape :-(");
        }

        inputScanner.close();
    }

    private static CanFly getUserBird(Scanner inputScanner) {
        
        CanFly bird ;
        System.out.println("Please enter the type of bird you would like\n1. Pigeon\n2. Puffin");

        String sampleString = inputScanner.nextLine();
        int userSelection=getInput(sampleString);
        if (userSelection == 1) {
            bird= new Pigeon();
        } else if (userSelection == 2) {
            bird= new Puffin();
        } else {
            System.out.println("Input must be either 1 or 2.");
            bird=getUserBird(inputScanner);
        }

        return bird;

    }

    private static int getMonsterSpeed(Scanner inputScanner) {

            System.out.println("How fast can the monster fly (in mph)?");
            String sampleString = inputScanner.nextLine();
                int monsterSpeed = getInput(sampleString);
                if(monsterSpeed<0){
                    System.out.println("Invalid input for speed. Enter a number greater than or equal to 0.");
                   monsterSpeed=getMonsterSpeed(inputScanner); 
                }
            

            return monsterSpeed;
        
    }

    private static int getInput(String sampleString) {
        try {
            return Integer.parseInt(sampleString);
        } catch (Exception e) {

            return -1;
        }
    }
}
