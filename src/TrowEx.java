public class TrowEx
{
    public static void main(String[] args) {
        Calcultor cal = new Calcultor();
try {
    cal.sum("10a","20a");
    cal.sub("10a","20");
} catch (Exception e) {
    System.out.println("실행시 오류 발생");
}

    }
}
