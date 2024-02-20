package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        var testTask = new ArrayList<Integer>();
        testTask.add(9);
        testTask.add(8);
        testTask.add(7);
        testTask.add(6);
        testTask.add(5);
        testTask.add(4);
        testTask.add(3);
        testTask.add(2);
        testTask.add(1);
        testTask.add(0);
        var jar = List.of(9, 8);
        var actual1 = App.take(testTask, 2);
        assertThat(actual1).isEqualTo(jar);

        var actual2 = App.take(testTask, 8);
        var jar2 = List.of(9, 8, 7, 6, 5, 4, 3, 2);
        assertThat(actual2).isEqualTo(jar2);


        var testTask2 = new ArrayList<Integer>();
        var jar3 = new ArrayList<Integer>();
        var actual3 = App.take(testTask2, 9);
        assertThat(actual3).isEqualTo(jar3);

        var actual4 = App.take(testTask, 0);
        assertThat(actual4).isEqualTo(jar3);
        // END
    }
}
