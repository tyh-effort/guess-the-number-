package com.guesss;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        guess();
    }

    public static void guess() {
        Random r = new Random();
        int number = r.nextInt(100);

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入你猜到的数字：");
            int guessnumber = sc.nextInt();
            if (guessnumber > number) {
                System.out.println("您猜大了！");
            } else if (guessnumber < number) {
                System.out.println("您猜小了！");
            } else {
                System.out.println("您猜对了！");
                break;
            }
        }
    }
}
