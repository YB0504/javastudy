package oop2;

class Product2 {
    int price, bonusPoint;

    Product2(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    Product2() {

    }
}

class Tv2 extends Product2 {
    Tv2() {
        super(100);
    }

    @Override
    public String toString() {
        return "Tv";
    }
}

class Computer2 extends Product2 {
    Computer2() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}

class Audio2 extends Product2 {
    Audio2() {
        super(50);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}

class Buyer2 {
    int money = 1000;
    int bonusPoint = 0;
    Product2[] cart = new Product2[10];
    int i = 0;

    void buy(Product2 product2) {
        if (money < product2.price) {
            System.out.println("잔액 부족");
            return;
        }
        money -= product2.price;
        bonusPoint += product2.bonusPoint;
        cart[i++] = product2;
        System.out.println(product2+ "을/를 구입");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                break;
            }
            sum += cart[i].price;
            itemList += cart[i] + ", ";
        }
        System.out.println("총금액 : " + sum + "만원");
        System.out.println("구입 품목 : " + itemList);
    }
}

public class ParameterPolyEx {
    public static void main(String[] args) {
        Buyer2 buyer2 = new Buyer2();

        buyer2.buy(new Tv2());
        buyer2.buy(new Computer2());
        buyer2.buy(new Audio2());
        buyer2.summary();
    }
}
