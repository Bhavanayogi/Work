package testNG;

import org.testng.annotations.Test;

public class Testngdemo3 {

	@Test(groups = { "smoke" })

	public void personalloan() {
		System.out.println("This is for PersonalLoan");
	}

	@Test // @Test(enabled=false) used to skip this particular Test
			// @Test(timeOut=4000) used to wait till 4 Secs before it throws error.

	public void homeloan() {
		System.out.println("This is for HomeLoan");
	}

	@Test(dependsOnMethods = { "homeloan", "personalloan" }) // we can also add multiple methods like
	// @Test(dependsOnMethods= {"homeloan","personalloan"})

	public void carloan() {
		System.out.println("This is for carLoan");
	}
}
