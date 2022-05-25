package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogTest {

    @DisplayName("Test Dog.bark()")
    @Test
    void testBark() {
        assertEquals("Woof Woof", Dog.bark());
    }
}
