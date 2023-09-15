/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.wm.mathutil.main;

import com.wm.mahtutil.core.MathUtility;

/**
 *
 * @author hoang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testFactorialGivenRightArgumentReturnWell();
        testFactorialGivenWrongArgumentThrowException();
    }
    
    //Kiểm thử các tình huống n đưa vào kiểu cà chớn!!!
    public static void testFactorialGivenWrongArgumentThrowException() {
        //Test case #6: test getF() with n = -1;
        //Expected value: an Illegal Argument Exception is thrown
        //nếu đưa n = -1 thì hàm sẽ đập vào mặt user/người xài
        //1 ngoại lệ
        int n = -1;
        System.out.println("Test -1! | expected: Illegal Argument Exception" + " | actual: ???");
        MathUtility.getFactorial(n);
    }
    
    /*Dân dev phải có trách nhiệm vs những hàm/method mình viết ra,
    tức là đảm bảo rằng hàm chạy đúng như thiết kế
    hàm getFactorial() dc thiết kế rằng:
    nếu đưa n < 0 hoặc n > 20 chửi, ném ra ngoại lệ
    nếu đưa n = 0... 20 -> tính đúng n!
    TA - DÂN DEV SẼ KIỂM THỬ HÀM ĐÚNG NHƯ THIẾT KẾ HAY KO
    KIỂM THỬ - DÙNG THỬ - MÔ PHỎNG CÁC TÌNH HUỐNG - CASE
    HÀM SẼ DC DÙNG TRONG TƯƠNG LAI
    hàm sẽ dc dùng theo 2 cách dựa theo thiết kế
    đưa data tử tế n từ 0...20
    đưa data cà chớn n < 0 hoặc n > 20
    */
    //tên hàm kiểm thử viết theo cú pháp con lac đà - camel Case notation
    //và phải mang ý nghĩa/mục đích kiểm thử
    public static void testFactorialGivenRightArgumentReturnWell() {
        //Case #1: Test getF() with n > 0
        //kiểm thử coi có đúng 0! = 1 hay ko? - 1 tình huống sài hàm
        //1 test case
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n); //gọi là hàm tính giai thừa, em kq trả về
        //so sánh với expected vs actual
        System.out.println("Test" + n + "! | expected: " + expectedValue);
        System.out.println("Test" + n + "! | actual: " + actualValue);
        
        //Case #2: Test getF() with n = 1;
        //Expected Value = 1 luôn.
        //Kiểm tra xem 1! có đúng là 1 hem???
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test" + n + "! | expected: " + expectedValue);
        System.out.println("Test" + n + "! | actual: " + actualValue);
        
        //Case #3: Test getF() with n = 2
        n = 2;
        System.out.println("Test 2! | expected: 2" + " | actual: " + MathUtility.getFactorial(n));
        
        //Case #4: Test getF() with n = 3
        n = 3;
        System.out.println("Test 3! | expected: 6" + " | actual: " + MathUtility.getFactorial(n));
        
        //Case #5: Test getF() with n = 5
        n = 5;
        System.out.println("Test 5! | expected: 120" + " | actual: " + MathUtility.getFactorial(n));
    }

}
