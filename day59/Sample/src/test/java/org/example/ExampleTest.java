package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest {

    @DisplayName("Test Example.get()")
    @Test
    void testGet() {
        assertEquals("Hello JUnit 5", Example.get());
    }
}
