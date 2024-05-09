package forStudy;

public class EnhancedFor {
    public static void main(String[] args) {
        // 향상된 for문
//        for (타입 변수 : 배열, 컬렉션) {
//            실행문;
//        }
        String[] Array = {"1-1", "1-2", "1-3", "1-4", "1-5"};

        for (String str : Array) {
            System.out.println(str);
        }
    }
}
