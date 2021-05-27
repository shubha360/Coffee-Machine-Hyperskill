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

        printMachineState();

        System.out.println("\nWrite action (buy, fill, take):");
        String input = sc.nextLine();

        switch (input) {

            case "buy":
                buy();
                System.out.println();
                printMachineState();
                break;

            case "fill":
                fill();
                System.out.println();
                printMachineState();
                break;

            case "take":
                take();
                System.out.println();
                printMachineState();
                break;
        }
    }

    public static void buy() {

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int selection = sc.nextInt();

        switch (selection) {

            case 1:
                water -= 250;
                beans -= 16;
                cups--;
                money += 4;
                break;

            case 2:
                water -= 350;
                milk -= 75;
                beans -= 20;
                cups--;
                money += 7;
                break;

            case 3:
                water -= 200;
                milk -= 100;
                beans -= 12;
                cups--;
                money += 6;
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
    }

    public static void take() {

        System.out.println("I gave you $" + money);
        money = 0;
    }

    public static void printMachineState() {

        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }
}
