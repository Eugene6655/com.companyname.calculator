package com.mycompany.calculator.service.impl;

import com.mycompany.calculator.service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceImplTest {

    private CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void testCalculationSuccessIfHaveSignOperationAndBothNegativeOperands() {
        String input = "-5*-3";
        String result = calculatorService.calculate(input);
        assertNotNull(result);
        assertEquals("15", result);
    }

    @Test
    public void testCalculationShouldSuccessIfPositiveOperands() {
        String input = "5*3";
        String result = calculatorService.calculate(input);
        assertEquals("15", result);
    }

}
