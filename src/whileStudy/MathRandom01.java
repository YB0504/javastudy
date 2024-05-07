package whileStudy;

public class MathRandom01 {
    public static void main(String[] args) {

        for (int i = 1; i < 7; i++) {
            int lotto = (int) (Math.random() * 45) + 1;
            System.out.println("["+lotto+"]");
        }
    }
}
