package com.ohgiraffers.section02.userexception;

public class Application1 {

    public static void main(String[] args) {
        // 24.09.20 12:50

        // 사용자 정의의 예외클래스 정의 후 발생한 예외를 처리할 수 있다.

        ExceptionTest2 et = new ExceptionTest2();

        et.checkEnoughMoney(3000, 5000);

    }

}
