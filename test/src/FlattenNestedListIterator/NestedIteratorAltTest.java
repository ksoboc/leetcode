package FlattenNestedListIterator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NestedIteratorAltTest {
    @Test
    void test1() {
        NestedInteger nestedInteger1=new NestedIntegerImpl(1);
        NestedInteger nestedInteger2=new NestedIntegerImpl(2);
        NestedInteger nestedInteger11 = new NestedIntegerImpl(List.of(nestedInteger1,nestedInteger1));

        NestedIteratorAlt iterator=new NestedIteratorAlt(
                List.of(nestedInteger11,
                        nestedInteger2,
                        nestedInteger11));

        List<Integer> list=new ArrayList<>();
        while (iterator.hasNext()) {
            var val=iterator.next();
            list.add(val);
        }
        assertEquals(List.of(1, 1, 2, 1, 1), list);
    }
    @Test
    void test2() {
        NestedInteger nestedInteger1=new NestedIntegerImpl(1);
        NestedInteger nestedInteger4=new NestedIntegerImpl(4);
        NestedInteger nestedInteger6=new NestedIntegerImpl(6);

        NestedInteger nestedIntegerl6 = new NestedIntegerImpl(List.of(nestedInteger6));
        NestedInteger nestedIntegerl46 = new NestedIntegerImpl(List.of(nestedInteger4,nestedIntegerl6));



        NestedIteratorAlt iterator=new NestedIteratorAlt(
                List.of(nestedInteger1,
                        nestedIntegerl46
                        ));

        List<Integer> list=new ArrayList<>();
        while (iterator.hasNext()) {
            var val=iterator.next();
            list.add(val);
        }
        assertEquals(List.of(1, 4, 6), list);
    }

}