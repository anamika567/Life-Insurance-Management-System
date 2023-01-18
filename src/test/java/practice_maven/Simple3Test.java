package practice_maven;

import org.testng.annotations.Test;

public class Simple3Test {

	@Test(groups = "smoke")
	public void simple5()
	{
		System.out.println("testscript5");
	}

	@Test(groups = "regression")
	public void simple6()
	{
		System.out.println("testscript6");
	}

}
