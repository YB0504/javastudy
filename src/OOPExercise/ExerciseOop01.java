package OOPExercise;

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    String info() {
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
    }

    public int getTotal() {
        return kor + eng + math;
    }

    public float getAverage() {
        return (int) (getTotal() / 3f * 10 + 0.5) / 10f;
    }
}

public class ExerciseOop01 {
    public static void main(String[] args) {
        Student s = new Student("학생", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);

        System.out.println("이름 : " + s.name);
        System.out.println("총점 : " + s.getTotal());
        System.out.println("평균 : " + s.getAverage());
    }
}
