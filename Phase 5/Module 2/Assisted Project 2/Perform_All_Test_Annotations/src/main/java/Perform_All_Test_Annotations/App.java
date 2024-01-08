package Perform_All_Test_Annotations;

import org.testng.annotations.*;

public class App {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite - Setup configurations and resources");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test - Initialize test-specific settings");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class - Initialize class-level resources");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method - Setup preconditions for each test method");
    }

    @Test
    public void testMethod1() {
        System.out.println("Test Method 1 - Actual test logic goes here");
    }

    @Test
    public void testMethod2() {
        System.out.println("Test Method 2 - Actual test logic goes here");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method - Clean up after each test method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class - Clean up class-level resources");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test - Finalize test-specific settings");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite - Perform final cleanup and generate reports");
    }
}
