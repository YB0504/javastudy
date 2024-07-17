package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;

class StudentEx {
    String name;
    int score;

    public StudentEx(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class FunctionalInterfaceEx05 {
    public static void main(String[] args) {

        List<StudentEx> list = Arrays.asList(
                new StudentEx("홍1", 99),
                new StudentEx("홍2", 76),
                new StudentEx("홍3", 36),
                new StudentEx("홍4", 77)
        );

        // int 형 매개 값을 받아 일정 점수 이상이면 true, 아니면 false
        IntPredicate scoring = (t) -> {
            return t >= 60;
        };

        for (StudentEx studentEx : list) {
            String name = studentEx.name;
            int score = studentEx.score;

            // Predicate 메소드 실행
            boolean pass = scoring.test(score);

            if (pass) {
                System.out.println(name + "님" + score + "점은 국어 합격");
            } else {
                System.out.println(name + "님" + score + "점은 국어 불합격");
            } 
        }
    }
}
