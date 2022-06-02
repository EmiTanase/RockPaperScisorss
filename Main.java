package com.company;
import java.util.Random;
import java.util.Scanner;

 class RockPaperScissors {
    public static void main(String[] args) {
        int YourScore = 0;
        int ComputerScore = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];
            String playerMove;

            while (true) {
                System.out.println("Please enter your move (r (rock), p (paper), s (scissors))");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("s") || playerMove.equals("p")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move.");
            }
            System.out.println("Computer played " + computerMove);
            if (playerMove.equals(computerMove)) {
                System.out.println("It's a draw!");
                System.out.println("Your score: " + YourScore);
                System.out.println("Computer score: " + ComputerScore);
            } else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.println("You lose :(");
                    ComputerScore++;
                    System.out.println("Computer score: " + ComputerScore);
                    System.out.println("Your score: " + YourScore);
                } else if (computerMove.equals("s")) {
                    System.out.println("You win!");
                    ++YourScore;
                    System.out.println("Your score: " + YourScore);
                    System.out.println("Computer score: " + ComputerScore);
                    }
                }
            else if (playerMove.equals("p")) {
                if (computerMove.equals("s")) {
                    System.out.println("You lose :(");
                    ComputerScore++;
                    System.out.println("Computer score: " + ComputerScore);
                    System.out.println("Your score: " + YourScore);
                } else if (computerMove.equals("s")) {
                    System.out.println("You win!");
                    ++YourScore;
                    System.out.println("Your score: " + YourScore);
                    System.out.println("Computer score: " + ComputerScore);
                    }
                }
                else if (playerMove.equals("s")) {
                  if (computerMove.equals("r")) {
                    System.out.println("You lose :(");
                      ComputerScore++;
                      System.out.println("Computer score: " + ComputerScore);
                      System.out.println("Your score: " + YourScore);
                 } else if (computerMove.equals("p")) {
                    System.out.println("You win!");
                      ++YourScore;
                      System.out.println("Your score: " + YourScore);
                      System.out.println("Computer score: " + ComputerScore);
                 }
                 }
            System.out.println("Play again? (y/n)");
                String playAgain = scanner.nextLine();
                if (!playAgain.equals("y")) {
                    break;
                }
                    }
                }
            }
