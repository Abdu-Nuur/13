package com.company;

public class Main {

    public static void main(String[] args) {

        Class class1 = new Class(5, "Alma", new int[]{0, 1, 2, 3, 4, 5,});

        System.out.println("Nomer: " + class1.getNomer() + "\nSoz: " + class1.getSoz());

        System.out.print("MAsiv: ");

        for (int i = 0; i < class1.masiv.length; i++) {
            System.out.print(class1.masiv[i] + ", ");
        }
    }
}
