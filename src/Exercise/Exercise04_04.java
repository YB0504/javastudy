package Exercise;

public class Exercise04_04 {
    public static void main(String[] args) {
        int sum = 0;
        int s = 1;
        int num = 0;

        for (int i = 1; sum < 100; i++, s = -s) {
            num = i * s;
            sum += num;
        }
        System.out.println("num : " + num);
        System.out.println("sum : " + sum);
    }
}
