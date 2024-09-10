package com.ohgiraffers.PR.Escape_to_the_Labyrinth;

import java.util.Random;
import java.util.Scanner;

public class MiniGame {

    public void miniGameRPSStart() {
        line();
        System.out.println("=============  · · · Now Loading · · · ============");
        line();
        System.out.println("                    가위바위보 게임!");
        System.out.println("        가위바위보 대결을 통하여 골드를 획득해 보세요!");
        System.out.println();
    }

    public void miniGameRPS() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("  1.가위   2.바위   3.보");
            System.out.print("안내면 진다~ 가위 바위 보! : ");
            int userRps = sc.nextInt();

            //아니면  빠꾸
            if (userRps != 1 && userRps != 2 && userRps != 3) {
                System.out.println();
                System.out.println("잘못 입력하였습니다.");
                System.out.println("다시 입력해주세요.");
            }
            switch (userRps) {
                case 1:
//                    if ()
            }
        }
    }


    //미니게임(가위바위보) 만들기
    public static int rockPaperScissors() {
        Random rpsRand = new Random();
        int ranNum = rpsRand.nextInt(3);
        return ranNum;
    }

    public static String changeRPS(int rpsNo) {
        String ranRps = (rpsNo == 0) ? "가위" : (rpsNo == 1) ? "바위" : "보";
        return ranRps;
    }

    public static void line () {
        System.out.println();
        System.out.println("===================================================");
        System.out.println();
    }

}
