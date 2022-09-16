import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// 반복문
// - for 문 / while문

//         for 문은 다음시간에

//        while(조건식) {출력 또는 작업문}
//        조건식의 결과가 true or false인지를 판별한 후 작업문을 시작한다.
//        while문이 오기 전 조건문 외부에서 초기화 변수가 필요, 이후 조건문 안에서 변수 카운트가 필요하다.

        System.out.println("while");

        int hit = 0; // while문 선언과 함께 초기화

        while (hit < 10) { // hit가 10 보다 작다 .
            hit++; //hit를 1씩 증가시켜라  * 이것의 위치에 따라 값이 다르게 나온다.
            System.out.println("나무를" + hit + " 번 찍었습니다."); // 출력문

            if (hit == 10) { // hit는 10과 같다.
                System.out.println("나무가 넘어간다."); // 출력문 실행. 10이 되면 위로 다시 while문으로 갔다 빠져나옴.

            }
        }
//        while 문 사용시 주의점
//        1. 초기화 변수의 카운트부분 따라 위치 결과가 달라진다.
        hit = 0; // while문 선언과 함께 초기화

        while (hit < 5) {
            hit++;
//          ** 프로그래밍이 익숙치 않을 경우 변수의 카운트 부분을 고정해서 사용
//          ** while문을 탈출할 수 있는 조건을 반드시 적어줘야한다. 그렇지 않으면 탈출하지 못하고 계속 루프한다.
//             -> if문을 잘 쓰거나 count를 잘 써야한다.
//            ** while문에서도 break를 사용할 수 있다.
//             *** 무한루프시스템을 사용하는 경우 - > 메뉴 보여주는 것 같은거?  탈출조건은 반드시 작성해야한다.
//            hit++
            System.out.println("나무를" + hit + " 번 찍었습니다."); // 출력문

            if (hit == 5) {
                System.out.println("나무가 넘어간다.");
            }

        }

//        Q. while문을 사용하여 1~10까지 화면에 출력하는 프로그램 작성

        int num = 1;
        while (num < 10) {
            num++;
            System.out.println(num);
        }
        if (num == 10) {
            System.out.println("끝");
        }


//        Q. while문을 사용하여 1~10까지 총합을 구하는 프로그램을 작성

        num = 0;
        int total = 0;

        while (num <= 10) {
            total = total + num;
            System.out.println(" Count : " + num + "\ttotal : " + total);
            num++;
        }

        System.out.println("예제");
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int n = 0;
        double sum = 0.0;
        System.out.println("정수 입력후 마지막에 0을 입력하라");
//              while문의 조건식에 탈출조건까지 함께 지정함.
//              키보드 입력을 통한 데이터가 0이 아닐경우 while문 실행한다. 0일 경우 while문 종료
        while ((n = scanner.nextInt()) != 0) { // 입력 받은 값이 0이 아니라면  밑을 실행하라.
//               입력받은 값을 n에 저장하라. /  0이 아님.
            sum = sum + n;
            count++;
        }
        System.out.println("수의 개수 " + count + "개이며, ");
//        총합이 저장된 변수 sum은 double 형
//        입력된 데이터의 수가 저장된 변수 count는 int 형
//        double 형과 int 형의 연산이 수행되면 자동형변환이 발생해 double 형으로 데이터가 만들어진다.
        System.out.println("평균은 " + sum / count + "입니다.");


//        Q4. while문 사용해 지정한 단수의 구구단 출력
//              출력형태 5*1=5 ...

//
//        System.out.print("출력차 하고자 하는 구구단 단수");
//        int dan = scanner.nextInt();
//        count = 1;
//        while (count < 18) {
//            System.out.println(dan + " * " + count + " = " + (dan * count));
//            count++;
//        }
//
//
////        다중 while문 (다중 와일문) : 하나의 while문 안에 또 다른 while문이 있는 형태
//        System.out.println("다중while문");
//
//        int i = 0;
//        int j = 0;
//        while (i < 6) {
//            while (j < 6) {
//                System.out.println("i : " + i + "\tj : " + j);
//                j++;
//            }
//            i++;
//            j=0;
//        }

        int i = 0;
        while (i < 5) {
            int j = 0;
            while (j < 5) {
                System.out.println(" i " + i + " \tj : " + j);
                j++;
            }

            i++;
        }


//        Q5. while 문 이용해 2~9 까지 구구단 출력하는 프로그램 작성

        System.out.println("구구단출력");
        i = 2;
        while (i < 9) {
            System.out.println(" --- " + i + " --- ");
            int j = 1;
            while (j < 10) {
                System.out.println(i +"*"+ j +" = "+ (i*j));
                j++;
            }

            i++;
        }

        System.out.println(" do while문 ");
//        while문과 동일한 반복문, 무조건 한번은 실행이 되는 while문
//        반복 조건을 마지막에 확인한다.
        System.out.println("-------일반적 while문");
        int c1 = 10;
        while (c1 < 5){

            System.out.println(c1);
            c1++;
        }
//          조건을 확인후 실행 : output : false -> 나타나는 것이 없음.
        System.out.println("---- do while");
        int c2 = 10;
        do{
            System.out.println(c2);
            c2++;
        }
        while (c2 < 5);
//        실행 후 조건확인 : output : 10 (while의 조건이 false지만 조건을 나중에 사용해서 c2의 값이 그대로 빠져나온다.)

    }
 }
