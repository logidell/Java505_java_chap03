public class Account {
    private long balance;
    public Account(){} //있으나 없으나 똑같.
    public long getBalance(){
        return balance;

    }public void deposit(int money){
        balance += money;
    }
    public void withdraw(int money)throws BalanceInsufficientExecption{
        if(balance < money){
//            예외 처리가 없을 경우
//            System.out.println("출금 금액이 총 예금금액보다 큽니다. ");
//            사용자 정의 예외를 사용한다.
            throw new BalanceInsufficientExecption("잔고 부족 : " + (money-balance)+" 부족합니다. ");
        }
        balance -= money;
    }
}
