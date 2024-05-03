public class Ex03 {
    public static void main(String[] args) {
        int fahrenheit = 100;

        // 5/9의 결과는 0으로 나오기 때문에 실수 형을 얻기 위해서는 분수,분모 어느 한쪽을
        // 반드시 double이나 float으로 해야만 값을 얻을 수 있다.
//       float celcius = (int) ((5 / 9f * (fahrenheit - 32)) * 100 + 0.5) / 100f;
        float celcius = (5/9f*(fahrenheit-32));

        System.out.println("Fahrenheit : " + fahrenheit);
        System.out.println("Celcius : " + Math.round(celcius*100)/100f);
    }
}
