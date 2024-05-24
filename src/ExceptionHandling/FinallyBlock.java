package ExceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            // 예외가 발생할 가능성이 있는 문장
        } catch (Exception e) {
            // 예외처리를 위한 문장
        } finally {
            // 예외의 발생여부에 관계없이 항상 수행되어야하는 문장
            // finally블럭은 try-catch문의 맨 마지막에 위치한다.
        }
    }
}
