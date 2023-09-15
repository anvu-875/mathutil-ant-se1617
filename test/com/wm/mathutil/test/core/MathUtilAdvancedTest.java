/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.wm.mathutil.test.core;

import com.wm.mahtutil.core.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author hoang
 */
@RunWith(value = Parameterized.class)
//báo với Junit và JVM rằng, class này sẽ tách data ra khỏi câu lệnh AssertEqual()
//về logic, khi run class này, Junit sẽ tử sinh ra cod ede963 thêm đẻ fill data trong assertEqual của mình
//mình bị phảI viết code theo cách JUNIT yêu cầu thì mới sửa được bad smell
//dùng code theo cách thức bị ép tuân thủ theo 1 logic nào đó => framework
public class MathUtilAdvancedTest {
    @Parameterized.Parameters
    public static Object[][] initData() {
//        int a[] = {5, 10, 15, 20};
        return new Object[][] {{0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}};
    }
    
    @Parameterized.Parameter(value = 0)
    public int n;
    
    @Parameterized.Parameter(value = 1)
    public long expected;
    
    @Test
    public void testFactorialGivenRightArgumentRunWell() {
        
        assertEquals(expected, MathUtility.getFactorial(n));
    }
    
}
