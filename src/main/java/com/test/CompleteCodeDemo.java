package com.test;

import java.util.Arrays;
import java.util.List;

public class CompleteCodeDemo {

    private String name;
    void variableDemo() {
//        new CompleteCodeDemo();
//        String str = "str";
        CompleteCodeDemo completeCodeDemo = new CompleteCodeDemo();
//        CompleteCodeDemo completeCodeDemo = new CompleteCodeDemo();
    }

    Integer returnDemo() {
        int int1 = 1;

        return int1;
//        int1.return
    }

    void notNullDemo() {
        String value = "2L";
//        value.notnull

        boolean exists = false;
//        exists.not
    }


    void forDemo() {
        List<String> strings = Arrays.asList("a", "b", "C");
    }

    void testIf() {
        boolean existsIfDemo = "input".equals(name);

    }

    void formatDemo() {
        String str = "Hello Java!";
//        str.format
    }

    void tryDemo() {
        try {
            formatDemo();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
