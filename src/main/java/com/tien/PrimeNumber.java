package com.tien;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập một số nguyên: ");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " là số nguyên tố.");
        } else {
            System.out.println(num + " không là số nguyên tố.");
        }
        scanner.close();
    }
}
