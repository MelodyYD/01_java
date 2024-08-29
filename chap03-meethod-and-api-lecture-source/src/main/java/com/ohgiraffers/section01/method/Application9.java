package com.ohgiraffers.section01.method;

import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;

public class Application9 {

    public static void main(String[] args) {

        //24.08.29 14:50
        //다른 클래스에 작성한 메소드를 호출할 수 있다.

        /* 필기.
        *  우리는 Application에서 2개의 정수를 전달할 것이고,
        *  Calculator 클래스에는 2개의 정수를 전달 받아
        *  최솟값을 구하는 메소드(기능)
        *  최댓값을 구하는 메소드(기능)
        *  실행 후 Application에게 2개의 정수 중 큰 값과 작은 값이 무엇인지 알려줄 것이다.
        * */

        int first = 10;
        int second = 18;

        //non-static method 호출 방식
        Calculator cal = new Calculator();
        int min = cal.minNumberOf(first, second);

        //static method 호출 방식
        int max = maxNumberOf(first, second);

        /* 필기.
        *  static 메소드도 non-static 메소드처럼 호출은 가능하다.
        *  하지만 권장하지 않는다.
        *  원래 방식이 있는데 굳이 그럴 필요가 없기 때문.
        * */
        System.out.println("min = " + min);
        System.out.println("max = " + max);


    }

}
