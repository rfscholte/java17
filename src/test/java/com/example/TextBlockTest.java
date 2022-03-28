package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TextBlockTest {

    @Test
    public void testTextBlock() {
        String expectedText = "What is Lorem Ipsum?\n" +
                "\n" +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,\n" +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap\n" +
                "into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum\n" +
                "passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

        assertEquals(expectedText, TextBlock.getTextBlock());
    }
}
