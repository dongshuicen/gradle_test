package com.test;

public class ManPowerCalculateSalaryImpl implements CalculateSalary {

    private static String MAN_POWER = "MAN_POWER";

    @Override
    public Pay calculate() {
        System.out.println(MAN_POWER);
        return null;
    }
}
