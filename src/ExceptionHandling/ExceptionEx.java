package ExceptionHandling;

public class ExceptionEx {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 예외 발생");
            throw e; // 예외 발생

            // 한 줄로 표현
//            throw new Exception("고의 예외");
        } catch (Exception e) {
            System.out.println("에러 : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
