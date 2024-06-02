package Exercise;

import java.util.HashSet;

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SutdaCard) {
            SutdaCard sutdaCard = (SutdaCard) obj;
            return num == sutdaCard.num && isKwang == sutdaCard.isKwang;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return num + (isKwang ? "K" : "");
    }

    @Override
    public int hashCode() {
        // 인스턴스 변수들의 값을 결합한 문자열을 만들고
        // 문자열에 대해 hashCode() 를 호출하는 방법
        return toString().hashCode();
    }
}

public class ExerciseCollection03 {
    public static void main(String[] args) {
        // hashCode()를 오버라이딩하여 HashSet에 중복된 값이 들어가지 않도록 하라
        SutdaCard sutdaCard1 = new SutdaCard(3, true);
        SutdaCard sutdaCard2 = new SutdaCard(3, true);
        SutdaCard sutdaCard3 = new SutdaCard(1, true);

        HashSet set = new HashSet();
        set.add(sutdaCard1);
        set.add(sutdaCard2);
        set.add(sutdaCard3);

        System.out.println(set);
    }
}
