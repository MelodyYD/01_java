package com.ohgiraffers.section02.looping.practice;

import java.util.Scanner;

public class Prct1 {
    /* 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서
     * 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
     *
     * A를 3만큼 밀면 D가 되고, z를 1만큼 밀면 a가 됩니다.
     * 또한 공백문자는 변경되지 않습니다.
     *
     * 문자열 1개를 입력 받고,
     * 얼만큼 문자를 밀지 알려주는 0보다 큰 정수를 1개 입력 받아
     * 암호문을 작성하는 프로그램을 만들어 보세요.
     * 단, 숫자가 27인 경우는 1칸을 밀게 됩니다. (알파벳은 26글자이기 때문입니다.)
     *
     * -- 입력 예시 --
     * 문자열을 입력하세요 : a B z
     * 숫자를 입력하세요 : 4
     *
     * -- 출력 예시 --
     * e F d
     */

    public void pr10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요 : ");
        String real = sc.nextLine();
        System.out.println("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        //문자열 받은 걸 문자로 치환 (char)
        //치환한 알파벳의 끝으로 가면 처음으로 가도록 예외 설정
        //아스키코드
        for (int change = num; change > 0; change--) {
            char ch = real.charAt(change);
            if(ch>='a'||ch<='z' && ch>='A'||ch<='Z') {
                System.out.println(ch);
            }
        }


    }
}
