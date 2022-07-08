package testPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforeSuite_Demo2");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest_Demo2");
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass_Demo2");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod_Demo2");
	}
	
	@Test // disabled   // isEnabled=false
	public void test1()
	{
		System.out.println("test1_Demo2");
	}
	
	@Test 
	public void test2() throws InterruptedException
	{
		System.out.println("test2_Demo2");
	}     
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod_Demo2");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass_Demo2");
	}
	
	@AfterTest
	
	public void afterTest()
	{
		System.out.println("afterTest_Demo2");
	}
	
	@AfterSuite
	
	public void afterSuite()
	{
		System.out.println("afterSuite_Demo2");
	}
}
