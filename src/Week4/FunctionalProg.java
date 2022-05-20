package Week4;

import java.util.function.Function;

public class FunctionalProg {
    // Volume of cone -> f(x) = (x+2x)^2
    public static void main(String[] args) {
        Function<Double, Function<Double, Double>> volumeOfCone = h -> r -> ((1/3) * 3.14 * r * r) * h;
        Function<Integer, Function<Integer, Integer>> square = x -> y -> y * y;
        System.out.println(square.apply(5).apply(5));
    }
}
