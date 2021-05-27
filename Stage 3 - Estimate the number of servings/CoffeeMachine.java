package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");

        int hasWater = sc.nextInt();
        hasWater /= 200;

        System.out.println("Write how many ml of milk the coffee machine has:");

        int hasMilk = sc.nextInt();
        hasMilk /= 50;

        System.out.println("Write how many grams of coffee beans the coffee machine has:");

        int hasBean = sc.nextInt();
        hasBean /= 15;

        System.out.println("Write how many cups of coffee you will need:");

        final int cupsNeeded = sc.nextInt();

        int possibleCups = Math.min(hasWater, Math.min(hasMilk, hasBean));

        if (cupsNeeded == possibleCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cupsNeeded < possibleCups) {
                System.out.println("Yes, I can make that amount of coffee (and even " + (possibleCups - cupsNeeded) + " more than that)");
        } else {
            System.out.println("No, I can make only " + possibleCups + " cup(s) of coffee");
        }
    }
}
