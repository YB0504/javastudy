package oop2;

public interface Colorable {
    void printColor(String color);
}

class Box implements Colorable {
    public void printColor(String color) {
        System.out.println("yellow");
    }
}
