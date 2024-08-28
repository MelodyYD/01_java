package com.ohgiraffers.section06.ternary;

public class pr1 {

    public static void main(String[] args) {

        /* 문제1
        *  A 여행사의 패키지는 8인 이상이 모여야 출발 확정 상태가 되고, 모이지 않으면 출발 보류 상태를 보여줍니다.
        *  B 여행사의 패키지는 4인 이상이 모여야 출발 확정 상태가 되고, 모이지 않으면 출발 보류 상태를 보여줍니다.
        *  하지만 두 여행사 패키지가 같은 날짜, 같은 장소로 가는 패키지라면 여행사끼리 협의하여 두 패키지를 합쳐서 가기도 합니다.
        *
        *  8월 10일 기준으로 A 패키지에 4인이 지원을 하였고, 5일 뒤에 B 패키지로 1인이 추가 지원을 하였습니다.
        *  그리고 8월 20일에 B 패키지에 3인이 추가 지원을 할 예정입니다.
        *
        *  8월 18일과 8월 20일 각각, A 패키지와 B 패키지에서의 '지원 인원 / 최소 출발 인원'과 함께 '일정 확정 여부'를 출력해 주세요.
        *  그리고 만일 두 패키지가 합쳐서 갈 수 있다면 한쪽이 미달이더라도 양쪽 모두 확정 상태로 나오도록 만들어 주세요.
        * */

        //패키지별 최소 인원과 8월 10일 기준 사람 수 입력
        int pkgMinA = 8;
        int psnA = 4;
        int pkgMinB = 4;
        int psnB = 1;

        //사람 수와 패키지 최소 인원을 비교하여 일정 확정 여부를 확인하기
        String planA = ( psnA >= pkgMinA ) ? "출발 확정" : "출발 보류";
        String planB = ( psnB >= pkgMinB ) ? "출발 확정" : "출발 보류";
        int psnTotal = 

        System.out.println("A 패키지 8월 18일 : " + psnA + " / " + pkgMinA + " " + (psnTotal>=8 &&));
        psn = psn + 3;
        System.out.println("8월 20일 : " + psn + " / " + pkgMin + " " + plan);



    }

}
