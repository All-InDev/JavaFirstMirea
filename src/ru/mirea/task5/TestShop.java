package ru.mirea.task5;

public class TestShop {
    public static void main(String[] args) {
        Chair c = new Chair();
        c.setPrice(50);
        c.setMaterial("plastic");
        System.out.println(c.getMaterial());

        FurnitureShop shop = new FurnitureShop();
        shop.add(c);
        Bed b = new Bed();
        b.setPrice(100);
        shop.add(b);

        shop.sell(0);
        shop.sell(1);

        System.out.println(shop.getMoney());
    }
}
