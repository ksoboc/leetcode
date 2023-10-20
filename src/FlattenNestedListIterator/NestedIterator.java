package FlattenNestedListIterator;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class NestedIterator implements Iterator<Integer> {

    private Stack<NestedInteger> stack;
    private Stack<Integer> posStack;
    private Integer curVal;


    public NestedIterator(List<NestedInteger> nestedList) {
        stack=new Stack<>();
        posStack=new Stack<>();
        for (int i = nestedList.size()-1; i >=0 ; --i) {
            if (nestedList.get(i).isInteger()) {
                stack.push(nestedList.get(i));
            } else {
                stack.push(nestedList.get(i));
                posStack.push(0);
            }
        }
        moveToNext();
    }

    private void moveToNext() {

        NestedInteger curElem;
        while (!stack.empty()) {
            curElem = stack.pop();
            if (curElem.isInteger()) {
                curVal = curElem.getInteger();
                break;
            } else {
                var pos = posStack.pop();
                var curList = curElem.getList();
                NestedInteger nextElem;
                if (pos<curList.size()) {
                    nextElem=curList.get(pos);
                    pos++;
                    if (pos<curList.size()) {
                        stack.push(curElem);
                        posStack.push(pos);
                    }
                    stack.push(nextElem);
                    if (!nextElem.isInteger())
                        posStack.push(0);
                }
            }
        }
    }

    @Override
    public Integer next() {
        Integer val= curVal;
        curVal=null;
        moveToNext();
        return val;
    }

    @Override
    public boolean hasNext() {
        return curVal!=null;
    }
}

interface NestedInteger {

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return empty list if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}

