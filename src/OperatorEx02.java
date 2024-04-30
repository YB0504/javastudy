public class OperatorEx02 {
    public static void main(String[] args) {
        int num = 456;
        System.out.println(num / 100 * 100);

        int numOfApples = 123;
        int sizeOfBucket = 10;
        int numOfBucket = numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket > 0 ? 1 : 0);

        System.out.println(numOfBucket);
    }
}
