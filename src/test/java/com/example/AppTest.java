package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    App app = new App();
    
    @Test
    public void testAdd() {
        assertEquals(5, app.add(2, 3));
    }
    
    @Test
    public void testGreet() {
        assertEquals("Hello John!", app.greet("John"));
    }
}