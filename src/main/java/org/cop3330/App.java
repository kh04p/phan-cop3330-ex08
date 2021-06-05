/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

import java.util.Scanner;

//program to take in number of people, number of pizzas and pizza slices to divide them evenly.
public class App {
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("How many people? ");
        int people = (int) input.nextInt();
        System.out.print("How many pizzas? ");
        int pizza = (int) input.nextInt();
        System.out.print("How many slices per pizza? ");
        int slices = (int) input.nextInt();

        if (slices * pizza > 1) {
            System.out.printf("%d people with %d pizzas (%d slices).%n", people, pizza, slices * pizza);
        } else {
            System.out.printf("%d people with 1 pizza.%n", people);
        }

        int output = pizzaCalc.output(people, pizza, slices); //calculate number of pieces each person gets
        if (output >= 1) { //decides if pizza can be divided evenly
            if (output > 1) {
                System.out.printf("Each person will have %d slices.%n", output);
            } else {
                System.out.println("Each person will have 1 slice");
            }
            System.out.printf("There are %d leftover pieces.", pizzaCalc.leftovers(output, people, pizza, slices));
        } else {
            System.out.println("Unable to divide pizza evenly.");
        }
    }
}
