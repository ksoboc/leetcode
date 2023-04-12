package SimplifyPath;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SolutionSplitAndStack {
    public String simplifyPath(String path) {
        String[] pathElems = path.split("/");
        Deque<String> deque = new LinkedList<>();

        for (var pathElem : pathElems) {
            if (pathElem.equals("..")) {
                if (!deque.isEmpty()) {
                    deque.pop();
                }
                continue;
            }
            if (pathElem.equals("") || pathElem.equals("."))
                continue;
            deque.push(pathElem);
        }

        StringBuilder sb = new StringBuilder("/");
        while (!deque.isEmpty()) {
            sb.append(deque.pollLast());
            if (!deque.isEmpty())
                sb.append('/');
        }
        return sb.toString();
    }
}
