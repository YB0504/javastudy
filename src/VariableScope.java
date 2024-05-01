public class VariableScope {
    public static void main(String[] args) {
        int v1 = 15;
        if (v1 > 10) {
            int v2;
            v2 = v1 - 10;
        }
        // v2 변수는 사용가능 범위를 벗어나서 사용할 수 없다.
        int v3 = v1 + v2 + 5;

        int i1 = 0;
        if (true) {
            int i2 = 0;
            if (true) {
                int i3 = 0;
                i1 = 1;
                i2 = 1;
                i3 = 1;
            }
            // i3 변수 역시 사용가능 범위를 벗어났다.
            i1 = i2 + i3;
        }
    }
}
