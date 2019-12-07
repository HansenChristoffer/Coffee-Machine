package com.seedling.main;

public class CoffeeMachine {

    int water;
    int milk;
    int beans;

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
        if (getWater() - water < 0) {
            water = 0;
        }

        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        if (getMilk() - milk < 0) {
            milk = 0;
        }

        this.milk = milk;
    }

    public int getBeans() {
        return beans;
    }

    public void setBeans(int beans) {
        if (getBeans() - beans < 0) {
            beans = 0;
        }

        this.beans = beans;
    }

}
