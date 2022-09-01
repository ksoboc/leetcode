package TimeBasedKeyValueStore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeMapTest {
    private TimeMap timeMap=new TimeMap();

    @Test
    void test() {
        timeMap.set("foo","bar",1);
        assertEquals("bar", timeMap.get("foo", 1));
        assertEquals("bar", timeMap.get("foo", 3));
        timeMap.set("foo","bar2",4);
        assertEquals("bar2", timeMap.get("foo",4));
        assertEquals("bar2", timeMap.get("foo",5));
    }

}