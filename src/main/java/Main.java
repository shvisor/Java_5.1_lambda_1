import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        // TODO: в переменную b кладем результат вычитания 1 из 1, что равно 0. На ноль делить нельзя, поэтому возникает ошибка.

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        if (b == 0) {
            throw new ArithmeticException("На ноль делить нельзя");
        } else {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        }
    }
}
