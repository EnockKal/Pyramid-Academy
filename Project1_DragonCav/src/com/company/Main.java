package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("You are in a land full of dragons. In front of you, you see two caves.\n"
                    + "In one cave, the dragon is friendly and will share his treasure with you.\n"
                    + "The other dragon is greedy and hungry, and will eat you on sight.");
            System.out.println("\nWhich cave will you go into? (1 or 2)");

            String str = scan.nextLine();

            if (str.equals("1"))
                System.out.println("You approach the cave...\n"
                        + "It is dark and spooky...\n"
                        + "A large dragon jumps out in front of you! he opens his jaws and...\n"
                        + "Gobbles you down in one bite!");
            if (str.equals("2"))
                System.out.println("a large dragon jumps out in front of you! he opens his jaws and...\n"
                        + "hands you his treasure!\n"
                        + "congratulation");
            if (!str.equals("1") && !str.equals("2")) {
                System.out.println("wrong input!!!\n");
                continue;
            }

            System.out.println("\ndo you want to play again (y or n)");

            str = scan.nextLine();
            if (str.equals("y")) {
                System.out.println("Welcome back!\n");
            }
            else if (str.equals("n"))
                break;
        }
    }
}