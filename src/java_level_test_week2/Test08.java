package java_level_test_week2;

public class Test08 {
    public static void main(String[] args) {
        int rows = 5;

        // for문은 무조건 조건식이 참이면 아래로 내려가서 실행한 후에
        // 증감식을 수행한다.
        for (int i = rows; i >= 1; --i) {
            for (int j = i; j >= 1; --j) {
                System.out.print("*");
            }
            System.out.println();
        }
//*****
//****
//***
//**
//*

    }
}
