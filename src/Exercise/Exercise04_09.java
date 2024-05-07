package Exercise;

public class Exercise04_09 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        while (num > 0) {
            
            // 주어진 숫자에서 각 자리수를 빼오는 방법
            sum += num % 10;
            num /= 10;
        }
        System.out.println("sum : " + sum);
    }
}
