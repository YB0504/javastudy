package java_level_test_week5;

import java.util.HashSet;
import java.util.Set;

public class SetStudent {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Student student1 = new Student("Kim", 10);
        Student student2 = new Student("Kim", 10);
        Student student3 = new Student("Lee", 10);
        Student student4 = new Student("Park", 20);
        Student student5 = new Student("Lee", 20);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println(student1.equals(student2)); // (1) 같은 Set 인지 확인
        System.out.println(students.size()); // (2) 모든 값이 hash값이 다르게 입력되기 때문에 size = 5
        System.out.println(students.contains(new Student("Lee", 10))); // (3) new로 새로운 객체가 생성되어 hash값이 다름
        System.out.println(students.contains(student3)); // 요건 Set에 들어있는 "Lee", 10과 같은 hash값이므로 true
        System.out.println(students);
    }
}
