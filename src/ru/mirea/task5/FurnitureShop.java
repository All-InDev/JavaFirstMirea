package ru.mirea.task5;

public class FurnitureShop {
    private Furniture[] furniture = new Furniture[50];
    private int size = 0;
    private int money = 0;

    void add(Furniture f) {
        furniture[size] = f;
        size++;
    }

    void sell(int index) {
        Furniture f = furniture[index];
        for (int i = index + 1; i + 1 < size; i++) {
            furniture[i] = furniture[i + 1];
        }

        money += f.getPrice();
    }

    public int getMoney() {
        return money;
    }
}
