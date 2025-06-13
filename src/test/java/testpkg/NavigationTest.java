package testpkg;

import org.testng.annotations.Test;

public class NavigationTest extends BaseClass{
	
	@Test
	public void test() throws Exception
	{
		nav.hover();
		nav.logo();
	}

}
