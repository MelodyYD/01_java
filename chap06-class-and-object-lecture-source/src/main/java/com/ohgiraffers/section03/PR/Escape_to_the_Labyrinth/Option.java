package com.ohgiraffers.section03.PR.Escape_to_the_Labyrinth;

public class Option {

    public void defaultOption() {
        System.out.println(" 무엇을 하시겠습니까?");
        System.out.println("   1. 길 찾기");
        System.out.println("   2. 골드 확인");
        System.out.println("   3. 처음으로(10G)");
        System.out.println();
        System.out.print("메뉴를 선택해주세요 : ");
    }

    private Gold g = new Gold();
    private Labyrinth laby = new Labyrinth();
    private MiniGame mGame = new MiniGame();

    public void labyrinthOption() {
        // 1. 길 찾기
    }

    public void goldChack() {
        // 2. 골드 확인
        System.out.println(" 무엇을 하시겠습니까?");
        System.out.println("   1. 내 잔여 골드 확인");
        System.out.println("   2. 뒤로 가기");
        if (g.goldState() >= 150) {
            System.out.println("   3. 탈출하기! (150G)");
        }
        System.out.println();
        System.out.print("메뉴를 선택해주세요 : ");
    }

    public void startBack() {
        // 3. 처음으로(10G)
    }

}
