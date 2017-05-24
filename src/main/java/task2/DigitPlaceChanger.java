package task2;

import java.util.Stack;

/*
2. Ввести число, занести его цифры в стек. Вывести число, у которого
цифры
идут в обратном
порядке.
 */
public class DigitPlaceChanger {
    public int changePlaceDigit(int number){

        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            stack.push( number % 10 );
            number = number / 10;
        }

        StringBuilder strDigit = new StringBuilder();
        while (!stack.isEmpty()) {
            strDigit.append(String.valueOf(stack.pop()));
        }

        strDigit.reverse();

        return Integer.parseInt(strDigit.toString());

    }
}
