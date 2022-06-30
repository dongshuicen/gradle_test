package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListDemo {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    private ListDemo(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public boolean validate() {
        String regexp = "[a-z]{4}";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(this.name);
        return matcher.matches();
    }

    public boolean testFor() {
        List<String> strings = Arrays.asList("a", "b", "C");

        return !strings.isEmpty();
    }

    void varTest() {
        long index = 1L;
    }

    void testIf() {
        if ("not".equals(this.name)) {

        }
    }

    public static Builder builder() {
        return new Builder();
    }
    public static class Builder {
        private String name;
        private Integer age;

        private Builder() {

        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public ListDemo build() {
            return new ListDemo(this);
        }
    }
    
}
