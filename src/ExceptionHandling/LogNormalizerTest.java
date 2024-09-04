package ExceptionHandling;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogNormalizerTest {
    public static void main(String[] args) {
        String logText = "2024-09-01 12:34:56 ERROR [main] com.example.MyClass - An error occurred";

        try {
            // 예외 발생
            int exceptionEx = 1 / 0;
        } catch (Exception e) {
            // 로그 정규화를 위한 정규 표현식 패턴 정의
            String logPattern = "(\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2})\\s+(\\w+)\\s+\\[(\\w+)\\]\\s+(\\S+)\\s+-\\s+(.*)";

            Pattern pattern = Pattern.compile(logPattern);
            Matcher matcher = pattern.matcher(logText);

            if (matcher.matches()) {
                String timestamp = matcher.group(1);
                String logLevel = matcher.group(2);
                String threadName = matcher.group(3);
                String className = matcher.group(4);
                String message = matcher.group(5);

                // 예외가 발생한 StackTrace 첫번째 요소 가져오기
                StackTraceElement[] stackTrace = e.getStackTrace();
                StackTraceElement firstElement = stackTrace[0];

                String exceptionClassName = firstElement.getClassName();
                String fileName = firstElement.getFileName();
                int lineNumber = firstElement.getLineNumber();

                // 로그 정규화 출력
                String normalizedLine = String.format(
                        "Timestamp: %s, Level: %s, Thread: %s, Class: %s, Message: %s, Exception: %s.%s(%s:%d)",
                        timestamp, logLevel, threadName, className, message,
                        exceptionClassName, firstElement.getMethodName(), fileName, lineNumber
                );

                System.out.println(normalizedLine);
            } else {
                System.out.println("로그 정규화 매칭 실패");
            }
        }
    }
}
