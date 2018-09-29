package com.ctl.techXpert.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.ctl.techXpert.projectpage.MobileExecutor;
import com.ctl.techXpert.seleniumrepository.AppiumRepo;
import com.ctl.techXpert.projectpage.*;



public class LoginPageTest extends MobileExecutor{

	@Test(enabled = true)
	public void verifyingLoginPage()
	{
		Reporter.log("===============Start verifyingLoginPage========================"+"<br>");
		LoginPage loginPage = new LoginPage();
		Reporter.log("Step 1. Verifying whether user name field is present or not"+"<br>");
		System.out.println(AppiumRepo.isElementPresent(loginPage.getMobileID()));
		Reporter.log("===============End verifyingLoginPage========================"+"<br>");
	}


}