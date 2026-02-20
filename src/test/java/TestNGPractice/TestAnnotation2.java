package TestNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAnnotation2 {
	 void BeforeClassMethod()
	 {
		 System.out.println("This is  before class method");	 
	 }

	@BeforeMethod
	void setup()
	{
		System.out.println("This is  before setup method");	
	}
@Test()
public void test4()
{
	
 System.out.println("This is test method 4");

 
}
@Test
public void test5()
{
	
 System.out.println("This is test method 5");

 
}
@Test
public void test6()
{
	
 System.out.println("This is test method 6");

 
}
@AfterMethod
void teardown()
{
	System.out.println("This is  after teardown method");	
}
@AfterClass
void AfterClassMethod()
{
	 System.out.println("This is  After class method");	 
}
}
