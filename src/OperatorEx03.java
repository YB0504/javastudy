public class OperatorEx03 {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        float result = (float) x / y;

        System.out.println(result);

        double d1 = 3.5;
        double d2 = 2.7;
        int result1 = (int) (d1 + d2);

        System.out.println(result1);

        long var1 = 2L;
        float var2 = 1.8f;
        double var3 = 2.5;
        String var4 = "3.9";

        int result2 = (int) (var1 + Math.round(var2) + var3 + (int)(Double.parseDouble(var4)));

        System.out.println(result2);

        String str1 = 2 + ""+3;
        String str2 = 2 + 3 + "";
        String str3 = ""+2+3;

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        byte value1 = Byte.parseByte("10");
        int value2 = Integer.parseInt("1000");
        float value3 = Float.parseFloat("20.5");
        double value4 = Double.parseDouble("3.14159");

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);

    }
}
