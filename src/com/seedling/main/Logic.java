package com.seedling.main;

import java.util.Scanner;

public class Logic {

    private final Scanner in = new Scanner(System.in);
    private final CoffeeMachine coffeeMachine = new CoffeeMachine(1000, 500, 200);

    private final int[] espressoRecipe = {30, 0, 8};
    private final int[] blackCoffeeRecipe = {300, 0, 20};
    private final int[] latteRecipe = {60, 180, 16};

    public void startMenu() {

        System.out.println("[Start menu]\n");

        OUTER:
        while (true) {
            System.out.print("[1 = Buy | 2 = Ingredients | 3 = Fill | 0 = Exit]\n> ");

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
        System.out.println("[Buy menu]\n");

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
                    buyBlackCoffee();
                    break;
                }
                case 2: {
                    buyEspresso();
                    break;
                }
                case 3: {
                    buyLatte();
                    break;
                }
                default: {
                    System.out.println("$> No such choice!");
                }
            }
        }


    }

    private void buyBlackCoffee() {
        if (blackCoffeeRecipe[0] > coffeeMachine.getWater()) {
            System.out.println("$> Not enough water in the machine. Please fill it up!");
        } else if (blackCoffeeRecipe[2] > coffeeMachine.getBeans()) {
            System.out.println("$> Not enough beans in the machine. Please fill it up!");
        } else {
            System.out.println("$> One Black coffee made.\nYou're welcome!");

            coffeeMachine.setWater(-blackCoffeeRecipe[0]);
            coffeeMachine.setBeans(-blackCoffeeRecipe[2]);

        }
    }

    private void buyEspresso() {

    }

    private void buyLatte() {

    }


    private void fillMenu() {
        System.out.println("[Fill menu]\n");

        System.out.print("How much water (ml):\n> ");
        coffeeMachine.setWater(in.nextInt());

        System.out.print("How much milk (ml):\n> ");
        coffeeMachine.setMilk(in.nextInt());

        System.out.print("How much grams (g):\n> ");
        coffeeMachine.setBeans(in.nextInt());
    }

}
