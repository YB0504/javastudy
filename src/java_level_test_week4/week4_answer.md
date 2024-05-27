**1. Java의 '예외'와 '에러'에 대해 설명하세요.**
- **예외(Exception)**
  - 올바르지 않은 사용자 입력, 파일 또는 데이터베이스의 누락 등 외부 요인에 의해 발생하는 오류 
  - 적절한 예외 처리를 통해 프로그램 복구가 가능함
- **에러(Error)** 
  - 메모리 부족 등과 같은 심각한 시스템 문제에 의해 프로그램이 복구할 수 없는 상태로 이어지는 오류 
  - 보통 JVM 내에서 발생하며 개발자가 처리할 수 없음
---

**2. 다음 중 옳은 설명을 모두 고르세요.** 
- ~~a. `Exception` 클래스와 `RuntimeException` 클래스 모두 메서드 선언부에 반드시 포함되어야 한다.~~ 
- b. `Exception` 클래스는 체크 예외에, `RuntimeException` 클래스는 언체크 예외에 사용된다. 
- c. 런타임 예외는 일반적으로 프로그래머의 오류로 인해 발생하며, 컴파일 타임에 감지되지 않는다. 
- ~~d. `Exception`은 `RuntimeException`의 상위 클래스이며, `RuntimeException`은 모든 예외를 다룰 수 있다.~~ 
- ~~e. 런타임 예외는 메모리 부족이나 네트워크 연결 오류 같은 하드웨어 또는 시스템 문제에서 사용된다.~~

---

**3. 다음 중 옳은 설명을 모두 고르세요.**
- a. 체크 예외는 `Error` 클래스에서 파생되지 않는다.
- ~~b. 언체크 예외는 `Error` 클래스에서 파생된다.~~
- c. `finally` 블록의 목적 중 하나는, 중단되었거나 완료된 `try` 블록 또는 `catch` 블록이 사용한 자원을 회수하는 것이다. 
- d. 체크 예외는 반드시 `try-catch` 블록에서 처리하거나, 메서드가 해당 예외를 던지도록 선언해야 한다. 
- ~~e. 예외가 발생하면 JVM은 해당 예외에 대응하는 `catch` 블록을 찾아 해당 블록 안의 예외 처리 코드를 무시하고 다음 코드를 실행한다.~~

---

**4. 다음 코드를 실행했을 때 출력되는 결과를 작성하세요.**
```java
public static void main(String[] args) {
    System.out.println(1);
    try {
        System.out.println(0 / 0);
        System.out.println(2);
    } catch (Exception e) {
        System.out.println(3);
    }
    System.out.println(4);
}
```

---

**5. 다음 코드를 실행했을 때 출력되는 결과를 작성하세요.**
```java
public static void main(String[] args) {
    try {
        try {
            System.out.println(1);
            int[] array = new int[3];
            System.out.println(array[3]);
            System.out.println(2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(3);
            throw new Exception(e);
        }
        System.out.println(4);
    } catch (Throwable e) {
        System.out.println(5);
        throw new RuntimeException(e);
    } finally {
        System.out.println(6);
    }
    System.out.println(7);
}
```

---

**6. 다음 코드의 실행 결과를 작성하세요.**
```java
// MyException1.java
public class MyException1 extends Exception {
    
}

// MyException2.java
public class MyException2 extends RuntimeException {
    
}

// Ex06.java
public class Ex06 {

    public static void main(String[] args) throws Exception {
        try {
            System.out.println(0);
            method1();
            System.out.println(1);
            throw new MyException1();
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println(2);
        }
    }

    private static void method1() {
        try {
            System.out.println(3);
            method2();
            System.out.println(4);
        } catch (Exception e) {
            System.out.println(5);
            e.printStackTrace();
            System.out.println(6);
        } finally {
            System.out.println(7);
        }
    }

    private static void method2() {
        System.out.println(8);
        method3();
        System.out.println(9);
    }

    private static void method3() {
        System.out.println(10);
        throw new MyException2();
    }
}
```

---

**7. 다음 중 메서드 오버라이딩이 잘못된 예시를 모두 고르세요.**
```java
void add(int a, int b) throws InvalidNumberException, NotANumberException {
    // 계산 로직 실행
}

class NumberException extends Exception {}
class InvalidNumberException extends NumberException {}
class NotANumberException extends NumberException {}
```

- a. `void add(int a, int b) throws NumberException {}`
- ~~b. `void add(int a, int b) throws InvalidNumberException, NotANumberException {}`~~
- ~~c. `void add(int a, int b) throws NotANumberException {}`~~
- d. `void add(int a, int b) throws Exception {}`
- ~~e. `void add(int a, int b) throws InvalidNumberException {}`~~

---

**8. 다음 코드의 실행 결과를 작성하세요.**
```java
// MyException1.java
public class MyException1 extends RuntimeException {
}

// MyException2.java
public class MyException2 extends MyException1 {
}

public static void main(String[] args) {
    try {
        System.out.println(1);
    } catch (MyException1 ex1) {
        System.out.println(2);
        throw new MyException2();
    } catch (MyException2 ex2) {
        System.out.println(3);
    }
}
```

