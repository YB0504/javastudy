package ExceptionHandling;

import java.io.File;

public class ThrowsExceptionMethod {
    public static void main(String[] args) {
        try {
            File file = createFile(args[0]);
            System.out.println(file.getName() + "파일 생성");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "재 입력");
        }
    }

    static File createFile(String fileName) throws Exception {
        if (fileName == null || fileName.equals("")) {
            throw new Exception("이름이 유효하지 않습니다");
        }
        File file = new File(fileName);

        // File객체의 createFile메소드를 이용해서 실제 파일을 생성한다.
        file.createNewFile();
        return file;    // 생성된 객체의 참조를 반환한다.
    }
}
