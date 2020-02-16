package com.mycompany.calculator.service.impl;

import com.mycompany.calculator.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {

    public String calculate(String input) {
        char[] chars = input.toCharArray();
        int leftOperand;
        int rightOperand;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '*') {
                leftOperand = Integer.parseInt(input.substring(0, i));
                rightOperand = Integer.parseInt(input.substring(i + 1, i + 2));
                return String.valueOf(leftOperand * rightOperand);
            }
        }
        return "";
    }
}
