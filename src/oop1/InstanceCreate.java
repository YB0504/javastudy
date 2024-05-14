package oop1;

public class InstanceCreate {
    public static void main(String[] args) {
        Tv tv;
        tv = new Tv();
        tv.channel = 7;
        tv.channelDown();
        System.out.println("현재 채널 " + tv.channel);
    }
}

class Tv {
    // Tv의 속성(멤버변수)
    String color;
    boolean power;
    int channel;

    // Tv의 기능(메소드)
    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}
