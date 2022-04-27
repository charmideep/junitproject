package selenuim;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)  // if we want to execute according to name that time we all this line

public class test3 {
	@Rule
	public ErrorCollector err=new ErrorCollector();

	@Test
	public void test6() {  //but we need to assign a_test6() that time it execute first
		//String actau="abc";
		//String excpeted="abc";
	//	if(excpeted.equals(actau))// if condititon is condidtion is fail but test is pass, if we want to check test than we can not use if condidtion
		//{  // we use asset
			//System.out.println("pass");
			
		//}
		//else
		//{
			//System.out.println("fail");
		//}
		
		String act="abc";
		String exc="abc1";
		
		System.out.println("before 1st assert");
		try {
		Assert.assertEquals(exc, act);
		}
		catch(Throwable t) {
			err.addError(t);  //without that test is pass byt using that one arror is collator and execution another line and test is fail
			System.out.println("catch1");
		}
		
		System.out.println("after 1st assert");
		Assert.assertTrue("verify 4>3", 4>3);
		System.out.println("charmi");
		

	}
	@Test
	public void test7()
	{
		String act="xyz";
		String exe="xyz";
		
		System.out.println("before 2snd assert");
		Assert.assertEquals(exe, act);
		System.out.println("after 2 nd assert");
		Assert.assertTrue("verify 4>3", 4>3);
		System.out.println("Deep");
	}

}
