package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test123 {
    private final static List<String> LIST = Arrays.asList("应用", "PN", "封装", "包装");
    // 111222
    // 第一次 commit
    // 第二次 commit
    // 第三次 commit
    // 1111
    // 2222
    // 4
    // 333
    public static void main(String[] args) {
//        String test = "应用";
//        boolean contains = LIST.contains(test);
//        System.out.println("contains = " + contains);

        Map<Object, Object> map = new HashMap<>();
        map.put("test", null);
        System.out.println("map = " + map);
    }
}