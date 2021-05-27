package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);

        System.out.println("Write how many cups of coffee you will need:");

        final int totalCups = sc.nextInt();

        System.out.println("For " + totalCups + " cups of coffee you will need:");
        System.out.println((totalCups * 200) + " ml of water");
        System.out.println((totalCups * 50) + " ml of milk");
        System.out.println((totalCups * 15) + " g of coffee beans");
    }
}
