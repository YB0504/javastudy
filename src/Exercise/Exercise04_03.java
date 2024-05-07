package Exercise;

public class Exercise04_03 {
    public static void main(String[] args) {
        int sum = 0;
        int total = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            total += sum;
        }
        System.out.println("1 ~ 10까지 누적 합 : "+total);
    }
}
