import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    private static void makeAGuess(){
		Scanner scan = new Scanner(System.in);// Create a Scanner object   	 
    	
    	
     if(scan.hasNextDouble()){
        double input = scan.nextDouble();
        if(input == rnd_number ){
            System.out.println("Your guessed right. The correct guess is: " + rnd_number);
         }else if (input < rnd_number ){
        System.out.println("Your guess is too low");
        makeAGuess();

        }else if (input > rnd_number ){
             System.out.println("Your guess is too high");
                 makeAGuess();
    }else {
            System.out.println("Error: Please enter a numeric value.");
            scan.nextLine(); 
            makeAGuess(); 
        }

     }
        

    }
}
   

