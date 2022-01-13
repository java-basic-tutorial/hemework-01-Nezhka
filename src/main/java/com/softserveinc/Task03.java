package com.softserveinc;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write how many ml of water the coffee machine has: \n" +
                ">>> ");
        int water = scanner.nextInt();
        System.out.print("Write how many ml of milk the coffee machine has: \n" +
                ">>> ");
        int milk = scanner.nextInt();
        System.out.print("Write how many grams of coffee beans the coffee machine has: \n" +
                ">>> ");
        int coffee = scanner.nextInt();
        System.out.print("Write how many cups of coffee you will need: \n" +
                ">>> ");
        int cups = scanner.nextInt();
        int coffeeCups = Math.min(coffee/15, Math.min(water/200, milk/50));
        if(cups == coffeeCups){
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cups < coffeeCups){
            System.out.println("Yes, I can make that amount of coffee (and even "+ (coffeeCups-cups) + " more than that)");
        }else{
            System.out.println("No, I can make only " + coffeeCups + " cup(s) of coffee");
        }

    }
}
