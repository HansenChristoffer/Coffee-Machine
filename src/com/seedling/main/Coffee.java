package com.seedling.main;

public abstract class Coffee {

    int requiredWater;
    int requiredMilk;
    int requiredBeans;

    public Coffee(int requiredWater, int requiredMilk, int requiredBeans) {
        this.requiredWater = requiredWater;
        this.requiredMilk = requiredMilk;
        this.requiredBeans = requiredBeans;
    }

    public int getRequiredWater() {
        return this.requiredWater;
    }

    public int getRequiredMilk() {
        return this.requiredMilk;
    }

    public int getRequiredBeans() {
        return this.requiredBeans;
    }

}
