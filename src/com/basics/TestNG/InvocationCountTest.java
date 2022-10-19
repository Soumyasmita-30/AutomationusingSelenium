package com.basics.TestNG;

import org.testng.annotations.Test;

public class InvocationCountTest {
    @Test(invocationCount = 10)
    public void mySum(){
        int a = 10;
        int b = 20;
        int result = a+b;
        System.out.println("the sum is :" +result);
    }
}
