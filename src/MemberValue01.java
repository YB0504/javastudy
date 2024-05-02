public class MemberValue01 {
    // Class 초기화 블록
    static {
        System.out.println("static { }");
    }

    // instance 초기화 블럭
    {
        System.out.println("{ }");
    }

    public MemberValue01(){
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("MemberValue mv = new MemberValue();");
        MemberValue01 mv = new MemberValue01();

        System.out.println("MemberValue mv2 = new MemberValue();");
        MemberValue01 mv2 = new MemberValue01();
    }
//   클래스가 메모리에 로딩되면서 클래스 초기화 블럭 → main메소드가 실행되며 instance생성 후 instance초기화 블럭 → 생성자
}
