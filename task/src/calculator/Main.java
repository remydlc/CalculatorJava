package calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        printHashMap();

    }

    // Here I defined a hash map to keep all the values in an object.
    public static Map<String, Double> productValue() {
        //declare hashmap to be used for products
        Map<String, Double> productsDetails = new HashMap<>();
        Product bubbleGum = new Product("BubbleGum", 202);
        Product toffee = new Product("Toffee", 118);
        Product iceCream = new Product("Ice cream", 2250);
        Product milkChocolate = new Product("Milk chocolate", 1680);
        Product doughnut = new Product("Doughnut", 1075);
        Product pancake = new Product("Pancake", 80);
        // Saving the products and their prices in the hashmap
        productsDetails.put(bubbleGum.getName(), bubbleGum.getPrice());
        productsDetails.put(toffee.getName(), toffee.getPrice());
        productsDetails.put(iceCream.getName(), iceCream.getPrice());
        productsDetails.put(milkChocolate.getName(), milkChocolate.getPrice());
        productsDetails.put(doughnut.getName(), doughnut.getPrice());
        productsDetails.put(pancake.getName(), pancake.getPrice());
        return productsDetails;
    }

    static void printHashMap() {
        Map<String, Double> temp = productValue();
        System.out.println("Earned amount:");
        double sum = 0;
        for (Map.Entry<String, Double> entry : temp.entrySet() ) {
            String key = entry.getKey();
            double value = entry.getValue();
            sum += value;
            System.out.println(key + ": " + "$" + value);
        }
        System.out.println();
        System.out.println("Income: " + "$" + sum);
        double expense = calcExpenses();
        System.out.println("Net income: $" + (sum - expense));

    }

    static double calcExpenses() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Staff expenses: ");
        Double staffExpense = scanner.nextDouble();
        System.out.println("Other expenses: ");
        Double otherExpense = scanner.nextDouble();
        return otherExpense + staffExpense;
    }


}


