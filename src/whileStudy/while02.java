package whileStudy;

public class while02 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (sum <= 100) {
            System.out.println("sum += ++"+i+" : " + sum);
            sum += ++i;
        }
    }
}
