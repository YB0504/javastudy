public class ClassValueAndInstanceValue {
    public static void main(String[] args) {
        // Class변수는 객체 생성 없이 직접 사용 가능하다.
        System.out.println("Card.width : " + Card.width);
        System.out.println("Card.height : " + Card.height);

        // instance변수의 값 변경
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " +c1.kind+ ", "+c1.number+"이며, 크기는 ("+c1.width+", "+c1.height+")");
        System.out.println("c2은 " +c2.kind+ ", "+c2.number+"이며, 크기는 ("+c2.width+", "+c2.height+")");

        System.out.println("c1의 width, height 값 변경!");

        // Class 변수 값 변경
        // Class 변수는 하나의 저장공간을 공유하므로 하나의 값이 수정되어도 항상 공통된 값을 가진다.
        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 " +c1.kind+ ", "+c1.number+"이며, 크기는 ("+c1.width+", "+c1.height+")");
        System.out.println("c1은 " +c2.kind+ ", "+c2.number+"이며, 크기는 ("+c2.width+", "+c2.height+")");

    }
}

class Card{
    // instance 변수
    String kind;
    int number;

    // Class 변수
    static int width = 100;
    static int height = 250;
}
