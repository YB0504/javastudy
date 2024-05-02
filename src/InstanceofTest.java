class Parents {
}

class Childs extends Parents {
}

public class InstanceofTest {
    public static void main(String[] args) {
        Parents parents = new Parents();
        Childs childs = new Childs();

        System.out.println(parents instanceof Parents); // true
        System.out.println(childs instanceof Parents);  // true
        System.out.println(parents instanceof Childs);  // false
        System.out.println(childs instanceof Childs);   // true
    }
}
