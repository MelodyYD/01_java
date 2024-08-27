package com.ohgiraffers.section04.comparison;

public class pr1 {

    public static void main(String[] args) {

        /* 연습 문제 2
        급식에서 비엔나 소세지를 한 명 당 6개씩 나눠주고 있다.
        현재 67번째 학생이 받아갔다면 현재까지 소세지 소비량과, 다음 학생을 호출해보자.
        */
        System.out.println("========== 연습 문제 2 ==========");
        int sg = 6;
        int std = 67;
        System.out.println("소세지 소비량 : " + (std++ * sg));
        System.out.println("다음 학생은 " + std + "번째 학생입니다.");

        // =========================================================================

        /* 연습 문제 3
        정현님의 체중은 55.5kg 이고 키는 160cm입니다. BMI를 계산하는 코드를 작성하세요.
        BMI(체질량지수) = 체중(kg) / (키(m)의 제곱)  ※ 키의 단위 확인
        출력은 정현님의 BMI는 ? 입니다. 로 출력해주세요.
        */
        System.out.println("========== 연습 문제 3 ==========");
        double jhWeight = 55.5; //kg
           int jhHeight = 160; //cm

        double jhHe2 = (double) jhHeight / 100;
        double BMI = jhWeight / (jhHe2 * jhHe2);

        System.out.println("정현님의 BMI는 " + BMI + " 입니다.");



    }

}
