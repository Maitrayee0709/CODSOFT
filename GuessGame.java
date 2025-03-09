import java .util.* ;
public class GuessGame{
    public static void main(String[] args){
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        int totalRounds=0;
        int roundsWon=0;
        while(true){
         int generatedNumber = rn.nextInt(101);
         int maxAttempts = 10;
         int attempts = 0;
         int userGuess = -1;

         System.out.println("welcome to the Guessing game");
         System.out.println("we have generated a number for you");
         System.out.println(" you have "+ maxAttempts + " attempts to guess the number");
         
         while(attempts < maxAttempts){
            System.out.println("enter your guess");
            userGuess = sc.nextInt();
            attempts++;

            if(generatedNumber > userGuess){
                System.out.println("too low! try again");
            }
            else if(generatedNumber < userGuess){
                System.out.println("too high! try again");       
            } else {
                roundsWon += 1;
                System.out.println(" congrats!!!! you've guessed the correct number "+ generatedNumber +" in "+ attempts +" attempts ");
                break;
            }
            
         }
         
         if ( attempts == maxAttempts && userGuess!= generatedNumber)
         {
            System.out.println("sorry! you've used all your attempts the correct number was"+ generatedNumber);
         }
         totalRounds++;
         System.out.println("Your current score: " + roundsWon + " rounds won out of " + totalRounds + " rounds played.");

         System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = sc.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing! Final Score: " + roundsWon + "/" + totalRounds + " rounds won.");
                break; 
            }


        }

    }
}