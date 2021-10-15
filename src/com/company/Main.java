package com.company;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        boolean play = false;
        System.out.println("Welcome to Blackjack");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        boolean again=true;
        while (again) {
            
            int total = (random.nextInt(11) + 1);
            System.out.println("Your first card is " + total);
            while (!play) {
                System.out.println("Would you like to take another card Y or N?");

                String choice = scanner.nextLine();
                if (Objects.equals(choice, "Y")) {
                    total = ((random.nextInt(11)) + total + 1);
                    System.out.println("Your total is " + total);
                    if (total > 21) {
                        System.out.println("You have gone bust");
                        total = 0;
                        play=true;
                    }
                } else {
                    play = true;
                }

            }
            int computerTotal = (random.nextInt(11) + 1 + (random.nextInt(11) + 1));
            System.out.println("The computers total is " + computerTotal);
            if (total > computerTotal) {
                System.out.println("You win");
                score=score+1;
            } else if (total < computerTotal) {
                System.out.println("You lose");
            } else {
                System.out.println("It's a draw");
            }
            System.out.println("Do you wan to play again Y or N?");
            String yOrN=scanner.nextLine();
            System.out.println("Your score is "+score);
            if (yOrN=="Y"){
                again=false;
            }





        }
    }
}
