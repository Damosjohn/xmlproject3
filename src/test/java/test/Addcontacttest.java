package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.Addcontactpage;
import page.Loginpage;
import page.dashboardpage;
import util.BrowserFactory;

public class Addcontacttest {
	WebDriver driver;
	@Test
	@Parameters({"Username","Password","fullname","company","email","phone","adress","city","country","state","zip"})
	public void validusershouldbeabletoaddcontact(String username,String password,String fullname,String company,String email,String phone,String adress,String city,String country,String state,String zip) {
		driver =BrowserFactory.init();
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.insertusername(username);
		login.insertpassword(password);
		login.clicksigninbutton();
		dashboardpage page = PageFactory.initElements(driver, dashboardpage.class);
		page.verifydashboardheader();
		page.insertcustomer();
		page.insertaddcustomer();
		Addcontactpage addcontact = PageFactory.initElements(driver, Addcontactpage.class);
		addcontact.insertfullname(fullname);
		addcontact.selectCompany(company);
		addcontact.insertEmail(email);
		addcontact.insertPhone(phone);
		addcontact.insertAddress(adress);
		addcontact.insertCity(city);
		addcontact.selectCountry(country);
		addcontact.insertState(state);
		addcontact.insertZip(zip);
		addcontact.clickSaveButton();
		
	}

}
