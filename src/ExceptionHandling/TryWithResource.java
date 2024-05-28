package ExceptionHandling;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        // 파일을 열고 자원을 사용하면 자동으로 close()가 호출되면서 자원이 해제 된다.
        try (FileWriter fileWriter = new FileWriter("data.txt")) {
            fileWriter.write("Hello World");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
