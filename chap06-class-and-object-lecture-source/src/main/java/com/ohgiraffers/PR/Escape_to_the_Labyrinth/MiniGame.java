package com.ohgiraffers.PR.Escape_to_the_Labyrinth;

import java.util.Random;
import java.util.Scanner;

Gold g = new Gold();

public class MiniGame {

    public void miniGameRPSStart() {
        line();
        System.out.println("=============  · · · Now Loading · · · ============");
        line();
        System.out.println("                    가위바위보 게임!");
        System.out.println("        가위바위보 대결을 통하여 골드를 획득해 보세요!");
        System.out.println();
        miniGameRPS();
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
            userRPS(userRps);
        }
    }

    public void userRPS(int userRps) {
        switch (userRps) {
            case 1:
                test(userRps,rockPaperScissors());
                if (rockPaperScissors() == 1) {
                    System.out.println("비겼습니다! 아쉽네요! 다시 도전해 보세요!");
                    break;
                } else if (rockPaperScissors() == 2) {
                    System.out.println("아아...!! 졌습니다!");
                    System.out.println("아쉽지만 다음에는 꼭 이길 수 있기를.");
                    int loseGold = loseGold();
                    System.out.println("당신에게 " + loseGold + "G가 주어집니다.");
                    g.setGold(loseGold);
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

    public void test(int userRps, int ranNum) {
//        String name = Application.name;
        line();
        System.out.println("님이 낸 패 : " + changeRPS(userRps));
        System.out.println("미궁이 낸 패 : " + changeRPS(ranNum));
        System.out.println();
    }

    public int winGold() {
        Random winRand = new Random();
        int winGold = winRand.nextInt(21) + 29;
        return winGold;
    }

    public int loseGold() {
        Random loseRand = new Random();
        int loseGold = loseRand.nextInt(21) + 9;
        return loseGold;
    }

    public static void line () {
        System.out.println();
        System.out.println("===================================================");
        System.out.println();
    }

}
