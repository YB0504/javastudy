package ExceptionHandling;

public class MultiCatchBlock {
    public static void main(String[] args) {
        try {
            System.out.println(1);
        } catch (NullPointerException | ArrayIndexOutOfBoundsException exception) {
            if (exception instanceof NullPointerException) {
                System.out.println(exception);
            }
        }
    }
}
