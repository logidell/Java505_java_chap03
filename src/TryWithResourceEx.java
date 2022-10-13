public class TryWithResourceEx {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("file.txt")) {
            fis.read();
            throw new Exception(); //예외 강제 발생, 예외 발생시키기
        } catch (Exception e) {
            System.out.println("예외처리 코드가 실행되었습니다.");
        } //파이썬에서는 많이 사용하는 구문


/*
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("filename.text");
            fis.read();
            throw new Exception();

        }catch (Exception e) {
            System.out.println("예외 발생시 동작하는 부분 ");

        }*/ //동작이 안됨.

    }
}
