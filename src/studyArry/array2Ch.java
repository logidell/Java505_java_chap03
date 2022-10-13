package studyArry;

public class array2Ch {
    public static void main(String[] args) {
//        기본 : 1차원 배열 / 선 / 체스의 한 줄 , 엑셀의 한 줄/ 배열 요소로 데이터를 가지는 배열
//        2차원 배열 : 1차 요소 가지고 있는 배열 / 면 / 체스판 바닥 , 엑셀 격자
//        3차원 배열 : 2차원 요소 가지고 있는 배열  체스 , 엑셀 페이지

//        int studyArry.array [행 크기 ] [열 크기]
        System.out.println("==================다차원 배열 ");
        System.out.println("1차원 배열 선언");
        int arr1[] = {1, 2, 3, 4, 5};


//        2차원 배열에서 항상 라인번호가 먼저, 칸 버전은 나중
//        라인 안에 칸이 있는 형태로 구성
//        2차원 배열에서 크기를 확인하기 위한 속성 length 사용시 배열명.length 시
//          해당 배열의 라인 수를 출력
        System.out.println("2차원 배열 선언");
        int arr2[][] = {
                {1, 2, 3},
                {4, 5, 6}};


        System.out.println("3차원 배열 선언");
        int arr3[][][] = {
                {{1, 2, 3}, {4, 5, 6}}, // 0번
                {{10, 11, 12}, {7, 8, 9}}}; // 1번

        int numArr[][] = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };


        System.out.println("numArr[4][1] : " + numArr[4][1]);
        System.out.println("numArr[4][1] : " + numArr[1][4]);
//        2차원 배열의 요소가 1차원 배열이므로 새로운 1차원 배열 형식의 변수에 2차원 배열의 요소를 대입하면 1차원 배열을 얻을 수 있음
        int test[] = numArr[2];
        System.out.println(test[0] + " " + test[1] + " " + test[2] + " " + test[3] + " " + test[4]);

//        반복문을 사용하여 2차원 배열의 데이터를 출력하려면 2중 반복문을 사용해야 함
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(numArr[i][j] + " ");
            }
        }

        System.out.println();

        for (int item[] : numArr) {
            for (int i : item) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        for (int item[] : numArr) {
            for (int i = 0; i < item.length; i++) {
                System.out.print(item[i] + " ");
            }
        }

        System.out.println();

        for (int i = 0; i < numArr.length; i++) {
            for (int item : numArr[i]) {
                System.out.print(item + " ");
            }
        }


        int numArr2[][] = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11, 12},
                {13, 14}
        };

        System.out.println();

        System.out.println(numArr2[3][1]);
        System.out.println(numArr2[2][4]);

        for (int i = 0; i < numArr2.length; i++) {
            for (int j = 0; j < numArr2[i].length; j++) {
                System.out.print(numArr2[i][j] + " ");
            }
        }

        System.out.println();

        for (int items[] : numArr2) {
            for (int item : items) {
                System.out.print(item + " ");
            }
        }
    }
}



