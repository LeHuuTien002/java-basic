package com.tien;

import java.util.Scanner;

public class SumOfDigits {
    public static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap mot so nguyen: ");
        int num = scanner.nextInt();

        System.out.println("Tong cac chu so cua " + num + " la " + sumDigits(num));

        scanner.close();
    }
}
