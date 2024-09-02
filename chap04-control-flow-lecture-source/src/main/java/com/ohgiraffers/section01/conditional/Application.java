package com.ohgiraffers.section01.conditional;

public class Application {

    public static void main(String[] args) {

        A_if aIf = new A_if();
//        aIf.testSimpleIfStatement();
//        aIf.testNestedIfStatement();

        B_ifElse bIf = new B_ifElse();
//        bIf.testIfElseStatement();
//        bIf.testNestedIfElseStatement();

        C_ifElseIf cIF = new C_ifElseIf();
//        cIF.testIfElseIfStatement();
//        cIF.testNestedIfElseIfStatement();
        cIF.improveNestedIfElseIfStatement();

    }

}
