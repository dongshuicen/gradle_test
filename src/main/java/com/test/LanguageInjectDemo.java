package com.test;

public class LanguageInjectDemo {

    void jsonInject() {
        String json = "{\n" +
                "  \"name\": \"张三\",\n" +
                "\"age\": 12\n" +
                "}";
    }

    void sqlInject() {
        //language=SQL
        String sql = "select 1 from dual  where 1=1";
    }

    void regexpInject() {
        //language=RegExp
        String regexp = "[a-z]{4}";
    }
}
