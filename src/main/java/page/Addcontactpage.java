package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Addcontactpage extends Basepage {
	WebDriver driver;
	public Addcontactpage(WebDriver driver) {
		this.driver= driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement FULLNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement COMPANY_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	WebElement ADDRESS_ELEMENT;

	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement COUNTRY_ELEMENT;

	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]")
	WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]")
	WebElement STATE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]")
	WebElement ZIP_ELEMENT;

	@FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]")
	WebElement SUBMIT_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[@id='summary']")
	WebElement SUMMARY_ON_PROFILE_ELEMENT;

	public void insertfullname(String fullname) {
		
		int generatnum = generatednum(999);
		
		FULLNAME_ELEMENT.sendKeys(fullname+generatnum);
	}
	public void selectCompany(String company) {
		selectFromDropdown(COMPANY_NAME_ELEMENT, company);
	}

	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generatednum(9999) + email);

	}

	public void insertPhone(String phone) {
		PHONE_ELEMENT.sendKeys(phone + generatednum(99));
	}

	public void insertAddress(String address) {
		ADDRESS_ELEMENT.sendKeys(address);
	}

	public void insertCity(String city) {
		CITY_ELEMENT.sendKeys(city);
	}
	
	public void selectCountry(String country) {

		selectFromDropdown(COUNTRY_ELEMENT, country);
		
	}

	public void insertState(String state) {
		STATE_ELEMENT.sendKeys(state);
	}

	public void insertZip(String zip) {
		ZIP_ELEMENT.sendKeys(zip);
	}

	

	public void clickSaveButton() {
		SUBMIT_BUTTON_ELEMENT.click();
	}
	public void verifyprofilepage() {
		waitForElement(driver, 5,SUMMARY_ON_PROFILE_ELEMENT);
	}

	
}
	
	


