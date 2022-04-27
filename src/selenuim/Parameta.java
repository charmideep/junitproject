package selenuim;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class Parameta {
	
	String user;
	String pas;
	String name;
	
	public Parameta(String user,String pas,String name)
	{
		this.user=user;
		this.pas=pas;
		this.name=name;
	}
	
	@Test
	public void test() {
		System.out.println("charmi");
	}
	@Parameters
	public static Collection<Object[]>getData()
	{
		Object[][] data=new  Object[3][3];
		data[0][1]="a";
		data[0][1]="b";
		data[0][2]="c";
		
		
		data[1][1]="a";
		data[1][1]="b";
		data[1][2]="c";
		
		data[2][1]="a";
		data[2][1]="b";
		data[2][2]="c";
		
		return Arrays.asList(data);
		
	}
	

}
