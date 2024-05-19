package oop2;

class Tv {
    boolean power;
    int channel;

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

class SmartTv extends Tv {
    boolean caption;

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}

public class InheritanceEx {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.channel = 10;                   // 부모 클래스로 부터 상속받은 멤버(변수)
        smartTv.channelUp();                    // 부모 클래스로 부터 상속받은 멤버(메소드)
        System.out.println(smartTv.channel);

        smartTv.displayCaption("Hello");
        smartTv.caption = true;
        smartTv.displayCaption("Hello!");
    }
}
