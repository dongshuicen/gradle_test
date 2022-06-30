package com.test;

public class CalculateSalaryFactory {

    public static CalculateSalary create(String type) {
        if (type.equals("MAN_POWER")) {
            return new ManPowerCalculateSalaryImpl();
        } else if (type.equals("FI")) {
            return new FiCalculateSalaryImpl();
        } else {
            throw new RuntimeException("不支持该分类计算薪资");
        }
    }
}
