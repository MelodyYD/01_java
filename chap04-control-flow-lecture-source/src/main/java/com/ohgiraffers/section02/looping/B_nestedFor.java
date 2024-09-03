package com.ohgiraffers.section02.looping;

import java.sql.SQLOutput;
import java.util.Scanner;

public class B_nestedFor {

    public void printGugudanTwoToNine() {
        //2단부터 9단까지 출력하는 중첩 반복문

        System.out.println("구구단을 외자~ 구구단을 외자~");
        System.out.println("");
        for (int i = 2; i<=9; i++) {
            System.out.println(i + "단~");
            for (int j = 1; j<=9; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println("");
            System.out.println("========================");
            System.out.println("");
        }

    }

    public void upgradeGugudanTwoToNine() {
        for (int dan = 2; dan <= 9; dan++) {
            printGugudanOf(dan);
            System.out.println();
        }
    }

    private void printGugudanOf(int dan) {
        //어떤 것을 전달 받는지 확인하는 출력문
        System.out.println("dan = " + dan);

        for(int su = 1; su <= 9; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }

    public void printStarInputRowTimes() {
        //키보드로 정수를 입력 받아 해당 정수만큼 한 행에 *을 5개씩 출력하는 구문
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 줄을 출력할까요? : ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.print("*");
//            }
            printStar(5);

            System.out.println();
        }

    }

    private void printStar(int times) {
        for (int i = 1; i <= times; i++) {
            System.out.print("*");
        }
    }


}
