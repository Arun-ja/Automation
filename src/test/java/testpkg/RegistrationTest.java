package testpkg;

import org.testng.annotations.Test;

import pagepkg.Registrationpage;

public class RegistrationTest  extends BaseClass
{

	@Test
	public void test() throws Exception
	{
		regpg.createaccount();
		regpg.accntdetails("Arun","Jacob","jacobarun2001@gmail.com","Arun@123#","Arun@123#");
		regpg.account();
		regpg.title();
	}
}
