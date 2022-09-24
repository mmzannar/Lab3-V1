import java.util.Scanner;


public class Lab {

    public static void main(String[] args) {

        while (playAgain.equalsIgnoreCase("y"));
        {
            System.out.println();



            String playerChoice = "";
            Scanner keyboard = new Scanner(System.in);




            while (!playerChoice.equalsIgnoreCase("Rock") &&
                    !playerChoice.equalsIgnoreCase("Paper")
                    && !playerChoice.equalsIgnoreCase("Scissors") &&
                    !playerChoice.equalsIgnoreCase("Lizard") &&
                    !playerChoice.equalsIgnoreCase("Spock")) {
                System.out.println("Let's play Rock, Paper, Scissors, Lizard, Spock. You pick first.");
                playerChoice = keyboard.nextLine();


            }


            for (int number = 0; number < 1; number++) {
                int randomNumber = (int) (Math.random() * 5) + 1;

                if (randomNumber == 1) {
                    System.out.println("I pick Rock");
                } else if (randomNumber == 2) {
                    System.out.println("I pick Paper");
                } else if (randomNumber == 3) {
                    System.out.println("I pick Scissors");
                } else if (randomNumber == 4) {
                    System.out.println("I pick Lizard");
                } else if (randomNumber == 5) {
                    System.out.println("I pick Spock");
                }

                String computerChoice = String.valueOf(randomNumber);


                if (playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("1")) {
                    System.out.println("It's a tie!");
                } else if (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("2")) {
                    System.out.println("It's a tie!");
                } else if (playerChoice.equalsIgnoreCase("Lizard") && computerChoice.equalsIgnoreCase("4")) {
                    System.out.println("It's a tie!");
                } else if (playerChoice.equalsIgnoreCase("Spock") && computerChoice.equalsIgnoreCase("5")) {
                    System.out.println("It's a tie!");
                } else if (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("3")) {
                    System.out.println("It's a tie!");
                } else if (playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("2")) {
                    System.out.println("You Lose!");
                } else if (playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("3")) {
                    System.out.println("You Win!");
                } else if (playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("4")) {
                    System.out.println("You Win!");
                } else if (playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("5")) {
                    System.out.println("You Lose!");
                } else if (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("1")) {
                    System.out.println("You Win!");
                } else if (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("3")) {
                    System.out.println("You Lose!");
                } else if (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("4")) {
                    System.out.println("You Lose!");
                } else if (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("5")) {
                    System.out.println("You Win!");
                } else if (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("1")) {
                    System.out.println("You Lose!");
                } else if (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("2")) {
                    System.out.println("You Win!");
                } else if (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("4")) {
                    System.out.println("You Lose!");
                } else if (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("5")) {
                    System.out.println("You Win!");
                } else if (playerChoice.equalsIgnoreCase("Lizard") && computerChoice.equalsIgnoreCase("1")) {
                    System.out.println("You Win!");
                } else if (playerChoice.equalsIgnoreCase("Lizard") && computerChoice.equalsIgnoreCase("2")) {
                    System.out.println("You Lose!");
                } else if (playerChoice.equalsIgnoreCase("Lizard") && computerChoice.equalsIgnoreCase("3")) {
                    System.out.println("You Lose!");
                } else if (playerChoice.equalsIgnoreCase("Lizard") && computerChoice.equalsIgnoreCase("5")) {
                    System.out.println("You Win!");
                } else if (playerChoice.equalsIgnoreCase("Spock") && computerChoice.equalsIgnoreCase("1")) {
                    System.out.println("You Lose!");
                } else if (playerChoice.equalsIgnoreCase("Spock") && computerChoice.equalsIgnoreCase("2")) {
                    System.out.println("You Win!");
                } else if (playerChoice.equalsIgnoreCase("Spock") && computerChoice.equalsIgnoreCase("3")) {
                    System.out.println("You Lose!");
                } else if (playerChoice.equalsIgnoreCase("Spock") && computerChoice.equalsIgnoreCase("4")) {
                    System.out.println("You Win!");
                }
                System.out.println("Do you want to play again? (y/n)");
                String playAgain = keyboard.nextLine();
            }
        }

        }


    }

























