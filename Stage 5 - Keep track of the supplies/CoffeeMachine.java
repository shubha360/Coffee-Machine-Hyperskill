package machine;

import java.util.Scanner;

public class CoffeeMachine {
    
    final static Scanner sc = new Scanner(System.in);

    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;

    public static void main(String[] args) {

        while (true) {

            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String input = sc.nextLine();
            System.out.println();

            switch (input) {

                case "buy":
                    buy();
                    break;

                case "fill":
                    fill();
                    break;

                case "take":
                    take();
                    break;

                case "remaining":
                    printMachineState();
                    break;

                case "exit":
                    return;
            }
        }
    }

    public static void buy() {

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String selection = sc.nextLine();

        switch (selection) {

            case "1":

                if (water < 250) {
                    System.out.println("Sorry, not enough water!\n");
                } else if (beans < 16) {
                    System.out.println("Sorry, not enough beans!\n");
                } else if (cups < 1) {
                    System.out.println("Sorry, not enough disposable cups!\n");
                } else {

                    System.out.println("I have enough resources, making you a coffee!\n");
                    water -= 250;
                    beans -= 16;
                    cups--;
                    money += 4;
                }
                break;

            case "2":

                if (water < 350) {
                    System.out.println("Sorry, not enough water!\n");
                } else if (milk < 75) {
                    System.out.println("Sorry, not enough milk!\n");
                } else if (beans < 20) {
                    System.out.println("Sorry, not enough beans!\n");
                } else if (cups < 1) {
                    System.out.println("Sorry, not enough disposable cups!\n");
                } else {

                    System.out.println("I have enough resources, making you a coffee!\n");
                    water -= 350;
                    milk -= 75;
                    beans -= 20;
                    cups--;
                    money += 7;
                }
                break;

            case "3":

                if (water < 200) {
                    System.out.println("Sorry, not enough water!\n");
                } else if (milk < 100) {
                    System.out.println("Sorry, not enough milk!\n");
                } else if (beans < 12) {
                    System.out.println("Sorry, not enough beans!\n");
                } else if (cups < 1) {
                    System.out.println("Sorry, not enough disposable cups!\n");
                } else {

                    System.out.println("I have enough resources, making you a coffee!\n");
                    water -= 200;
                    milk -= 100;
                    beans -= 12;
                    cups--;
                    money += 6;
                }
                break;

            case "back":
                break;
        }
    }

    public static void fill() {

        System.out.println("Write how many ml of water do you want to add:");
        water += sc.nextInt();

        System.out.println("Write how many ml of milk do you want to add:");
        milk += sc.nextInt();

        System.out.println("Write how many grams of coffee beans do you want to add:");
        beans += sc.nextInt();

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cups += sc.nextInt();

        sc.nextLine();

        System.out.println();
    }

    public static void take() {

        System.out.println("I gave you $" + money);
        money = 0;
        System.out.println();
    }

    public static void printMachineState() {

        System.out.println("\nThe coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money\n");
    }
}
