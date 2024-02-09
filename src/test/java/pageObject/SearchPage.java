package pageObject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	public WebDriver driver;

	public SearchPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//input[@name='q']")
	WebElement searchElement;

	@FindBy(xpath = "//div[normalize-space()='Apple iPhone 12 (Blue, 64 GB)']")
	WebElement firstElementSelect;

	@FindBy(xpath = "//span[@class='B_NuCI']")
	WebElement verifyProductName;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]")
	WebElement deatilsOfPagElement;

	@FindBy(xpath = "//input[@id='pincodeInputId']")
	WebElement pinCode;

	public void searchiteam(String iteam) {
		searchElement.sendKeys(iteam);
		searchElement.sendKeys(Keys.ENTER);
	}

	public void selectedFirstIteam() {
		System.out.println(firstElementSelect.getText());
		String fontSize = firstElementSelect.getAttribute("class");
		System.out.println(fontSize);
		firstElementSelect.click();

	}
	
	public void pageDetails() {
		String productText=deatilsOfPagElement.getText();
		System.out.println(productText);
	}

	public void verifyProductDeatails() throws InterruptedException {
		Thread.sleep(2000);
		Set<String> windowSet=driver.getWindowHandles();
		Iterator<String> iterator=windowSet.iterator();
		String parentWindow=iterator.next();
		String childWindow=iterator.next();
		driver.switchTo().window(childWindow);
		
		searchElement.sendKeys("Hello Test");
		pinCode.sendKeys("299999");
		System.out.println("Title is :" + driver.getTitle());
	
	}
}
