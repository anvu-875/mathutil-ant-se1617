/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wm.mahtutil.core;

/**
 *
 * @author hoang
 */
public class MathUtility {

    public static final double PI = 3.1415;

    //21! vượt kiểu long = 18 con số 0
    //ta thí nghiệm hàm n! với n = 0, 1, 2 ... 20 ->
    //n! = 1 x 2 x 3 x 4 x 5 x ... x n
    // không có giai thừa 0 
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            String str = "Invalid n. n must be between 0..20!";
            throw new IllegalArgumentException(str);
        }
        if (n == 0 || n == 1) return 1;
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
