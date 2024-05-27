package Exercise;

class NumberException extends Exception {

}

class InvalidNumberException extends NumberException {

}

class NotANumberException extends NumberException {

}


class ExerciseException05 {
    int a, b;

    public ExerciseException05() {
        this(0, 0);
    }

    public ExerciseException05(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void add(int a, int b) throws InvalidNumberException, NotANumberException {

    }
}

class ChildException extends ExerciseException05 {
    public ChildException() {
    }

    public ChildException(int a, int b) {
        super(a, b);
    }

    void add(int a, int b) throws InvalidNumberException, NotANumberException{

    }
}
