package practice_maven;

import org.testng.annotations.Test;

public class Simple1Test {
	
	@Test(groups = "smoke")
	public void simple1()
	{
		System.out.println("testscript1");
	}

	@Test(groups = "regression")
	public void simple2()
	{
		System.out.println("testscript2");
	}

	
}
