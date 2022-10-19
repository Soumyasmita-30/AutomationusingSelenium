package com.basics.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWithPriority {
    @Test(priority = -1,description = "loggin ")
    public void signUp(){
        System.out.println("signing up n creating an account");
    }@Test(priority = 2,description = "Booking")
    public void login(){
        System.out.println("logging into account");
    }@Test(priority = 3,description = "checkout")
    public void bookTicket(){
        System.out.println("Book a flight ticket");
    }@Test(priority = 4,description = "checkout")
    public void checkOut(){
        System.out.println("make payment and checkOut");
    }
    @Test(priority = 5)
    public void failedTest(){
        Assert.assertEquals(1,1);
    }


}
