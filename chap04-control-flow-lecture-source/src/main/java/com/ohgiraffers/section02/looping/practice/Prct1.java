package com.ohgiraffers.section02.looping.practice;

import java.util.Scanner;

public class Prct1 {

    public void q1() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i; 
        }
        System.out.println("sum = " + sum);
    }

    public void q2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요. : ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = num; i > 0; i--) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    public void q3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요. : ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = num; i > 0; i--) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }




}
