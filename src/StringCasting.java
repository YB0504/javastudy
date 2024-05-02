public class StringCasting {
    public static void main(String[] args) {
        int i = 100;
        String str = String.valueOf(i);

        double d = 200.0;
        String str2 = d + "";

        double sum = Integer.parseInt("+" + str) + Double.parseDouble(str2);
        double sum2 = Integer.valueOf(str) + Double.valueOf(str2);

        System.out.println(String.join("", str, " + ", str2, " = ") + sum);
        System.out.println(str + " + " + str2 + " = " + sum2);

        // 접미사는 알맞은 변환을 할 시 제거하지 않아도 가능하다.
        String str3 = "1.0f";
        float f1 = Float.parseFloat(str3);
        System.out.println("Float.parseFloat(1.0f) = " + f1);
    }
}
