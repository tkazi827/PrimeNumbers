package com.perscholas.hw;

public class primenumbers {


    public static void main(String[] args) {

        int primenumbers;
        int n = 1;
        int divisibleCount;

        while (n <= 20) {
            divisibleCount = 0;
            primenumbers = 2;
            while (primenumbers <= n / 2) {
                if (primenumbers == 0) {
                    divisibleCount++;
                    break;
                }
                primenumbers++;
            }
            if (divisibleCount == 0 && n != 1) {
                System.out.print(n + " ");
            }
            n++;
        }

    }
}

