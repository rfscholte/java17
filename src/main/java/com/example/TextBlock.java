package com.example;

public class TextBlock {
    public static String getTextBlock() {
        return """
                What is Lorem Ipsum?
                
                Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
                when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap 
                into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum 
                passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.""";
    }
    
    public static String getMinimalPomXml() {
        return """
            <?xml version="1.0" encoding="UTF-8"?>

            <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
              xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
              <modelVersion>4.0.0</modelVersion>
            
              <groupId>com.example</groupId>
              <artifactId>java17</artifactId>
              <version>1.0-SNAPSHOT</version>
            </project>""";
    }
    
    public static String getActuatorBeansJSon() {
        return """
            {
              "contexts" : {
                "application" : {
                  "beans" : {
                    "org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletRegistrationConfiguration" : {
                      "aliases" : [ ],
                      "scope" : "singleton",
                      "type" : "org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletRegistrationConfiguration",
                      "dependencies" : [ ]
                    },
                    "org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration" : {
                      "aliases" : [ ],
                      "scope" : "singleton",
                      "type" : "org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration",
                      "dependencies" : [ ]
                    },
                    "org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration" : {
                      "aliases" : [ ],
                      "scope" : "singleton",
                      "type" : "org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration",
                      "dependencies" : [ ]
                    }
                  }
                }
              }
            }""";
    }
    
}
