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
                    System.out.printf("%nCurrent ingredients in the machine:%nWater: %d ml%nMilk: %d ml%nBeans: %d g%n%n",
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
                    break OUTER;
                }
                case 2: {
                    buyEspresso();
                    break OUTER;
                }
                case 3: {
                    buyLatte();
                    break OUTER;
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
            System.out.println("$> One Black coffee made. You're welcome!\n");

            coffeeMachine.setWater(coffeeMachine.getWater()-blackCoffeeRecipe[0]);
            coffeeMachine.setBeans(coffeeMachine.getBeans()-blackCoffeeRecipe[2]);

        }
    }

    private void buyEspresso() {
        if (espressoRecipe[0] > coffeeMachine.getWater()) {
            System.out.println("$> Not enough water in the machine. Please fill it up!");
        } else if (espressoRecipe[2] > coffeeMachine.getBeans()) {
            System.out.println("$> Not enough beans in the machine. Please fill it up!");
        } else {
            System.out.println("$> One Espresso made. You're welcome!\n");

            coffeeMachine.setWater(coffeeMachine.getWater()-espressoRecipe[0]);
            coffeeMachine.setBeans(coffeeMachine.getBeans()-espressoRecipe[2]);

        }
    }

    private void buyLatte() {
        if (latteRecipe[0] > coffeeMachine.getWater()) {
            System.out.println("$> Not enough water in the machine. Please fill it up!");
        } else if (latteRecipe[1] > coffeeMachine.getMilk()) {
            System.out.println("$> Not enough milk in the machine. Please fill it up!");
        } else if (latteRecipe[2] > coffeeMachine.getBeans()) {
            System.out.println("$> Not enough beans in the machine. Please fill it up!");
        } else {
            System.out.println("$> One Latte made. You're welcome!\n");

            coffeeMachine.setWater(coffeeMachine.getWater()-latteRecipe[0]);
            coffeeMachine.setWater(coffeeMachine.getWater()-latteRecipe[0]);
            coffeeMachine.setBeans(coffeeMachine.getBeans()-latteRecipe[2]);

        }
    }


    private void fillMenu() {
        System.out.println("\n[Fill menu]");

        System.out.print("How much water (ml):\n> ");
        coffeeMachine.setWater(in.nextInt());

        System.out.print("How much milk (ml):\n> ");
        coffeeMachine.setMilk(in.nextInt());

        System.out.print("How much grams (g):\n> ");
        coffeeMachine.setBeans(in.nextInt());
    }

}
