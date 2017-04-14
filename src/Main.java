/**
 * Created by aleker on 14.04.17.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static class Florists {
        private static List<Plant> allPlantsTypes = new ArrayList<>(
                Arrays.asList(
                        new Flower("rose", BeeAttractiveChecker.Colour.RED, 20),
                        new Flower("rose", BeeAttractiveChecker.Colour.YELLOW, 15),
                        new Flower("tulip", BeeAttractiveChecker.Colour.WHITE, 22),
                        new Flower("orchid", BeeAttractiveChecker.Colour.ORANGE, 8),
                        new Leaf("buxus", 5.5f)
                )
        );

        static void displayPlantsInformation() {
            System.out.println("Florist's:");
            for (int i = 0; i < allPlantsTypes.size(); i++) {
                System.out.println(i + ":");
                allPlantsTypes.get(i).showInformation();
            }
        }

    }

    public static void main(String[] args) {
        Florists.displayPlantsInformation();
        Bouquet bouquet = new Bouquet();


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nIf you want to add plant to bouquet: enter number of plant.");
            System.out.println("If you want to remove plant from bouquet: type \"r\".");
            System.out.println("If you want to buy bouquet and quit: type \"b\".");

            if (scanner.hasNext("b")) {
                scanner.close();
                bouquet.sell();
                exit(0);
            }

            else if (scanner.hasNext("r")) {
                System.out.println("\nYOUR BASKET:");
                bouquet.showInformation();
                scanner.next();

                System.out.println("If you want to remove plant from bouquet: Enter id number of plant you want to remove.");
                if (scanner.hasNextInt()) {
                    int chosenNumber = scanner.nextInt();
                    if (chosenNumber >= 0 && chosenNumber < bouquet.getSizeOfBouquet()) {
                        bouquet.removePlant(bouquet.getElementById(chosenNumber));
                    }
                    else {
                        System.out.println("Number is out of boundary!");
                    }
                }
            }

            else if (scanner.hasNextInt()) {
                int chosenNumber = scanner.nextInt();
                if (chosenNumber >= 0 && chosenNumber < Florists.allPlantsTypes.size()) {
                    bouquet.addPlant(Florists.allPlantsTypes.get(chosenNumber));
                }
                else {
                    System.out.println("Number is out of boundary!");
                }
            }

            else {
                System.out.println("Please enter the number of chosen plant or type \"q\" to exit.");
                scanner.next();
            }
        }
    }
}