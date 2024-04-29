import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(new A("1"));            // [1]
        arr.add(new A("2"));            // [1,2]
        // set은 그 위치에 값을 교체
        arr.set(0, new A("0"));         // [0,2]
        
        // 해당 index에 있는 값을 뒤로 밀어내고 값을 삽입
        arr.add(0, new A("10"));  // [10,0,2]

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

    }
}
