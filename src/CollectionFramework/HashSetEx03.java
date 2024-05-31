package CollectionFramework;

import java.util.HashSet;

public class HashSetEx03 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet<>();
        hashSet.add("abc");
        hashSet.add("abc");

        // 내용은 같지만 서로 다른 객체로 인식하기 때문에 두번 모두 출력된다.
        hashSet.add(new PerSon("David", 10));
        hashSet.add(new PerSon("David", 10));

        System.out.println(hashSet);
    }
}

class PerSon {
    String name;
    int age;

    public PerSon(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }
}
