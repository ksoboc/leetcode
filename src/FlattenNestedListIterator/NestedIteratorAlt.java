package FlattenNestedListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class NestedIteratorAlt implements Iterator<Integer> {

    private List<Integer> flattenList;
    int pos;


    public NestedIteratorAlt(List<NestedInteger> nestedList) {
        flattenList = new ArrayList<>();
        for (var elem : nestedList) {
            flatten(elem);
        }
    }

    private void flatten(NestedInteger elem) {
        if (elem == null)
            return;
        if (elem.isInteger()) {
            flattenList.add(elem.getInteger());
        } else {
            for (var el : elem.getList()) {
                flatten(el);
            }
        }
    }


    @Override
    public Integer next() {
        if (pos >= flattenList.size())
            return null;
        return flattenList.get(pos++);
    }

    @Override
    public boolean hasNext() {
        return pos < flattenList.size();
    }
}

