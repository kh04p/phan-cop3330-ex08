/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

public class pizzaCalc {
    public static int output(int people, int pizza, int slices) {
        return (slices * pizza) / people;
    }

    public static int leftovers(int output, int people, int pizza, int slices) {
        return (pizza * slices) - (output * people);
    }
}
