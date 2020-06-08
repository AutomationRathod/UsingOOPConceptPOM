/**
 * 
 */
package com.mytest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypages.HomePage;
import com.mypages.LoginPage;

/**
 * @author Shree
 *
 */
public class LoginTest extends BaseTest{
	
	@Test(priority = 1,enabled = false)
	public void verifyLoginPageTitleTest() {
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("title");
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test(priority = 2,enabled = false)
	public void verifyLoginPageHeaderTest() {
		String header = page.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println("header");
		Assert.assertEquals(header, "Don't have an account?");
	}
	
	@Test(priority = 3)
	public void doLoginTest() {
		HomePage homePage = page.getInstance(LoginPage.class).doLogin("automation069@gmail.com","Test@#123");
		
		String headerHome = homePage.getHomePageHeader();
		System.out.println(headerHome);
		Assert.assertEquals(headerHome, "Thanks for choosing HubSpot");
	}

}
