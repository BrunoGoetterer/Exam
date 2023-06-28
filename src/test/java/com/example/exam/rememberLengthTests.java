package com.example.exam;

import com.example.exam.rememberLength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class rememberLengthTests {

    @InjectMocks
    private com.example.exam.rememberLength rememberLength;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testModifyString() {
        String modifiedString = rememberLength.modifyString("hello");
        assertEquals("hElLo", modifiedString);
        assertEquals("hElLo", rememberLength.getLastModifiedWord());
        assertEquals(5, rememberLength.getLastModifiedWordLength());
    }

    @Test
    public void testGetLastModifiedWordLength() {
        int length = rememberLength.getLastModifiedWordLength();
        assertEquals(0, length);
    }
}
