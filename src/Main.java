import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int firstNumber = new Scanner(System.in).nextInt();

        System.out.println("Введите второе число:");
        int secondNumber = new Scanner(System.in).nextInt();

        int resultSum = firstNumber + secondNumber;
        System.out.println("Сумма первого и второго чисел: "+resultSum);

        int resultSubstract = firstNumber - secondNumber;
        System.out.println("Результат вычитания второго числа из первого: "+resultSubstract);

        int resultMultiply = firstNumber * secondNumber;
        System.out.println("Произведение первого и второго чиселы: "+resultMultiply);

        double resultQuotient = (double) firstNumber / secondNumber;
        System.out.println("Результат деления первого числа на второе: "+resultQuotient);

    }
}
