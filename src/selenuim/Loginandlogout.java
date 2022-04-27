package selenuim;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Loginandlogout {

	
	@Before
	public void setUp() throws Exception {
		
		System.out.println("login");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Logout");
	}
	
	

	@Test
	public void test1() {
		//System.out.println("login");
		System.out.println("test1"); // this line code in error than all test is fail becuse after system is not logout and still sawing login that wise all test is fail
		//System.out.println("Logout");
		
	}
	@Test
	public void test2()
	{
		//System.out.println("login");
		System.out.println("test2");
		//System.out.println("Logout");
	}
	@Test
	public void test3()
	{
		//System.out.println("login");
		System.out.println("test3");
		//System.out.println("Logout");
	}

}
