package com.seedling.main;

public class CoffeeMachine {

    int water = 0;
    int milk = 0;
    int beans = 0;

    public CoffeeMachine() {
    }

    public CoffeeMachine(int water, int milk, int beans) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        if (water < 0) {
            water = 0;
        }

        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        if (milk < 0) {
            milk = 0;
        }

        this.milk = milk;
    }

    public int getBeans() {
        return beans;
    }

    public void setBeans(int beans) {
        if (beans < 0) {
            beans = 0;
        }

        this.beans = beans;
    }

}
