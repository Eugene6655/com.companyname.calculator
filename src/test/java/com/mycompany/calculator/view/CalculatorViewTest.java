package com.mycompany.calculator.view;

import com.mycompany.calculator.service.CalculatorService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorViewTest {

    private static CalculatorService calculatorService;
    private static CalculatorView calculatorView;
    private static String inputToTestCalculation;

    @BeforeAll
    public static void init() {
        calculatorService = new CalculatorService() {
            public String calculate(String input) {
                return null;
            }
        };

        calculatorView = new CalculatorView();
        calculatorView.setCalculatorService(calculatorService);
    }

    @Test
    public void testCalculationShouldSuccessIfAtLeastOneArgument() {
        String[] args = new String[]{"asfsagf", "safasf", "asfasf"};
        calculatorView.calculate(args);
    }

    @Test
    public void testCalculationShouldFailIfNoArguments() {
        String[] args = new String[]{};

        Exception e = assertThrows(IllegalArgumentException.class,
                () -> calculatorView.calculate(args));

        assertEquals(IllegalArgumentException.class, e.getClass());
    }
}