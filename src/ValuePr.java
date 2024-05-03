public class ValuePr {
    // 전역 변수
    String name;
    int age;

    // 클래스 변수
    static String breed;

    //    public static void main(String[] args) {
//        String message = "전역 변수 name"+name+ "전역 변수 age"+age+"클래스 변수"+breed;
//        static메소드에서는 static으로 선언된 변수인 클래스 변수만 바로 사용할 수 있고
//        일반 전역 변수는 변수가 선언된 Class의 instance를 생성해야만 접근할 수 있다.
    public void print(){
        // message = 지역변수
        String message = "전역 변수 name : "+name+ "\n전역 변수 age : "+age+"\n클래스 변수 : "+breed;
        System.out.println(message);
    }

    public static void main(String[] args) {
        ValuePr valuePr = new ValuePr();
        valuePr.print();
    }
}
