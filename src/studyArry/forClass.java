import java.util.Scanner;

public class forClass {

    public static void main(String[] args) {
//         for (초기문; 조건식; 반복후작업(count) ) {
//                작업문 }
// 0~9까지 출력
        System.out.println("----------------for ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
//  선언과 동시에 초기화를 시키면서 카운트를 for문 내에 설정
//  for문의 설정 부분에 입력되면서 for문의 지역변수로 사용되어 같은 지역내에서는 같은 이름의 변수를 반복사용할 수 있음.
//  초기화 변수 카운트는 항상 마지막에 동작.

        for (int i = 0; i < 9; i++) {
            System.out.println(i);
        }


        System.out.println("--------while-");
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }
//        결과값은 같으나 조건식을 적는 위치가 다르다.
//        둘 다 선언과 동시에 초기화를 하는 작업은 같으나 for문은 조건식 위치가 변경되지 않기때문에 동일형태로 반복을
//        사용할 수 있다.
//        * while문은 동일한 이름의 변수는 사용할 수 없다 (전역변수를 사용하기 때문. 지역변수로 바꾸거나
//        기존 변수의 초기값을 다시 초기화시키거나 차라리 for문을 사용하는 것이 좋다. )


        System.out.println("=========아래 while문을 for문으로 변환해 출력하기 =====");


        for (int i = 0; i < 11; i++) {
            System.out.println("나무를 " + i + "번 찍었습니다.");
            if(i==10){
                System.out.println("나무가 넘어갔다. ");
            }
        }


        System.out.println("\n\n==============구구단==============");

        for (int i = 0; i < 5; i++) {
            System.out.println(5+"*"+i+"="+(i*5));

        }

        System.out.println("\n\n================중첩for\n\n");


        for (int i = 2; i < 10; i++) { // (i++ 대신 i+=1 도 가능하다.  i+=2를 하면 2씩 올릴 수 있다.
//            변수의 카운트 부분,++를 사용한 단항연산자가 아닌 산출대입연산자를 사용시 원하는
//            크기만큼 카운트 값을 변경할 수 있음.
            System.out.println("=========="+i+"단=============");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" +( i * j));

            }
            System.out.println();
        }

//        for 문 안에 for문 존재.
//        2차원 배열의 내용을 출력할 때 많이 사용


        System.out.println("문제3==========================");

        Scanner in = new Scanner(System.in);





        System.out.println("문제 4------------------------");
        String star="";
        for (int i = 0; i < 5; i++) {
            star += "*";
            System.out.println(star);

        }

        for (int i = 0; i < 6; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }






    }

}
