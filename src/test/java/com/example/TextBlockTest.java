package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TextBlockTest {

    @Test
    public void textBlock() {
        String expectedText = "What is Lorem Ipsum?\n" +
                "\n" +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,\n" +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap\n" +
                "into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum\n" +
                "passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

        assertEquals(expectedText, TextBlock.getTextBlock());
    }

    @Test
    public void minimalPomXml() {
        String expectedText = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "\n" +
                "<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                "  xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\">\n" +
                "  <modelVersion>4.0.0</modelVersion>\n" +
                "\n" +
                "  <groupId>com.example</groupId>\n" +
                "  <artifactId>java17</artifactId>\n" +
                "  <version>1.0-SNAPSHOT</version>\n" +
                "</project>";

        assertEquals(expectedText, TextBlock.getMinimalPomXml());
    }

    @Test
    public void actuatorBeansJSon() {
        String expectedText = "{\n" +
                "  \"contexts\" : {\n" +
                "    \"application\" : {\n" +
                "      \"beans\" : {\n" +
                "        \"org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletRegistrationConfiguration\" : {\n" +
                "          \"aliases\" : [ ],\n" +
                "          \"scope\" : \"singleton\",\n" +
                "          \"type\" : \"org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletRegistrationConfiguration\",\n" +
                "          \"dependencies\" : [ ]\n" +
                "        },\n" +
                "        \"org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration\" : {\n" +
                "          \"aliases\" : [ ],\n" +
                "          \"scope\" : \"singleton\",\n" +
                "          \"type\" : \"org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration\",\n" +
                "          \"dependencies\" : [ ]\n" +
                "        },\n" +
                "        \"org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration\" : {\n" +
                "          \"aliases\" : [ ],\n" +
                "          \"scope\" : \"singleton\",\n" +
                "          \"type\" : \"org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration\",\n" +
                "          \"dependencies\" : [ ]\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  }\n" +
                "}";

        assertEquals(expectedText, TextBlock.getActuatorBeansJSon());
    }
}
