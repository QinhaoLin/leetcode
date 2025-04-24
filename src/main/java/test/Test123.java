package test;

import java.util.Arrays;
import java.util.List;

public class Test123 {
    private final static List<String> LIST = Arrays.asList("应用", "PN", "封装", "包装");

    public static void main(String[] args) {
        String test = "应用";
        boolean contains = LIST.contains(test);
        System.out.println("contains = " + contains);
    }
}
