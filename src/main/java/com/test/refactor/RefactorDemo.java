package com.test.refactor;

import java.math.BigDecimal;

public class RefactorDemo {

    Integer calculate(Integer input) {
        return input % 10 + input;
    }

    void call(Integer param) {
        Integer result = calculate(param);

        System.out.println(result);

        BigDecimal finalResult = BigDecimal.valueOf(result).add(BigDecimal.valueOf(50.02)).subtract(BigDecimal.valueOf(121));

        System.out.println(finalResult);

    }

    void renameMe() {
        System.out.println(String.format("rename me %s", "quick"));
    }

    void callRenameMe() {
        renameMe();
    }


}
