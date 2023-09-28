import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    void addNewElementToList() {
        Main main = new Main();
        List<Integer> testList = new ArrayList<>(List.of(1, 2, 3));
        int testNumber = 4;

        main.addNewElementToList(testList, testNumber);

        assertEquals(4, testList.get(3));
    }
}
