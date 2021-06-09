// Copyright© by Fin

package Main;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many Fibonacci numbers should be output?: ");
        int fibo = sc.nextInt();

        int n1 = 0, n2 = 1, n3;
        for (int i = 0; i < fibo; i++) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}