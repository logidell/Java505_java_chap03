import java.util.Scanner;

public class miniQuest {
    //    숫자만 입력하고 그 외 입력은 하지 않는 것 전제
//    입력은 Scanner ,nextint 함수 이용


    public static void main(String[] args) {



        while (true) {
            System.out.println(">>>>>>>[메뉴선택]<<<<<<");
            System.out.println(" 1. 회원 관리 \n 2. 과목 관리 \n 3. 수강 관리 \n 4. 결제 관리 \n 5. 종료 ");
            Scanner sc = new Scanner(System.in);
            int menu = 0;
            menu = sc.nextInt();

            if (menu == 1) {
                System.out.println("회원 관리 메뉴를 선택했습니다. ");
                break;
            } else if (menu == 2) {
                System.out.println("과목 관리 메뉴를 선택했습니다. ");
                break;
            } else if (menu == 3) {
                System.out.println("수강 관리 메뉴를 선택했습니다. ");
                break;
            } else if (menu == 4) {
                System.out.println("결제 관리 메뉴를 선택했습니다. ");
                break;
            } else if (menu == 5) {
                System.out.println("프로그램을 종료합니다. ");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }


        }

    }
}
