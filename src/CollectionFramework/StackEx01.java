package CollectionFramework;

import java.util.Stack;

public class StackEx01 {
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push("0");
        st.push("1");
        st.push("2");

        System.out.println("= Stack =");
        while (!st.empty()) {
            System.out.println(st.pop());
        }
    }
}
