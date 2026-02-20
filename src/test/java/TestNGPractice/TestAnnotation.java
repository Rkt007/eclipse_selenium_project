package TestNGPractice;

import org.testng.annotations.*;

public class TestAnnotation {

    @BeforeSuite
    void beforeSuite() {
        System.out.println("This is BeforeSuite method");
    }

    @AfterSuite
    void afterSuite() {
        System.out.println("This is AfterSuite method");
    }

    @BeforeClass
	void BeforeClassMethod() {
		System.out.println("This is  before class method");
	}

	@BeforeMethod
	void setup() {
		System.out.println("This is  before setup method");
	}

	@Test()
	public void test1() {

		System.out.println("This is test method 1");

	}

	@Test
	public void test2() {

		System.out.println("This is test method 2");

	}

	@Test
	public void test3() {

		System.out.println("This is test method 3");

	}

	@AfterMethod
	void teardown() {
		System.out.println("This is  after teardown method");
	}

	@AfterClass
	void AfterClassMethod() {
		System.out.println("This is  After class method");
	}
}