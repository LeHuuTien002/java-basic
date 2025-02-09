package com.tien;

import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập một số nguyên: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " là số chẵn.");
        }else {
            System.out.println(num + " là số lẻ.");
        }
        
        scanner.close();
    }
}
