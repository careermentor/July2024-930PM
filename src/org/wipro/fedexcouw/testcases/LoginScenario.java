package org.wipro.fedexcouw.testcases;

import org.testng.annotations.Test;
import org.wipro.fedexcouw.basePKG.InitiateBrowser;
import org.wipro.fedexcouw.datagenerator.TestDataGen;
import org.wipro.fedexcouw.pages.LoginPages;

public class LoginScenario extends InitiateBrowser
{

	@Test(dataProvider="dataname", dataProviderClass=TestDataGen.class)
	public void tc001_loginfunctionality(String username, String password) throws Exception
	{
		LoginPages lp = new LoginPages(driver);
		
		lp.enter_username(username);
		lp.enter_password(password);
		lp.click_login_button();
		
		
	}
	
	
	
}
