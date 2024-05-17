package OOPExercise;

class MyPoint {
    int x;
    int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public double getDistance(int x1, int y1) {
        return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
    }
}

public class ExerciseOop03 {
    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint(1, 1);
        
        System.out.println(myPoint.getDistance(2, 2));
    }
}
