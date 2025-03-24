**1. 다음 코드를 실행하여 출력되는 결과를 작성하세요.**
```java
public static void main(String[] args) {
    int a = 3;

    a = a + 1;
    System.out.println(a); // (1) 4

    a += 1;
    System.out.println(a); // (2) 5

    a -= 1;
    System.out.println(a); // (3) 4

    a *= 2;
    System.out.println(a); // (4) 8

    a /= 2;
    System.out.println(a); // (5) 4

    a %= 2;
    System.out.println(a); // (6) 0
}
```

---

**2. 다음 코드를 실행하여 출력되는 결과를 작성하세요.**
```java
public static void main(String[] args) {
    int x = 10;
    int y = x++;
    System.out.println(x); // (1) 11
    System.out.println(y); // (2) 10
}
```

---

**3. 다음 코드를 실행하여 출력되는 결과를 작성하세요.**
```java
public static void main(String[] args) {
    int a = 100;
    double b = 20.5;
    byte c = 3;
    b = a / (int) b;
    System.out.println(b * c); // (1)
}
```

---

**4. 다음 코드를 실행하여 출력되는 결과를 작성하세요.**
```java
public static void main(String[] args) {
    double a = 15.5;
    int b = 10;
    byte c = 2;
    System.out.println(((int) a / b) * c); // (1)
}
```

---

**5. 다음 코드를 실행하여 출력되는 결과를 작성하세요.**
```java
public static void main(String[] args) {
    int a = 5;
    int b = a++ + ++a * a--;
    System.out.println(a); // (1)
    System.out.println(b); // (2)
}
```

---

**6. 다음 코드를 실행하여 출력되는 결과를 작성하세요.**
```java
public static void main(String[] args) {
    int a = 5;
    int b = 10;
    int c = 0;

    c = ++a;
    c += b--;
    c *= a--;
    c -= --b;
    c /= ++a;

    System.out.println(a); // (1)
    System.out.println(b); // (2)
    System.out.println(c); // (3)
}
```

---

**7. 다음 코드를 실행하여 출력되는 결과를 작성하세요.**
```java
public static void main(String[] args) {
    boolean a = true;
    boolean b = false;

    boolean result = (!a && b) || ((a || b) && (a && !b));

    System.out.println(result); // (1)
}
```

---

**8. 다음 코드를 실행하여 출력되는 결과를 작성하세요.**
```java
public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = 30;

    int result = a > b ? (b > c ? b : c) : (a < c ? a : c);

    System.out.println(result); // (1)
}
```

---

**9. 다음 코드를 실행하여 출력되는 결과를 작성하세요.**
```java
public static void main(String[] args) {
    int a = 50;
    int b = 20;
    int c = 30;

    boolean result = a % b == c % b || c % a == b % a;

    System.out.println(result); // (1)
}
```

---

**10. 다음 코드를 실행하여 출력되는 결과를 작성하세요.**
```java
public static void main(String[] args) {
    int a = 10;
    int b = 20;
    String str1 = "30";
    String str2 = "40";

    String result = a + b + str1 + str2 + a + b;

    System.out.println(result); // (1)
}
```
