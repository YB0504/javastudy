package Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student02 {
    String name;
    int ban;
    int no;
    int kor, eng, math;

    public Student02(String name, int ban, int no, int kor, int eng, int math) {
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

}

class BanNoAscending implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Student02 && o2 instanceof Student02) {
            Student02 s1 = (Student02) o1;
            Student02 s2 = (Student02) o2;

            // 삼항 연산자를 이용하여 아래의 답을 한줄로 줄일 수도 있다.
//            return s1.ban == s2.ban ? s1.no - s2.no : s1.ban - s2.ban;

            // Integer 형태의 compare 객체 간 단순 뺄셈으로도 compareTo() 를 구현할 수 있다.
            // 정렬 기준이 양수, 음수, 0 중 하나를 반환하기 때문
            int result = s1.ban - s2.ban;

            if (result == 0) {
                return s1.no - s2.no;
            }
            return result;
        }
        return -1;
    }
}

public class ExerciseCollection02 {
    public static void main(String[] args) {
        
        ArrayList list = new ArrayList();
        list.add(new Student("이자바", 2, 1, 70, 90, 70));
        list.add(new Student("안자바", 2, 2, 60, 100, 80));
        list.add(new Student("홍길동", 1, 3, 100, 100, 100));
        list.add(new Student("남궁성", 1, 1, 90, 70, 80));
        list.add(new Student("김자바", 1, 2, 80, 80, 90));

        Collections.sort(list, new BanNoAscending());
        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
