package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class FibTest {

    @Test
    public void testFibSeriesWithRange1() {
        Fib fib = new Fib(1);
        List<Integer> result = fib.getFibSeries();

        assertFalse(result.isEmpty(), "non vide");
        assertEquals(List.of(0), result, "Liste de 0 ");
    }

    @Test
    public void testFibSeriesWithRange6() {
        Fib fib = new Fib(6);
        List<Integer> result = fib.getFibSeries();

        assertTrue(result.contains(3), "Contient le chiffre 3");
        assertEquals(6, result.size(), "Contient 6 éléments"); //
        assertFalse(result.contains(4), "Pas de chiffre 4 ");
        assertEquals(List.of(0, 1, 1, 2, 3, 5), result, "Liste qui contient {0, 1, 1, 2, 3, 5}");


        for (int i = 1; i < result.size(); i++) {
            assertTrue(result.get(i - 1) <= result.get(i), "Le résultat ascendant");
        }
    }
}
