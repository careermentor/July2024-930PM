package org.wipro.fedexcouw.testcases;

import org.testng.annotations.Test;
import org.wipro.fedexcouw.basePKG.InitiateBrowser;
import org.wipro.fedexcouw.pages.SignupPage;

public class SignupScenario extends InitiateBrowser
{

	@Test
	public void tc002_signupfunctionality() throws Exception
	{
		SignupPage sp = new SignupPage(driver);
		
		sp.click_createnewaccount_button();
		sp.enter_firstname("selenium");
		sp.select_dob_day_name("10");
		sp.gender_male();
		
	}
	
}
