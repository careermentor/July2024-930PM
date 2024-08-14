package org.wipro.fedexcouw.datagenerator;

import org.testng.annotations.DataProvider;

public class TestDataGen
{
	
	@DataProvider(name="dataname")
	public Object[][] datagen()
	{
		//String abc = "User1";
		//Object[] abcd = {"user1","pass1"};
		
		Object[][] abcde = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
		
		return abcde;
	}

	@DataProvider(name="dataname1")
	public Object[][] datagen1()
	{
		//String abc = "User1";
		//Object[] abcd = {"user1","pass1"};
		
		Object[][] abcde = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
		
		return abcde;
	}
	
}
