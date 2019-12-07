package com.seedling.main;

import java.util.Scanner;

public class Logic {

    private final Scanner in = new Scanner(System.in);
    private final CoffeeMachine coffeeMachine = new CoffeeMachine();

    public void startMenu() {

        OUTER:
        while (true) {
            System.out.println("[1 = Buy | 2 = Ingredients | 3 = Fill | 0 = Exit]\n> ");

            switch (in.nextInt()) {
                case 0: {
                    break OUTER;
                }
                case 1: {
                    buyMenu();
                    break;
                }
                case 2: {
                    System.out.printf("Current ingredients in the machine:%nWater: %dml%nMilk: %dml%nBeans: %dg",
                            coffeeMachine.getWater(), coffeeMachine.getMilk(), coffeeMachine.getBeans());
                    break;
                }
                case 3: {
                    fillMenu();
                    break;
                }
                default: {
                    System.out.println("$> No such choice!");
                    break;
                }
            }
        }
    }

    private void buyMenu() {

        OUTER:
        while (true) {
            System.out.print("What type of coffee do you want to buy:\n" +
                    "1= Black coffee\n" +
                    "2= Espresso\n" +
                    "3= Latte\n" +
                    "0= Back" +
                    "> ");

            switch (in.nextInt()) {
                case 0: {
                    break OUTER;
                }
                case 1: {
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                default: {
                    System.out.println("$> No such choice!");
                }
            }
        }


    }

    private void fillMenu() {

    }

}
