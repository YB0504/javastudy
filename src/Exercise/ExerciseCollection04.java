package Exercise;

import java.util.*;

public class ExerciseCollection04 {
    public static void main(String[] args) {
        // 1 ~ 30 사이의 숫자들로 만들었다.
        // 숫자들의 위치가 잘 섞이지 않는 이유와 문제를 개선하는 코드를 작성
        Set set = new HashSet();
        int[][] board = new int[5][5];

        // 중복 값을 허용하지 않는다.
        // 그러나 해싱알고리즘의 특성상 같은 값은 같은 자리에 저장된다.
        // 그래서 빙고판의 숫자가 잘 섞이지 않는다.
        for (int i = 0; set.size() < 25; i++) {
            set.add((int) (Math.random() * 30) + 1 + "");
        }

        // 그래서 저장순서를 유지하는 ArrayList 내부에 HashSet의 데이터를 담고
        // shuffle() 를 이용하여 저장된 데이터의 순서를 뒤섞는다.
//        ArrayList list = new ArrayList(set);
//        Collections.shuffle(list);

//        Iterator iterator = list.iterator();
        Iterator iterator = set.iterator();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Integer.parseInt((String) iterator.next());
                System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
            }
            System.out.println();
        }
    }
}
