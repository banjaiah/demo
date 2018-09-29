package com.ctl.techXpert.projectpage;

import java.net.MalformedURLException;
import java.net.UnknownHostException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.ctl.techXpert.seleniumrepository.AppiumRepo;
import com.ctl.techXpert.seleniumrepository.SeleniumRepo;
import com.ctl.techXpert.util.PropertyFileRead;

public class MobileExecutor {

	@BeforeClass(alwaysRun = true)
	public void BeforeTest()
	{
		/*
		 * @param 1: Browser name -firefox or internetExplorer or chrome
		 *  Below firefox string is being read from the ProjectData.property file in resources package
		 *  
		 *  @param 2: Browser Proxy Yes or No. If yes then port and Host details are read from the Property file
		 */
		System.out.println("TestCase Starts");
		try {
			AppiumRepo.startAppium(PropertyFileRead.FileRead("Appium.properties","platformName"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterClass(alwaysRun = true)
	public void AfterTest()
	{
		System.out.println("TestCase Ends");
		AppiumRepo.driver.quit();

	}

}
