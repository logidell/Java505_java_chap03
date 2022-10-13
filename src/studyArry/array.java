package studyArry;

public class array {

    public static void main(String[] args) {


        System.out.println("===============배열 사용================");
//        배열:
//        하나의 이름으로 여러개의 데이터를 저장하기 위한 데이터 타입
//        자바의 배열은 동일한 데이터 타입의 데이터만 저장할 수 있다.
//                배열은 index를 가지고 있고 데이터를 index를 통해서 구분한다
//        index는 0 부터 시작하고 new 키워드를 사용해 배열을 초기화시 해당 데이터 타입의 초기값으로 지정
//        지정된 크기 이상의 인데스 접근 시에 오류 발생
//
//        사용법:
//        선언:
//        1. 데이터타입 배열명[] = new 데이터타입[크기]
//        2. 데이터 타입 배열명 [];
//        배열명 = new 데이터타입[크기]
//        3. 데이터 타입 배열명 [] ={
//            데이터1, 데이터2, 데이터3....}
//        사용:
//        1. 배열명[index]; -지정한 index에 있는 데이터 가져옴
//        2. 배열명[index] = 데이터; -지정한 index에 데이터 저장

//        빈 배열 선언, 메모리 상의 array1 이라는 빈 배열을 등록
//        해당 배열 사용시에는 반드시 초기화 작업이 필요하다. 초기화 하지 않을 시 배열 사용 오류
        int array1[]; // 등록만 해 둔것이지 사용할 수 있는 것은 아니다.
        array1 = new int[5]; // 실제로 데이터가 있음을 선언해주고 초기화를 한다.
        System.out.println("배열 array1의 메모리 주소 : " + array1);
        System.out.println("배열 array1의 index 0의 값 : " + array1[0]);
        array1[2] = 10;
        System.out.println("배열 array1의 index 2의 값 : " + array1[2]);
        System.out.println("배열 array1의 index 4의 값 : " + array1[4]);
//        System.out.println("배열 array1의 index 5의 값 : " + array1[5]);
        System.out.println("배열 array1의 길이 : " + array1.length);

        System.out.println();

        int array2[] = new int[5];
        System.out.println("배열 array2의 메모리 주소 : " + array2);
        System.out.println("배열 array2의 index 0의 값 : " + array2[0]);
        array2[2] = 20;
        System.out.println("배열 array2의 index 2의 값 : " + array2[2]);
        System.out.println("배열 array2의 index 4의 값 : " + array2[4]);
//        System.out.println("배열 array2의 index 5의 값 : " + array2[5]);
        System.out.println("배열 array2의 길이 : " + array2.length);

        System.out.println();


        int array3[] = {10, 20, 30, 40, 50};
        System.out.println("배열 array3의 메모리 주소 : " + array3);
        System.out.println("배열 array3의 index 0의 값 : " + array3[0]);
        array3[2] = 300;
        System.out.println("배열 array3의 index 2의 값 : " + array3[2]);
        System.out.println("배열 array3의 index 4의 값 : " + array3[4]);
//        System.out.println("배열 array3의 index 5의 값 : " + array3[5]);
        System.out.println("배열 array3의 길이 : " + array3.length);

//        배열을 먼저 선언하고 데이터를 나중에 입력하는 1번 형식으로 배열을 선언 시 3번 형식의 데이터 입력은 불가능함
//        int array4[];
//        array4 = {10, 20, 30, 40, 50}; // 오류 발생
//        array4 = new int[5]; // 무조// 무조건 new를 사용해야한다. 크기를 모르기 때문에 오류가 발생.
//        array4[0] = 10;
//        array4[1] = 20;

//        Q. int 타입의 변수 int /studyArry.array 를 생성하고 크기를 10으로 설정한 후 각 index에 1~10까지의 데이터 입력 후
//        저장된 데이터를 출력

//        int array10[];
//        array10 = new int[10];
//        array10[0]=1;
//        array10[1]=2;
//        array10[2]=3;
//        array10[3]=4;
//        array10[4]=5;
//        array10[5]=6;
//        array10[6]=7;
//        array10[7]=8;
//        array10[8]=9;
//        array10[9]=10;

        int array10[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(array10[0]);
        System.out.println(array10[1]);
        System.out.println(array10[2]);
        System.out.println(array10[3]);
        System.out.println(array10[4]);
        System.out.println(array10[5]);
        System.out.println(array10[6]);
        System.out.println(array10[7]);
        System.out.println(array10[8]);
        System.out.println(array10[9]);


//  Q. 위의 문제의 intarray 에 저장된 값을 모두 합하는 프로그램
        int sum = 0;
        sum = (array10[0] + array10[1] + array10[2] + array10[3] + array10[4] +
                array10[5] + array10[6] + array10[7] + array10[8] + array10[9]);

        System.out.println(sum);


    }


}

