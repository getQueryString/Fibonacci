// Copyright© by Fin

package Main;

import java.util.concurrent.TimeUnit;

public class FibonacciAndGoldenSection {

    public static void main(String... args) throws InterruptedException {
        long fA = 0, fB = 1, fC = 0, count = 1;
        double goldenerSchnitt;

        for (int i = 0; i < 91; i++) {
            count++;
            if (fC >= Long.MAX_VALUE) break;
            fC = fA + fB;
            System.out.println(count + ". Fibonacci-Zahl: " + fC);
            if (fA > 0) {
                goldenerSchnitt = (double) fB / fA;
                System.out.println("Goldener Schnitt: " + goldenerSchnitt);
            }
            fA = fB;
            fB = fC;
            System.out.println();
            TimeUnit.MILLISECONDS.sleep(25);
        }
        System.out.println("Maximum erreicht.");
    }
}