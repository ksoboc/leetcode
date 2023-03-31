package DesignBrowserHistory;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistoryList {
    private List<String> list;
    private int last;
    private int current;

    public BrowserHistoryList(String homepage) {
        current = 0;
        list = new ArrayList<>();
        list.add(homepage);
        last = 0;

    }

    public void visit(String url) {
        ++current;
        if (current >= list.size()) {
            list.add(url);
        } else {
            list.set(current, url);
        }
        last = current;
    }

    public String back(int steps) {
        current = Math.max(current - steps, 0);
        return list.get(current);
    }

    public String forward(int steps) {
        current = Math.min(current + steps, last);
        return list.get(current);
    }
}
