package CollectionFramework;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx01 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("id, pass 입력");
            System.out.print("id : ");
            String id = sc.nextLine().trim();

            System.out.print("pass : ");
            String pass = sc.nextLine().trim();
            System.out.println();

            if (!map.containsKey(id)) {
                System.out.println("입력하신 id가 없음");
                continue;
            }
            if (!(map.get(id)).equals(pass)) {
                System.out.println("비번 일치 X");
            } else {
                System.out.println("id 비번 일치");
                break;
            }
        }
    }
}
