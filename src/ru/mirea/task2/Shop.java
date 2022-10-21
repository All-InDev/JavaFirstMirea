package ru.mirea.task2;

import java.util.Arrays;

public class Shop {
    private String[] computers;

    public Shop(int n) {
        this.computers = new String[n];
    }

    public void fillTable(int i, String comp) {
        computers[i] = comp;
    }

    public void addComp(String comp) {
        String newcomps[] = new String[computers.length + 1];

        for (int i = 0; i < computers.length; i++)
            newcomps[i] = computers[i];

        newcomps[computers.length] = comp;
        this.computers = newcomps;
    }

    public void removeComp() {
        String newcomps[] = new String[computers.length - 1];

        for (int i = 0; i < computers.length - 1; i++)
            newcomps[i] = computers[i];

        this.computers = newcomps;
    }

    public int findComp(String comp) {
        int found = -1;
        for (int i = 0; i < computers.length; i++)
            if (comp.equals(computers[i]))
                found = i;
        return found;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "computers=" + Arrays.toString(computers) +
                '}';
    }
}
