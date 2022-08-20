package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EuclideanTest {

    private final Euclidean euclidean = new Euclidean();

    @Test
    void GCD() {
        assertEquals(5, euclidean.GCD(45, 10));
    }
}