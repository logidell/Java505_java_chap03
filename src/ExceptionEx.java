public class ExceptionEx {
    public static void main(String[] args) {
        //예외처리할 경우에는 전 파일을 한번 실행해줘야한다. ㅠㅠ 맨 위의 파일부터 끝까지 실행시켜줘야만 한다.
        //NullPointerException error
//        String data=null;
//        System.out.println(data.toString());

//        ArrayIndexOutOfBoundsException error

//        String data1 = args[0];
//        String data2 = args[1];
//
//        System.out.println("args[0] : "+ data1);
//        System.out.println("args[1] : "+ data2);

        String data1 = "100";
        String data2 = "a100";

        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2);

        int result = value1 + value2;
        System.out.println(data1 + "+" + data2 + "=" + result);

    }
}
