package oop2;

public class AbstractClass {
    public static void main(String[] args) {
        Unit[] group = {new Marine(), new Tank(), new Dropship()};

        for (int i = 0; i < group.length; i++) {
            group[i].move(100, 200);
        }
    }
}

abstract class Unit {
    int x, y;

    abstract void move(int x, int y);
    
    void stop(){
        // 현재 위치에 정지
    }
}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("마린 [x = " + x + ",y = " + y + "]");
    }
    void changeMode(){
        // 공격 변환
    }
}

class Tank extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("탱크 [x = " + x + ",y = " + y + "]");
    }
    void changeMode(){
        // 공격 변환
    }
}

class Dropship extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("수송선 [x = " + x + ",y = " + y + "]");
    }

    void load() {
        // 승선
    }

    void unload(){
        // 하선
    }
}
