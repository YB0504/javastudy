public class Exercise01 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        int temp = x;
        x = y;
        y = z;
        z = temp;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
