package testpkg;

import org.testng.annotations.Test;
import pagepkg.Userlogin;

public class logintest extends BaseClass {

	@Test
	public void login() throws Exception
	{
		usln.login();
		usln.data("jacobarun2001@gmail.com", "Arun@123#");
		usln.button();
		usln.title();
	}
}
