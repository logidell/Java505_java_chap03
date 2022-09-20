import java.util.Scanner;

public class arrayReferenceType {

    public static void main(String[] args) {
//        기본 타입 : 데이터 직접저장, 리터럴 데이터 저장
//        레퍼런스 타입 : 데이터가 있는 주소를 저장

        System.out.println("\n======기본타입 /  레퍼런스 타입=========\n");

        int a = 10;
        int b = 20;

        System.out.println("변수 a 값 : " + a + " 변수 B의 값 : " + b);

//      변수 a값을 변수 b에 복사해 넘겨줌.
        b = a;
        System.out.println("변수 a 값 : " + a + " 변수 B의 값 : " + b);
//        변수 a의 값을 변경 시 변수 b 의 값은 그대로 남아있음. 값을 복사해 넘겨줬기 때문

        a = 150;
        System.out.println("변수 a 값 : " + a + " 변수 B의 값 : " + b);

        int arr1[] = {100};
        int arr2[] = {200};

        System.out.println("배열 1의 주소 : " + arr1 + " 배열2 의 주소  : " + arr2);
        System.out.println("배열1[0] 값 : " + arr1[0] + " 배열 arr2[0]의 값 : " + arr2[0]);

        arr2 = arr1;
        System.out.println("배열 1의 주소 : " + arr1 + " 배열2 의 주소  : " + arr2);
        System.out.println("배열1[0] 값 : " + arr1[0] + " 배열 arr2[0]의 값 : " + arr2[0]);
        arr1[0] = 2000;
        System.out.println("배열 1의 주소 : " + arr1 + " 배열2 의 주소  : " + arr2);
        System.out.println("배열1[0] 값 : " + arr1[0] + " 배열 arr2[0]의 값 : " + arr2[0]);

        // 배열 선언, 크기 5
//        배열 선언 시 배열의 크기를 설정하는 부분에 변수 사용 금지 (상수는 사용 가능)
//        변수는 변경되는 값이기 때문에 배열의 크기가 어떻게 될지 알 수 없음
//        배열의 index 접근에는 변수를 사용하는 것이 가능함
        int arrayInt[];
        arrayInt = new int[5]; // 배열 5 선언
        int max = 0;
        System.out.println("양수 5개 입력");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
//            사용자 입력을 통해 얻은 데이터 배열에 저장
            arrayInt[i] = scanner.nextInt();
//            배열에 저장된 데이터 max와 비교
            if (arrayInt[i] > max) {
                max = arrayInt[i]; // 배열에 자정된 값 형성
            }
            ;
        }
        System.out.println("가장 큰 수는 " + max + " max 입니다. ");

        System.out.println("\n ----- for ~ each -----\n");

        System.out.println("\n ----- 기존 for문을 사용한 배열의 데이터 출력 -----\n");
        int arrNum1[] = {10, 20, 30, 40, 50};
        int total1 = 0;

        for (int i = 0; i < arrNum1.length; i++) {
            System.out.println("arrNum1[" + i + "] : " + arrNum1[i]);
        }

        for (int i = 0; i < arrNum1.length; i++) {
            total1 = total1 + arrNum1[i];
            System.out.println("total1 : " + total1);
        }

        System.out.println("\n ----- for ~ each를 사용한 배열의 데이터 출력 -----\n");

        int arrNum2[] = {10, 20, 30, 40, 50};
        int total2 = 0;

        for (int num : arrNum2) {
            System.out.println("num : " + num);
        }

        for (int num : arrNum2) {
            total2 = total2 + num;
            System.out.println("total2 : " + total2);
        }
    }
}

