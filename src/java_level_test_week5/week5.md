**1. 다음 중, 옳은 설명을 모두 고르세요.**
1. List 인터페이스는 Collection 인터페이스의 하위(자식) 인터페이스이다. O
2. List는 일반적으로 순서를 유지하지 않는다. List는 삽입된 요소의 순서를 유지한다.
3. List는 중복된 요소를 허용한다. O
4. List는 요소의 삽입 위치를 선택할 수 없다. 삽입 위치를 선택할 수 없다. (add() 활용)
5. List 인터페이스는 동기화된 연산을 제공한다. List는 동기화된 연산을 제공하지 않는다. Collection의 synchronizedList() 활용

---

**2. 다음 중, 옳은 설명을 모두 고르세요.**
1. Set 인터페이스는 Collection 인터페이스의 하위(자식) 인터페이스이다. O
2. Set은 일반적으로 순서를 유지한다. Set은 순서를 보장하지 않는다.
3. Set은 중복된 요소를 허용하지 않는다. O
4. Set은 모든 요소가 유일하게 유지되어야 한다는 것을 제외하면 List 인터페이스와 마찬가지로 작동한다. O
5. Set 인터페이스는 동기화된 연산을 제공한다. List와 마찬가지

---

**3. 다음 중, 옳은 설명을 모두 고르세요.**
1. Map 인터페이스는 Collection 인터페이스의 하위(자식) 인터페이스이다. Map은 상속받지 않는 Interface
2. Map은 키-값 쌍의 구조를 가지며, 키는 중복될 수 있다. 값은 중복되나 키는 불가능
3. Map 인터페이스는 순서를 유지하지 않는다. O
4. Map 인터페이스의 구현체 중 하나인 HashMap은 동기화를 보장한다. List와 마찬가지
5. Map 인터페이스에서 일반적으로 null 키와 null 값은 허용되지 않는다. 
   Map 자체는 null키, 값을 허용하나 Hashtable은 허용되지 않고 TreeMap도 null키를 허용하지 않는다.

---

**4. 다음 중, 옳은 설명을 모두 고르세요.**
1. Stack은 FIFO 원칙에 따라, Queue는 LIFO 원칙에 따라 항목을 추가하고 제거한다. 반대
2. Stack과 Queue는 모두 Deque 인터페이스로 구현할 수 있다. O
3. Stack 클래스의 `push()` 메서드는 Stack의 맨 아래에 요소를 추가한다. 맨 위
4. Queue 인터페이스의 `offer()` 메서드는 Queue의 가장 뒤에 항목을 추가한다. O
5. Stack과 Queue 모두 단일 스레드 환경에서만 사용되어야 한다. 멀티스레드에서도 가능

---

**5. 다음 중, ArrayList에서 가장 시간이 많이 드는 작업은? (단, 작업 도중에 ArrayList의 크기 변경이 발생하지 않는다고 가정한다)**
1. 마지막에 새로운 요소를 추가 O(1)
2. 첫 번째에 요소를 추가 O(N) O 순서를 유지하고 있기 때문에 첫 번째 요소에 값이 추가되려면 그 이외의 요소를 모두 움직여야 한다.
3. 중간에 새로운 요소를 추가 O(N)
4. 마지막 요소를 삭제 O(1)

---

**6. 다음 코드를 실행했을 때 출력되는 결과를 작성하세요.**
```java
// Ex06Main.java
public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(6);
    list.add(1);
    list.add(7);
    list.add(3);
    list.add(4);
    list.add(1);

    Set tset = new TreeSet(list);
    Set hset = new LinkedHashSet(list);
    Stack stack = new Stack();
    stack.addAll(hset);

    while (!stack.isEmpty()) {
        System.out.println(stack.pop());
    }
}
```

**7. 다음 코드를 실행했을 때 출력되는 결과를 작성하세요.**
```java
// Ex07Main.java
public static void main(String[] args) {
    Set<Student> students = new HashSet<>();
    Student student1 = new Student("Kim", 10);
    Student student2 = new Student("Kim", 10);
    Student student3 = new Student("Lee", 10);
    Student student4 = new Student("Park", 20);
    Student student5 = new Student("Lee", 20);
    students.add(student1);
    students.add(student2);
    students.add(student3);
    students.add(student4);
    students.add(student5);

    System.out.println(student1.equals(student2)); // (1)
    System.out.println(students.size()); // (2)
    System.out.println(students.contains(new Student("Lee", 10))); // (3)
}

// Student.java
public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
```



