package com.ohgiraffers.section03.constant;

public class Application1 {

    public static void main(String[] args) {
        // 24.08.26 14:30
        // 수업 목표. 상수에 대해 이해하고 사용할 수 있다.

        /* 필기.
        *  상수란?
        *   : 변수가 메모리에 변경될 수 있는 값을 저장하기 위한 공간이라고 한다면, 상수는 반대되는 개념이다.
        *   : 변하지 않는 값(고정값)을 저장하기 위한 메모리 상의 공간을 상수라고 한다.
        *     ex) 수학 공식에 사용되는 수치(파이 등)
        *
        *  사용 방법
        *   1. 상수를 선언한다. (변수 선언과 유사하지만, final 키워드가 붙는다.)
        *   2. 값을 초기화(대입)한다.
        *   3. 변수와 마찬가지로 필요한 곳에서 호출한다.
        * */

        // 1. 상수 선언
        final int AGE; // 상수는 변수와의 차별성을 위하여 대문자로 명명한다.

        // 2. 값 초기화(대입)
        AGE = 20;
//        AGE = 30; // 한 번 초기화 한 이후 값을 재대입하는 것은 불가하다.
        
        // 3. 필요한 위치에서 호출해서 사용
        System.out.println("AGE = " + AGE);

    }

}
