package java_level_test_week2;

public class Test06 {
    public static void main(String[] args) {
        // for -> while
//        for (int i = 0; i < 10; i++) {
//            if (i % 3 == 0) {
//                System.out.println(i + " 는 3의 배수");
//            }
//        }
        int i = 0;
        while (i < 10) {
            if (i % 3 == 0) {
                System.out.println(i + " 는 3의 배수");
            }
            i++;
        }
    }
}
