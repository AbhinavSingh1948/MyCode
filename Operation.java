class Operations {
    int num1, num2;

    public Operations(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return num1 + num2;
    }

    public int subtract() {
        return num1 - num2;
    }
}

class Multiplication extends Operations {
    public Multiplication(int num1, int num2) {
        super(num1, num2);
    }

    public int multiply() {
        return num1 * num2;
    }
}

public class Operation {
    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication(5, 3);
        System.out.println("Sum: " + multiplication.add());
        System.out.println("Subtraction: " + multiplication.subtract());
        System.out.println("Multiplication: " + multiplication.multiply());
    }
}
