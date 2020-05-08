package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {

        String version = System.getProperty("java.version");
        return Double.parseDouble(version);
    }

    public static void main(String[] args) {
        getVersion();
        // you can test the output of getVersion() here
    }
}
