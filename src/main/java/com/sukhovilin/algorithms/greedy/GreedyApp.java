package com.sukhovilin.algorithms.greedy;

import java.util.*;

/**
 * Жадный алгоритм — это подход, при котором на каждом этапе принимаются локально оптимальные решения и допускается,
 * что конечное решение также окажется оптимальным.
 * “Оптимальное” решение — то, которое предлагает наиболее очевидную и немедленную выгоду на определенном шаге/этапе.
 */
public class GreedyApp {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new Item("гитара", 7, 800));
        items.add(new Item("утюг", 6, 500));
        items.add(new Item("чайник", 3, 300));
        items.add(new Item("лампа", 4, 500));
        items.add(new Item("телевизор", 15, 2000));
        items.add(new Item("ваза", 2, 450));
        items.add(new Item("миксер", 1, 400));
        items.add(new Item("блендер", 3, 200));

        Collections.sort(items);

        Bag firstBag = new Bag(30);

        //fillBackpack(firstBag, items);
        effectiveFillBackpack(firstBag, items);

        System.out.println("Вес рюкзака составляет - " + firstBag.getCurrentWeight() + ", общая стоимость вещей в рюкзаке - " + firstBag.getCurrentCost());
    }

    public static void fillBackpack(Bag bag, List<Item> items) {
        for (Item item : items) {
            if (bag.getMaxWeight() > bag.getCurrentWeight() + item.weight()) {
                bag.addItem(item);
            }
        }
    }

    public static void effectiveFillBackpack(Bag bag, List<Item> items) {
        Map<Double, Item> sortByRatio = new TreeMap<>(Collections.reverseOrder());
        for (Item item : items) {
            sortByRatio.put((double) item.cost() / item.weight(), item);
        }
        for (Map.Entry<Double, Item> entry : sortByRatio.entrySet()) {
            if (bag.getMaxWeight() > bag.getCurrentWeight() + entry.getValue().weight()) {
                bag.addItem(entry.getValue());
            }
        }
    }

    static class Bag {

        private final int maxWeight;
        private final List<Item> items = new ArrayList<>();
        private int currentWeight;
        private int currentCost;

        public Bag(int maxWeight) {
            this.maxWeight = maxWeight;
            currentCost = 0;
        }

        public int getMaxWeight() {
            return maxWeight;
        }

        public int getCurrentCost() {
            return currentCost;
        }

        public int getCurrentWeight() {
            return currentWeight;
        }

        public void addItem(Item item) {
            items.add(item);
            currentWeight += item.weight();
            currentCost += item.cost();
        }


    }

    record Item(String name, int weight, int cost) implements Comparable<Item> {
        @Override
        public int compareTo(Item o) {
            return this.cost > o.cost ? -1 : 1;
        }
    }

}