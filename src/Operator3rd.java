public class Operator3rd {
    public static void main(String[] args) {
        int x, y, z;
        int absX, absY, absZ;
        char signX, signY, signZ;

        x = 10;
        y = -5;
        z = 0;

        absX = x >= 0 ? x : -x;
        absY = y >= 0 ? y : -y;
        absZ = z >= 0 ? z : -z;

        // 조건 연산자의 중첩 사용
        signX = x > 0 ? '+' : (x == 0 ? ' ' : '-');
        signY = y > 0 ? '+' : (y == 0 ? ' ' : '-');
        signZ = z > 0 ? '+' : (z == 0 ? ' ' : '-');

        System.out.println("x = "+ signX+ absX);
        System.out.println("y = "+ signY+ absY);
        System.out.println("z = "+ signZ+ absZ);
    }
}
