public class OperatorEx01 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A';

        System.out.println(y >= 5 || x < 0 && x > 2);
        System.out.println(y += 10 - x++);
        System.out.println(x += 2);
        System.out.println(!('A' <= c && c <= 'Z'));
        System.out.println('C' -c);
        System.out.println('5' - '0');
        System.out.println(c + 1);
        System.out.println(++c);    // 'A'의 아스키코드 65를 전위연산 하여 66으로 1더하고 아스키코드와 대조하여 B출력
        System.out.println(c++);    // 'B'의 아스키코드 66을 후위연산하기 떄문에 66인 B를 출력하고 67로 1을 더한다.
        System.out.println(c);      // 'C' 위에서 더해진 67의 아스키코드값인 C를 출력
    }
}
