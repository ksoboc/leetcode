package SimplifyPath;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String simplifyPath(String path) {
        int pos = 0;
        List<String> pathElemList = new ArrayList<>();
        while (pos < path.length() && path.charAt(pos) == '/') {
            ++pos;
        }
        while (pos < path.length()) {
            int nextSLash = pos ;
            while (nextSLash < path.length() && path.charAt(nextSLash) != '/')
                ++nextSLash;
            if (nextSLash - pos > 0) {
                String pathElem = path.substring(pos, nextSLash);
                if (pathElem.equals(".")) {
                } else if (pathElem.equals("..")) {
                    if (!pathElemList.isEmpty())
                        pathElemList.remove(pathElemList.size() - 1);
                } else {
                    pathElemList.add(pathElem);
                }
            } else {
                while (nextSLash < path.length() && path.charAt(nextSLash) == '/') {
                    ++nextSLash;
                }

            }
            pos = nextSLash + 1;
            while (pos < path.length() && path.charAt(pos) == '/') {
                ++pos;
            }
        }
        StringBuilder sb=new StringBuilder("/");
        for (int i = 0; i < pathElemList.size(); i++) {
            String elem = pathElemList.get(i);
            sb.append(elem);
            if (i< pathElemList.size()-1)
                sb.append("/");
        }
        return sb.toString();
    }
}
