package forStudy;

public class for01 {
    public static void main(String[] args) {
//        for (초기화; 조건식; 증감식;) {
//            조건식이 참인 동안 수행되는 문장
//        }
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
            System.out.println("1부터 "+i+"까지의 합"+sum);
        }
    }
}
