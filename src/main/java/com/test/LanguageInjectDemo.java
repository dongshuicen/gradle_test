package com.test;

public class LanguageInjectDemo {

    void jsonInject() {
        String json = "{\"name\":\"张三\"}";
    }

    void sqlInject() {
        String sql = "select 1 from dual";
    }

    void regexpInject() {
        String regexp = "[a-z]{4}";
    }
}
