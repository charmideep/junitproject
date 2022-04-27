 package selenuim;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing1 {
	
	//how to create junit
	//create java project and right click on src floder and select junit test case
	//there is no main method
	
	//there is not min method in junit
	//it is exit by annotation @name
	// reduce java file in which we can write all code and than execute if there is any test is fail than it saw
	// if any test is fail than another test is exctue 
	//but if test method in side any code fail than that method is not execute
	//it is use for regrassion testing
	//before,after annotation is not manadertory
	//but test annotation is mandertory,if there is no test annotation we can not run the class
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
		System.out.println("login");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
		System.out.println("logout ");
	}

	@Test
	public void test1() {
		System.out.println("Test1");
	}
	@Test
	public void test2()
	{
		System.out.println("Test2");
	}
	@Test
	public void test3()
	{
		System.out.println("test3");
	}

}
