package org.example;

import org.example.bisextile.Bisextile;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BisextileTest {
    @Test
    void testAnneeBissextile() {
        assertTrue(Bisextile.estBissextile(2000));
        assertTrue(Bisextile.estBissextile(2024));
        assertFalse(Bisextile.estBissextile(1900));
        assertFalse(Bisextile.estBissextile(2023));
    }
}