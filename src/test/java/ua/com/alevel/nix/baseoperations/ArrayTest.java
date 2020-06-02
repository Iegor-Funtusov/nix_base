package ua.com.alevel.nix.baseoperations;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest
public class ArrayTest {

    Integer integer;
    int i;

    @Test
    void arrayTest() {

//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        System.out.println("cars = " + cars[0]);
//
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);
//        }
//
//        for (String car : cars) {
//            System.out.println("car = " + car);
//        }

//        int[] ints = new int[100];
//        for (int i = 0; i < ints.length; i++) {
//            ints[i] = i;
//        }
//        for (int i = 0; i < ints.length; i++) {
//            if (ints[i] % 5 == 0) {
//                System.out.println("ints = " + ints[i]);
//            }
//        }
//        int sum = 0;
//        for (int i = 0; i < ints.length; i++) {
//            BigInteger bigInteger = BigInteger.valueOf(ints[i]);
//            if (bigInteger.isProbablePrime((int) Math.log(ints[i]))) {
//                System.out.println("ints = " + ints[i]);
//                sum += ints[i];
//            }
//        }
//        System.out.println("sum = " + sum);




        System.out.println("integer = " + integer);
        System.out.println("i = " + i);

//        int[][] doubleInts = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {56} };
//        System.out.print("   |");
//        for (int i = 0; i < doubleInts.length; ++i) {
//            if (i == 0) {
//                for (int j = 0; j < doubleInts[i].length; ++j) {
//                    System.out.printf("%5d", j);
//                }
//                System.out.println();
//                System.out.println("____________________________");
//            }
//            System.out.printf("%2d |    ", i);
//            for (int j = 0; j < doubleInts[i].length; ++j) {
//                System.out.printf("%-5d", doubleInts[i][j]);
//            }
//            System.out.println();
//        }

//        int[][][] tripleInts = {
//                {
//                        {1, -2, 3},
//                        {2, 3, 4}
//                },
//                {
//                        {-4, -5, 6, 9},
//                        {1},
//                        {2, 3}
//                }};
//        for (int[][] array2D : tripleInts) {
//            for (int[] array1D : array2D) {
//                for (int item : array1D) {
//                    System.out.println(item);
//                }
//            }
//        }

        System.out.println("s = " + s());
    }

    private String s() {
        try {
            return "try";
        } catch (Exception e) {

        } finally {
            return "finally";
        }
    }
}
