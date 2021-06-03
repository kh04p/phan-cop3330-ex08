package org.cop3330;

public class pizzaCalc {
    public static int output(int people, int pizza, int slices) {
        return (slices * pizza) / people;
    }

    public static int leftovers(int output, int people, int pizza, int slices) {
        return (pizza * slices) - (output * people);
    }
}
