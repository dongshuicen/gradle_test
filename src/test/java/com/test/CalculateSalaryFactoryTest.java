package com.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateSalaryFactoryTest {

    public static void main(String[] args) {

    }
    private CalculateSalary calculateSalary = CalculateSalaryFactory.create("FI");

    @Test
    void create() {
        assertTrue(calculateSalary instanceof FiCalculateSalaryImpl);
    }

    @Test
    void should_return_100_when_calculate_given() {
        // given
        CalculateSalary instance = CalculateSalaryFactory.create("MAN_POWER");

        // when
        Pay result = instance.calculate();

        //then
        assertTrue(result != null);

    }
}