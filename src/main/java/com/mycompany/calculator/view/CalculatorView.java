package com.mycompany.calculator.view;

import com.mycompany.calculator.service.CalculatorService;
import com.mycompany.calculator.service.impl.CalculatorServiceImpl;

public class CalculatorView {

    private CalculatorService calculatorService;

    public static void main(String[] args) {
       CalculatorView calculatorView = new CalculatorView();
       calculatorView.setCalculatorService(new CalculatorServiceImpl());
       calculatorView.calculate(args);
    }

    public void calculate(String[] args) {
        try {
            String inputStr = tryToGetArgument(args);
            String result = calculatorService.calculate(inputStr);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private String tryToGetArgument(String[] args) {
        try {
            return args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Should be at least one argument");
        }
    }

    protected void setCalculatorService(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
}
