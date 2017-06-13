/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpreda.fibo;

import java.sql.Timestamp;

/**
 *
 * @author lpreda
 */
public class FiboStart {
    
    private static final int init_value = 60;

    public int getInit_value() {
        return init_value;
    }

    public FiboStart() {
    }

    public static void main(String[] args) {
        //FiboStart fStart = new FiboStart();
        System.out.println("Init value : " + FiboStart.init_value);
        System.out.println(new Timestamp(System.currentTimeMillis()).toInstant());
        System.out.println(FiboStart.fibonacciLoop(init_value));
        System.out.println(new Timestamp(System.currentTimeMillis()).toInstant());
        System.out.println(FiboStart.fibonacciRec(init_value));
        System.out.println(new Timestamp(System.currentTimeMillis()).toInstant());
    }

    //Recursive    
    private static long fibonacciRec(long number) {
        if ((number == 0) || (number == 1)) {
            return number;
        } else {
            return fibonacciRec(number - 1) + fibonacciRec(number - 2);
        }
    }

    private static int fibonacciLoop(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        for (int i = 3; i <= number; i++) {
            fibonacci = fibo1 + fibo2; // Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return fibonacci; // Fibonacci number
    }

}
