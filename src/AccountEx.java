public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        System.out.println("예금액 : " + account.getBalance());
        try {
            account.withdraw(30000);
        } catch (Exception e) {
            String message = e.getMessage();
            System.out.println(message);
            System.out.println();
            e.printStackTrace(); //예외 처리 정보 보고있는 화면에서 직접 보여주는 것
            e.getStackTrace(); // 유지보수용 예외 정보 얻기

        }
    }
}
