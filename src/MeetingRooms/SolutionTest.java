package MeetingRooms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("params")
    void test(List<Interval> intervals, boolean expected) {
        assertEquals(expected, solution.canAttendMeetings(intervals));
    }

    private static Stream<Arguments> params() {
        return Stream.of(Arguments.of(new ArrayList<>(List.of(new Interval(0, 30), new Interval(5, 10), new Interval(15, 20))), false),
                Arguments.of(new ArrayList<>(List.of(new Interval(5, 8), new Interval(9, 15))), true)
        );
    }


}