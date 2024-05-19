package oop2;

class Product {
    int price, bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv1 extends Product {

    Tv1() {
        super(100);
    }

    @Override
    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product product) {
        if (money < product.price) {
            System.out.println("잔액 부족");
            return;
        }

        money -= product.price;
        bonusPoint += product.bonusPoint;
        System.out.println(product+"을/를 구입");
    }
}

public class ParameterPoly {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        buyer.buy(new Tv1());
        buyer.buy(new Computer());

        System.out.println("남은 돈 " + buyer.money + "만원");
        System.out.println("보너스 점수 "+ buyer.bonusPoint+"점");
    }
}
