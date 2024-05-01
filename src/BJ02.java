import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ02 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("1번");
        int a = Integer.parseInt(br.readLine());
        System.out.println("2번");
        int b = Integer.parseInt(br.readLine());

        System.out.println((b % 10) * a);
        System.out.println((b % 100 / 10) * a);
        System.out.println((b % 1000 / 100) * a);
        System.out.println(a * b);
    }
}
