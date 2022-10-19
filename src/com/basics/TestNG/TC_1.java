package com.basics.TestNG;

import org.testng.annotations.*;

public class TC_1 {
    @BeforeClass
    public void beforeClass(){
        System.out.println("i execute before everyclass");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("i execute after everyclass");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("executes before every method...!");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("executes after every method..!");
    }
    @Test
    public void test1(){
        System.out.println("Test 1");
    }@Test
    public void test2(){
        System.out.println("Test 2");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("executes before test");
    }@AfterTest
    public void afterTest(){
        System.out.println("executes after test");
    }
}
