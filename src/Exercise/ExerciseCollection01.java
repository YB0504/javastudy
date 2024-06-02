package Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable {
    String name;
    int ban;
    int no;
    int kor, eng, math;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

    @Override
    public String toString() {
        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage();
    }

    @Override
    public int compareTo(Object o) {
        // instanceof 연산자로 비교하여 참이 된다면
        if (o instanceof Student) {
            // Student 객체를 tmp 변수에 저장시켜둔다.
            Student tmp = (Student) o;

            // name 값이 기준이 되어 정렬하기 위해
            // String.compareTo() 에 tmp 에 저장해둔 객체에서 name 을 전달한다.
            return name.compareTo(tmp.name);
        } else {
            // 객체 자신의 인스턴스와 비교하여 자신이 작다면 음수를 반환한다.
            return -1;
        }
    }
}

public class ExerciseCollection01 {
    public static void main(String[] args) {
        // Comparable Interface 를 구현하도록 변경하여 이름이 기본 정렬기준이 되도록 구현
        ArrayList list = new ArrayList();
        list.add(new Student("홍길동", 1, 1, 100, 100, 100));
        list.add(new Student("홍길1", 1, 2, 90, 70, 80));
        list.add(new Student("홍길2", 1, 3, 80, 80, 90));
        list.add(new Student("홍길3", 1, 4, 70, 90, 70));
        list.add(new Student("홍길4", 1, 5, 60, 100, 80));

        Collections.sort(list);
        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
