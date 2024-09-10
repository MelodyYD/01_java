package com.ohgiraffers.PR.Escape_to_the_Labyrinth;

public class Option {

    public void defaultOption() {
        line();
        System.out.println(" 무엇을 하시겠습니까?");
        System.out.println("   1. 길 찾기");
        System.out.println("   2. 골드 확인");
        System.out.println("   3. 처음으로(10G)");
        System.out.println("   9. 게임 종료");
        System.out.println();
        System.out.print("메뉴를 선택해주세요 : ");
    }

    public void endGame(String name) {
        line();
        System.out.println("                      아쉽네요.");
        System.out.println("                  게임이 종료됩니다.");
        System.out.println("                   또 봐요, " + name + "님.");
        line();
    }

    public void finishGame () {
        line();
        System.out.println("                     탈출 성공!");
        line();
    }

    private Gold g = new Gold();
    private Labyrinth laby = new Labyrinth();
    private MiniGame mGame = new MiniGame();

    public void labyrinthOption() {
        // 1. 길 찾기
    }

    public void goldChack() {
        // 2. 골드 확인
        line();
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
        g.goldDownStart(10);
        line();
        //처음 장소로 이동하는 거 선언하기
    }

//    public void escapeLabirinth() {
//        System.out.println();
//    }

    public static void line () {
        System.out.println();
        System.out.println("===================================================");
        System.out.println();
    }

}
