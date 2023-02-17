/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.wm.mathutil.test.core;

import com.wm.mahtutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author hoang
 */
public class MathUtilityTest {
    
    //Hàm getF còn được thiết kế rằng: nếu đưa n cà chớn
    //tham số ko đúng chuẩn, n <0 | n >20 thì
    //HÀM SẼ NÉM RA NGOẠI LỆ
    //TỨC LÀ NẾU ĐƯA N > 0, VÍ DỤ -5 THÌ SẼ NHẬN VÈ EXPECTED LÀ EXCEPTION
    //TA SẼ DÙNG JUNIT ĐỂ XEM HÀM CÓ NÉM RA NGOẢI LỆ NHƯ THIẾT KẾ HAY KHÔNG
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowException() {
        //nguyên tắc kiểm thử: so sánh giữa expected và actual value 
        //Test case #4: test getF with n< 0
        //Expected : an Exception is throw. In this case Illegal Argument Exception is throw
        //JUNIT4 ko ko có hàm assert() Exception
        //JUNIT5 có assert()
        int n = -5;
        MathUtility.getFactorial(n);
        //nếu chỉ viết lệnh này đứng 1 mình thì có ý nghĩa là ta chưa biết được liệu rằng có ngoại lệ nhu kỳ vọng hay ko
        //xanh đỏ trong trường hợp này ko phản ánh đúng ý nghĩa
    }
    
    @Test   //Biến hàm dưới này thành public static void main()
    //hình thức của framework, dàn khung viết code
    //viết code phải theo dịnh dạng yêu cầu trước
    public void testRedGreenSignal() { 
        Assert.assertEquals(6789, 6789);
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnWell() {
        //Test case #1: test getF with n = 0;
        //exxpected: 1
        //test hàm getF() với n = 0, hy vọng trả 1, tức là 0! = 1
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        Assert.assertEquals(expected, actual);
        
        //Test case #2: test getF with n = 1;
        //exxpected: 1
        //test hàm getF() với n = 1, hy vọng trả 1, tức là 1! = 1
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        Assert.assertEquals(expected, actual);
        
        //Test case #3: test getF with n = 6;
        //exxpected: 720, hy vọng 6! = 720
        n = 6;
        expected = 720;
        actual = MathUtility.getFactorial(n);
        Assert.assertEquals(expected, actual);
    }
    
    //Viết kiểu AssertEquals(expected, actual)
    //Lặp đi lặp lại
}
