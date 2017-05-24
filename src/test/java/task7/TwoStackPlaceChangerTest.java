package task7;

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class TwoStackPlaceChangerTest {

    @Test
    public void testChangeInfoByPlace(){
        Stack<Integer> stack1;
        Stack<Integer> stack2;
        TwoStackPlaceChanger changer;
        stack1 = new Stack<>();
        stack2 = new Stack<>();

        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        stack2.push(4);
        stack2.push(5);
        stack2.push(6);

        changer = new TwoStackPlaceChanger(stack1, stack2);
        changer.changeInfoByPlace();
        for(int i = 0; i < stack2.size(); i++)
           assertEquals(stack1.pop(), stack2.pop());
    }
}
