package java_level_test_week2;

public class Test07 {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i == 10) {
                break;
            }
            if (i % 3 == 0) {
                i++;
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
