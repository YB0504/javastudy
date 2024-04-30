public class Operator {
    public static void main(String[] args) {
        int i = 5;
        int j = 0;

        j = i++;
        System.out.println("i++ 실행 후 j = " + j + " i = " + i);

        i = 5;
        j = 0;

        j = ++i;
        System.out.println("++i 실행 후 j = " + j + " i = " + i);
    }
}
