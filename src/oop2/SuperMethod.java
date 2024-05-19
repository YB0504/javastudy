package oop2;

class PointSuper {
    int x, y;

    PointSuper(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends PointSuper {
    int z;

    Point3D(int x, int y, int z) {
        super(x, y);    // PointSuper(int x, int y)를 호출
        this.z = z;
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(1, 2, 3);
        System.out.println("x = " + point3D.x + ", y = " + point3D.y + ", z = " + point3D.z);
//        x = 1, y = 2, z = 3
    }
}
