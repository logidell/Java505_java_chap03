import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Scanner;

public class TryCatchEx {
    public static void main(String[] args) {
        try { //error가 발생하는 코드를 놓기
            String data = null;
            System.out.println(data.toString());
            //실행중 오류가 발행하면 바로 catch (Exception e) 로 내려가 출력하고자 하는 것을 출력하도록 한다
            // 즉 오류가 나도 멈추지 않게 하는 역할을 한다.

        } catch (Exception e) { //해결할 방법은 이곳에
            System.out.println("Error : null인 데이터에서는 toString()메서드 사용이 불가합니다. ");
        }
        try {
            String data1 = args[10];
            String data2 = args[20];
            System.out.println("args[10] : " + data1);
            System.out.println("args[20] : " + data2);

        } catch (Exception e) {
            System.out.println("Error : 배열의 최대 index 범위를 넘어서 사용했습니다. ");
        }

        try {

            String data1 = "100";
            String data2 = "a100";

            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);

            int result = value1 + value2;
            System.out.println(data1 + "+" + data2 + "=" + result);

        } catch (NumberFormatException e) {
            System.out.println("Error : 정수로 변환할 수 없습니다.");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            e.printStackTrace(); // 어느 부분에서 오류가 발생했는지 정보를 보여주는 것이다. 오류 뜬 게 아님.

//            예외 처리를 하나로 모두 처리할 시 (범용으로 처리할 경우 )  Exception e를 사용한다.
//            지정하는 예외 상황만 처리하고자 할 경우 예외종류를 지정해 사용할 경우 그 예외 종류를 적는다.
        } catch (NullPointerException e) {
            // 하나의 try 구문에서 여러개의 지정된 예외처리 하고자 할 경우 catch를 여러개 사용할 수 있다.
            // if else 처럼 조건이 있는데 순서대로 내려가기 때문에 지정 예외 사용 후 범용을 추가로 넣을 시에는 맨 마지막에 작성한다.

            System.out.println("Null을 사용하여 진행할 수 없습니다. ");
        } catch (Exception e) {
            System.out.println("Error : Unknown Error.");
            // 범용 Exception e은 모든 클레스의 최상위 클래스이기 때문에 마지막에 사용해야 한다.
        }

        System.out.println("=========================================================");


//        finally
//        try~catch  구문에서 예외가 발생하던 발생하지 닪던 무조건 실행되어야 하는 소스코들르 입력하는 부분을 finally라고 한다.
//        주로 외부 리소스 사용시,예외 해당 리소스를 해제하기 위한 목적으로 많이 사용한다.
//        외부 리소스 : 파일, 네트워크 연결 (통신)
//        자바의 특징은 가비지 컬렉터가 있고 비사용메모리를 자동으로 제거해주는 가장 큰 특징이나 이 네트워크 연결은
//        자동정리가 되지 않는다 . 변수, 함수, 클래스들은 자바 프로그램안에서 동작하지만 네크워크들은 바깥에서 동작하기 때문에
//        자동정리가 되지 않는 것이다.
//         -> 자동정리가 되지 않기 때문에 open / close를 해줘야 한다. 이걸 해주지 않을 시 시간이 지남에 따라 메모리가 계속 커진다.
//         -> 이 현상이 메모리 누수 현상.

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("문자열 입력");
            String data = scanner.nextLine();

            if (data.equals("")) {
                data = null;
            }

            System.out.println("입력된 내용" + data.toString());
            System.out.println("여기는 정상 실행 완료 후 실행되는 부분");

        } catch (NullPointerException e) {
            System.out.println("예외 발생 시 실행되는 부분");
            System.out.println("예외 이유 : " + e.getMessage());
        } finally {
            System.out.println("여긴 무조건 실행되어야 하는 부분");
        }
        System.out.println("try ~ catch 가 완료된 후 실행되는 구문 ");

        System.out.println("=========================================\n");

        File file = new File("test.txt");
        String str = " moondhaya!!!!!!!!!! ";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(str);
            writer.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("파일은 내가 먹었다. 쓰기 사용시 오류 발생");
        }
        System.out.println("파일쓰기완료");
        FileReader fr = null;
        BufferedReader reader = null;

        try {
            fr = new FileReader("c:\\test.text");
            reader = new BufferedReader(fr);
            String tmp;


            while ((tmp = reader.readLine()) != null) {
                System.out.println("파일 내용 > >" + tmp);
            }

        } catch (IOException e) {
            System.out.println("파일 사용 시 오류 발생");
            System.out.println(e.getMessage());

        } finally {
            try {
                if (reader != null) reader.close();
                if (fr != null) fr.close();


            } catch (Exception e) {

            }
        }
        System.out.println(" =====읽기 완료 =====");

    }

}
