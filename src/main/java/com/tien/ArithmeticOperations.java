package com.tien;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int b = scanner.nextInt();

        System.out.println("Tổng: " + (a + b));
        System.out.println("Hiệu: " + (a - b));
        System.out.println("Tích: " + (a * b));
        if (b != 0) {
            System.out.println("Thương: " + ((double) a / b));
        } else {
            System.out.println("Không thể chia cho 0.");
        }
        scanner.close();
    }
}
