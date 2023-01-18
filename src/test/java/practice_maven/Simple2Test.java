package practice_maven;

import org.testng.annotations.Test;

public class Simple2Test {
	
	@Test(groups = "regression")
	public void simple3()
	{
		System.out.println("testscript3");
	}

	@Test(groups = "smoke")
	public void simple4()
	{
		System.out.println("testscript4");
	}


}
