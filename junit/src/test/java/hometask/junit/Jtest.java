package hometask.junit;
import junit.framework.TestCase;
public class Jtest extends TestCase{
	Junit Junitobject=new Junit();
	public void test()
	{
		assertEquals("",Junitobject.BringIt(""));	
	}	
	public void test1()
	{
		assertEquals("",Junitobject.BringIt("A"));	
	}	
	public void test2()
	{
		assertEquals("B",Junitobject.BringIt("B"));	
	}	
	public void test3()
	{
		assertEquals("B",Junitobject.BringIt("AAB"));	
	}	
	public void test4()
	{
		assertEquals("BCD",Junitobject.BringIt("ABCD"));	
	}	
	public void test5()
	{
		assertEquals("BCD",Junitobject.BringIt("BACD"));	
	}	
}
