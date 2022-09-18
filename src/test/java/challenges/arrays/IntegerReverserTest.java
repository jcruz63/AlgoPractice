package challenges.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerReverserTest {

    @Test
    void reverse() {

        assertEquals(4321, IntegerReverser.reverse(1234));

    }
}