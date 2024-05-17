package oop1;

public class OverloadingEx {
    public static void main(String[] args) {
        MyMath3 myMath3 = new MyMath3();
        System.out.println("myMath3.add(3, 3) 결과 : " + myMath3.add(3, 3));

        int[] a = {100, 200, 300};
        System.out.println("myMath3.add(a) 결과 : " + myMath3.add(a));
    }
}

class MyMath3 {
    int add(int a, int b) {
        System.out.print("int add(int a, int b) - ");
        return a + b;
    }

    int add(int[] a) {
        System.out.print("int add(int[] a) - ");
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];

        }
        return result;
    }
}
