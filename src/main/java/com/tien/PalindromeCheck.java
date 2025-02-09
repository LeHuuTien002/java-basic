package com.tien;

import java.util.Scanner;

public class PalindromeCheck {
    public static boolean isPalindrome(int num){
        int original = num, reversed = 0;
        while (num > 0){
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập một số nguyên: ");
        int num = scanner.nextInt();
        
        if (isPalindrome(num)){
            System.out.println(num + " là số Palindrome.");
        }else {
            System.out.println(num + " không là số Palindrome.");
        }
        
        scanner.close();
    }
}
