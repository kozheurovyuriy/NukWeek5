package task13;

import java.util.*;
/*
13. Не используя вспомогательных объектов
, переставить отрицательные эле
менты данного
списка в ко
нец, а положительные
—
в начало списка.
 */
public class NegativePositiveDigitsSorter {

    public List<Integer> orderNegativePositiveDigits(List<Integer> list) {

        Deque<Integer> result = new LinkedList<>();

        for(Integer i: list){
            if(i > 0)
                result.addLast(i);
            else
                result.addFirst(i);
        }

        return new ArrayList<>(result);
    }
}

