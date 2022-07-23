package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            play(1, 20);
            String response;

            System.out.println("Would you like to play again? (y or n)");
            response = sc.nextLine();
            if (response.equals("y")) {
                System.out.println("Welcome back!\n");
            }
            if (response.equals("n")) {
                System.out.println("Goodbye!!!");
                break;
            }
        }
    }

    public static void play(int min, int max){
        Scanner input = new Scanner(System.in);

        System.out.println("Hello! What is your name?");
        String name = input.nextLine();
        System.out.println("well, " + "\033[0;1m" + name + ", I am thinking of a number between 1 and 20.\n" +
                "You have six(6) trials\n");


        int random = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int guessCount = 0;

        while(guessCount <= 5) {
            System.out.println("take a guess.");

            try {
            int guess = input.nextInt();
            if (guess > 20) {
                System.out.println("Input out of range, Enter a number between 1 and 20\n");
                continue;
            }
            if (guess > random) {
                System.out.println("Your guess is to high.");
                guessCount++;
                continue;
            } else if (guess < random) {
                System.out.println("Your guess is to low");
                guessCount++;
                continue;
            }
            guessCount++;
            System.out.println("Good job, " + name + "! You guessed my number in " + guessCount + "\n");
            break;

            }catch (Exception ex){
                System.out.println("Wrong Input! Only number is accepted!");
                break;
            }
        }
    }
}
