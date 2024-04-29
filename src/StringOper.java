public class StringOper {
    public static void main(String[] args) {
        String name = "ja" + "va";
        String str = name + 8.0;

        System.out.println(name);
        System.out.println(str);
        System.out.println(7 + " ");    // 숫자 + String -> "7" + " "
        System.out.println(" " + 7);    // " 7"
        System.out.println(7 + 7 + ""); // "14"
        System.out.println("" + 7 + 7); // "77"
    }
}
