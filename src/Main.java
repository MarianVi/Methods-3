import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO


        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        double thirdNumber = scanner.nextDouble();
        double forthNumber = scanner.nextDouble();
        System.out.println(multiply3(firstNumber, secondNumber, thirdNumber));
        System.out.println(multiply4(firstNumber, secondNumber, thirdNumber, forthNumber));

    }

    public static double multiply2(double operand1, double operand2) {
        return operand1 * operand2;
    }

    public static double multiply3(double operand1, double operand2, double operand3) {
        return multiply2(multiply2(operand1, operand2), operand3);
    }

    public static double multiply4(double operand1, double operand2, double operand3, double operand4) {
        return multiply2(multiply3(operand1, operand2, operand3), operand4);
    }
}