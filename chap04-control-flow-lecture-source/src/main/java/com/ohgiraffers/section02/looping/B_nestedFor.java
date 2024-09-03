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

    // 문제 1. 키보드로 정수를 하나 입력 받아 해당 정수 만큼 한 행에 *을 행의 번호개씩 출력
    // 문제 2. 반대로

    public void printTriangleStars() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력해주세요. : ");
        // 몇 개까지 뽑을지 num에 저장
        int num = sc.nextInt();

        for (int row=1; row<=num; row++ ) {
            // 몇 줄을 뽑을 건지 설정. num만큼의 줄을 뽑을 것이므로, 1부터 줄단위로 증가
            for (int star = 1; star<=row; star++) {
                // 별의 갯수를 지정. 몇 번째 줄인지에 따라 별의 갯수가 증가
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printReverseTriangleStars() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력해주세요. : ");
        // 몇 개까지 뽑을지 num에 저장
        int num = sc.nextInt();

        for (int row=num; row>=1; row--) {
            // 별의 갯수만큼 처음에 뽑아야 하므로 줄 갯수인 row에 num 값 삽입
            // 1까지 내보내야 하니 조건식 설정
            // row는 하나씩 줄어들도록.
            for (int star = row; star>=1; star--) {
                //row가 줄어들 때마다 같이 맞춰주기 위해 star = row
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // 1부터 10까지 1씩 증가시키면서 i값 출력하는 반복문
    public void testWhileStatement() {
        /* 초기식
        *   while(조건식) {
        *       조건을 만족하는 경우 반복할 구문;
        *       증감식;
        *   }
        * */

        int i=1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public void whileExample1() {
        //스캐너를 이용해서 문자열을 입력받아 인덱스를 이용해 한글자씩 출력해보기
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요. : ");
        String str = sc.nextLine();

        /* 필기.
        *   charAt() : 문자열에서 인덱스에 해당하는 문자를 char형으로 변환해주는 메소드
        *   length() : String 클래스에서 제공하는 메소드로, 문자열의 길이를 int형으로 반환해준다.
        * */

        //for문
        System.out.println("for문 ================================");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(i +"번째 : " + ch);
        }
    }

    public void whileExample2() {
        // 중첩 while 문을 이용해서 구구단 출력 연습
        // dan : 2~9
        // su : 1~9

        int dan = 2;
        while (dan < 10) {
            int su = 1;
            while (su < 10) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
                su++;
            }
            System.out.println();
            dan++;
        }
    }


}
