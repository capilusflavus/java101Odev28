package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n=scanner.nextInt();
        int toplam=0;
        if (n % 2 == 0) {
        for (int i=1; i<n; i++) {

                if (n % i == 0) {
                    toplam += i;

                }
            }
            System.out.println(toplam + " Mükemmel sayıdır.");
        }
        else {
            toplam=n;
            System.out.println(toplam+" Mükemmel sayı geğildir.");
        }

    }
}
