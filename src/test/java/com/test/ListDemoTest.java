package com.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListDemoTest {

    @Test
    void should_return_true_when_validate_given_abab() {
        ListDemo demo = ListDemo.builder()
                .setAge(1)
                .setName("abab")
                .build();
        assert demo.validate();
    }
}