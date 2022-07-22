package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            looping();

            System.out.println("\ndo you want to play again (y or n)");

            String str = scan.nextLine();
            if (str.equals("y")) {
                System.out.println("Welcome back!\n");
            }
            if (str.equals("n")) {
                System.out.println("goodbye");
                break;
            }
        }

    }

    public static void looping(){
            System.out.println("You are in a land full of dragons. In front of you, you see two caves.\n"
                    + "In one cave, the dragon is friendly and will share his treasure with you.\n"
                    + "The other dragon is greedy and hungry, and will eat you on sight.");
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("\nWhich cave will you go into? (1 or 2)");

            int one = 1;
            int two= 2;
            int random = (int) Math.floor(Math.random()*(two-one+1)+one);

            try {
            int choice = scan.nextInt();
            if (choice >= 3){
                System.out.println("Wrong input! Pick between 1 and 2");
                continue;
            }
            if (choice == random) {
                System.out.println("You approach the cave...\n"
                        + "It is dark and spooky...\n"
                        + "A large dragon jumps out in front of you! he opens his jaws and...\n"
                        + "Gobbles you down in one bite!");
                break;
            }
            System.out.println("a large dragon jumps out in front of you! he opens his jaws and...\n"
                    + "hands you his treasure!\n"
                    + "congratulation!!!!");
            break;

            } catch (Exception e){
                System.out.println("Not a correct input, Try again!");
            }
        }

    }
}




