package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class dashboardpage {
	WebDriver driver;
	public dashboardpage(WebDriver driver) {
		this.driver= driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[2]/a/span")
	WebElement DASHBOARDHEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a/span[1]")
	WebElement CUSTOMER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
	WebElement ADDCUSTOMER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a")
	WebElement LISTCUSTOMER_ELEMENT;

public void verifydashboardheader() {
	Assert.assertEquals(DASHBOARDHEADER_ELEMENT.getText(), "Dashboard", "wrong page!!!");
}
public void insertcustomer() {
	CUSTOMER_ELEMENT.click();
}
public void insertaddcustomer() {
	ADDCUSTOMER_ELEMENT.click();
}
}
