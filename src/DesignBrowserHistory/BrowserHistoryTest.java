package DesignBrowserHistory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrowserHistoryTest {
    @Test
    void test1() {
        BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
        browserHistory.visit("google.com");       // You are in "leetcode.com". Visit "google.com"
        browserHistory.visit("facebook.com");     // You are in "google.com". Visit "facebook.com"
        browserHistory.visit("youtube.com");      // You are in "facebook.com". Visit "youtube.com"
        var res = browserHistory.back(1);                   // You are in "youtube.com", move back to "facebook.com" return "facebook.com"
        assertEquals(res, "facebook.com");
        res = browserHistory.back(1);                   // You are in "facebook.com", move back to "google.com" return "google.com"
        assertEquals(res, "google.com");
        res = browserHistory.forward(1);                // You are in "google.com", move forward to "facebook.com" return "facebook.com"
        assertEquals(res, "facebook.com");
        browserHistory.visit("linkedin.com");     // You are in "facebook.com". Visit "linkedin.com"
        res = browserHistory.forward(2);                // You are in "linkedin.com", you cannot move forward any steps.
        assertEquals(res,"linkedin.com");
        res = browserHistory.back(2);                   // You are in "linkedin.com", move back two steps to "facebook.com" then to "google.com". return "google.com"
        assertEquals(res, "google.com");
        res = browserHistory.back(7);                   // You are in "google.com", you can move back only one step to "leetcode.com". return "leetcode.com"
        assertEquals(res, "leetcode.com");
    }

}