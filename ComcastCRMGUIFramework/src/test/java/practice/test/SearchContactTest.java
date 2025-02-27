package practice.test;
/**
 * test class for Contact module
 * @author Narahari
 * 
 */

import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.objectrepositoryutility.LoginPage;

public class SearchContactTest extends BaseClass{
	/**
	 * Scenario : login() ==> navigateContact ==> createcontact() == verify
	 */
	@Test
	public void searchContactTest() {
		/*
		 * Step 1: Login to app
		 */
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp("username", "password");
	}
}
