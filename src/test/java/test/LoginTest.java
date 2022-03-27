package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.Loginpage;
import page.dashboardpage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	
	@Test
	@Parameters({"Username","Password"})
	public void validusershouldbeabletologin(String username,String password ) {
		driver =BrowserFactory.init();
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.insertusername(username);
		login.insertpassword(password);
		login.clicksigninbutton();
		dashboardpage page = PageFactory.initElements(driver, dashboardpage.class);
		page.verifydashboardheader();
		page.insertcustomer();
		page.insertaddcustomer();
		//BrowserFactory.teardown();
	}

}
