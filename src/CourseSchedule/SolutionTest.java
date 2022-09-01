package CourseSchedule;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution;
    @BeforeEach
    void prepare() {
        solution = new Solution();
    }
    @Test
    void test() {
        var numCourses = 2;
        var prerequisites = new int[][]{{1,0}};

        System.out.println("solution.canFinish(numCourses,prerequisites) = " + solution.canFinish(numCourses, prerequisites));
    }

    @Test
    void test2() {
        var numCourses = 2;
        var prerequisites = new int[][]{{1,0},{0,1}};
        System.out.println("solution.canFinish(numCourses, prerequisites) = " + solution.canFinish(numCourses, prerequisites));
    }

}