/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.lambda;

/**
 *
 * @author GAME
 */
public class lambdaExpression {

    private static lambdaExpression lambda = new lambdaExpression();

    public static void main(String[] args) {
        
        //with type declaration - có khai báo kiểu
        MathOperation addition = (int a, int b) -> a + b;

        //with out type declaration - không cần khai báo kiểu
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces - với câu lệnh return cùng với dấu ngoặc nhọn
        MathOperation multiplication = (int a, int b) -> {return a * b;};

        //without return statement and without curlyu braces -  không có câu lệnh return và không có dấu ngoặc nhọn
        MathOperation division = (a, b) -> a / b;
        
        System.out.println("10 + 5 = " + lambda.operate(10, 5, addition));
        System.out.println("10 - 5 = " + lambda.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + lambda.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + lambda.operate(10, 5, division));

        //without parenthesis - không có dấu ngoặc dơn
        GreetingService firstGreetingService = message -> System.out.println("Hello, " + message);
        
        //with parenthesis - có dấu ngoặc đơn
        GreetingService secondGreetingService = (message) -> System.out.println("Hello, " + message);
        
        firstGreetingService.getMessage("Mr. A");
        secondGreetingService.getMessage("Mr. B");
        
    }

    interface MathOperation {

        int operation(int a, int b);
    }

    interface GreetingService {

        void getMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
