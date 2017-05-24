package task7;

import java.util.Stack;
/*
7. Задать два стека, поменять информацию местами.
 */
public class TwoStackPlaceChanger {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public TwoStackPlaceChanger(Stack<Integer> first, Stack<Integer> second){
        this.first = first;
        this.second = second;
    }

    public void changeInfoByPlace(){

        Stack<Integer> tempFirst = new Stack<>();
        Stack<Integer> tempSecond = new Stack<>();

        while (!first.empty())
           tempFirst.push(first.pop());
        while (!second.empty())
            tempSecond.push(second.pop());

        first = tempSecond;
        second = tempFirst;
    }

    public Stack<Integer> getFirst() {
        return first;
    }

    public Stack<Integer> getSecond() {
        return second;
    }

    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        stack2.push(4);
        stack2.push(5);
        stack2.push(6);

        TwoStackPlaceChanger changer = new TwoStackPlaceChanger(stack1, stack2);
        changer.changeInfoByPlace();

        System.out.println(changer.getFirst());
        System.out.println(changer.getSecond());
    }
}
