//package forStudy;
//
//public class for04 {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5 - i; j++) {
//                System.out.print("@");
//            }
//            for (int k = 1; k <= (i * 2) - 1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
package forStudy;

public class for04 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) { // 피라미드가 거꾸로 뒤집히도록 i의 초기값과 증감식을 수정
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" "); // 공백을 추가하여 정렬
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
