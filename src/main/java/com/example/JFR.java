package com.example;

import jdk.jfr.Configuration;
import jdk.jfr.consumer.RecordingStream;

import java.time.Duration;

public class JFR {

    public static void main(String... args) throws Exception {
        Configuration c = Configuration.getConfiguration("default");
        try (var rs = new RecordingStream(c)) {
            rs.enable("jdk.CPULoad").withPeriod(Duration.ofSeconds(1));
            rs.enable("jdk.JavaMonitorEnter").withThreshold(Duration.ofMillis(10));
            rs.onEvent("jdk.GarbageCollection", System.out::println);
            rs.onEvent("jdk.CPULoad", System.out::println);
            rs.onEvent("jdk.JVMInformation", System.out::println);
            rs.start();
        }
    }
}
