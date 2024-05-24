package ExceptionHandling;

// 사용자 정의 예외 클라스를 만들기 위한 Exception클래스 상속
class MyException extends Exception {
    private String message;

    // 사용자 예외 클라스의 생성자
    public MyException(String message) {
        super(message);             // 부모 Exception클래스 생성자도 호출
        this.message = message;
    }

    // 사용자 예외 클래스 메시지 출력
    public void printMyMessage() {
        System.out.println(this.message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        try {
            // 예외 실행
            throw new MyException("사용자 정의 예외 클래스!!!!!");
        } catch (MyException e) {
            e.printMyMessage();     // 사용자 예외 클래스의 메소드 실행
            e.printStackTrace();    // 상속받은 Exception 클래스의 메소드 실행
        }
    }
}
