public class Calcultor {
    public void sum(String  a, String b){
        try {
            int result = 0;
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            result = num1 + num2;
            System.out.println(" 두 수의 합은 " + result + "이다. ");
        }catch (Exception e) {
            System.out.println("sum 함수에서 연산 중 오류 발생");
        }
    }
    //예외 발생시 해당 메서드를 사용하는 곳으로 예외를 떠넘긴다.
    // throws 스프링시에 많이 사용할 것 같ㅇ...ㅠ
    public void sub(String a, String b) throws Exception {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        int result = num1 - num2;
        System.out.println(" 두 수의 차는 " + result + "이다. ");
    }
}
