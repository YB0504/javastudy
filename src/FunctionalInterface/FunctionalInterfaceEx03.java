package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

class Student {
    private String name;

    int kor;
    int eng;
    int math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }
}

public class FunctionalInterfaceEx03 {
    public static void main(String[] args) {

        // int -> String
        Function<Integer, String> intToStr = t -> String.valueOf(t);
        String str = intToStr.apply(100);

        // String -> int
        ToIntFunction<String> strToInt = t -> Integer.valueOf(t);
        int num = strToInt.applyAsInt("100");

        // int -> double
        // 같은 기본 자료형 간의 변환은 <>가 없다.
//        ToDoubleFunction intToDouble = t -> (double) t;
//        double d = intToDouble.applyAsDouble(100);

        List<Student> list = Arrays.asList(
                new Student("홍길동", 99, 12, 45),
                new Student("김길동", 76, 20, 8),
                new Student("이길동", 36, 50, 33),
                new Student("박길동", 77, 89, 91)
        );

        // 학생 이름 가져오는 함수
        Function<Student, String> getNameFunc = (s) -> s.getName();

        // 교과목 평균 계산
        ToDoubleFunction<Student> getScoreFunc = (s) -> {
            int sum = s.kor + s.eng + s.math;
            double avg = sum / 3.0;
            return avg;
        };

        for (Student student : list) {
            String name = getNameFunc.apply(student);
            double avg = getScoreFunc.applyAsDouble(student);
            System.out.printf("%s 평균 점수 : %f\n", name, avg);
        }
    }
}
