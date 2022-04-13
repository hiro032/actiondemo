import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LogicTest {

    @Test
    void test() {
        Logic logic = new Logic();
        assertEquals(logic.returnTrue(), Boolean.FALSE);
    }
}