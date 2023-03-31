package DesignBrowserHistory;

import java.util.Stack;

public class BrowserHistory {
    private Stack<String> past;
    private Stack<String> future;
    private String current;

    public BrowserHistory(String homepage) {
        current = homepage;
        past = new Stack<>();
        future = new Stack<>();
    }

    public void visit(String url) {
        past.push(current);
        current = url;
        future.clear();
    }

    public String back(int steps) {
        while (steps-- > 0 && !past.empty()) {
            future.push(current);
            current = past.pop();
        }
        return current;
    }

    public String forward(int steps) {
        while (steps-- > 0 && !future.empty()) {
            past.push(current);
            current = future.pop();
        }
        return current;
    }
}
