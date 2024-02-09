package stepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.SearchPage;

public class StepDefn {

	public WebDriver driver;

	public SearchPage searchPage;

	@Before
	public void setup() {
		System.out.println("Setup method executed");
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);
	}

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		System.out.println("browser opened");
		searchPage = new SearchPage(driver);

	}

	@And("when user open url {string}")
	public void when_user_open_url(String url) {
		driver.get(url);
	}

	@When("I search for {string}")
	public void i_search_for(String iteam) {
		searchPage.searchiteam(iteam);
	}

	@When("I select the first result from the search results")
	public void i_select_the_first_result_from_the_search_results() {
		searchPage.selectedFirstIteam();
	}

	@Then("I should be taken to the product details page")
	public void i_should_be_taken_to_the_product_details_page() {
		System.out.println("User landed on product page");
	}

	@When("I am on the product details page of a selected mobile phone")
	public void i_am_on_the_product_details_page_of_a_selected_mobile_phone() {
		System.out.println("The product deatils page title is :" + driver.getTitle());

	}

	@When("I click on the product name or image")
	public void i_click_on_the_product_name_or_image() {
		searchPage.pageDetails();
	}

	@Then("I should be able to view detailed information about the product")
	public void i_should_be_able_to_view_detailed_information_about_the_product() throws InterruptedException {
		searchPage.verifyProductDeatails();
	}

	@Given("I have searched for {string}")
	public void i_have_searched_for(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("I have applied filters for brand, price range, and specifications")
	public void i_have_applied_filters_for_brand_price_range_and_specifications() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("I view the search results")
	public void i_view_the_search_results() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("only laptops matching the applied filters should be displayed")
	public void only_laptops_matching_the_applied_filters_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("I am on the product details page of a mobile phone")
	public void i_am_on_the_product_details_page_of_a_mobile_phone() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("I have added another mobile phone to the comparison list")
	public void i_have_added_another_mobile_phone_to_the_comparison_list() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("I click on the {string} button")
	public void i_click_on_the_button(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("I should be able to view a comparison of the selected products")
	public void i_should_be_able_to_view_a_comparison_of_the_selected_products() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("I am on the product details page of a laptop")
	public void i_am_on_the_product_details_page_of_a_laptop() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("the product should be added to my wishlist for future reference")
	public void the_product_should_be_added_to_my_wishlist_for_future_reference() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("the product should be added to my shopping cart")
	public void the_product_should_be_added_to_my_shopping_cart() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@After
	public void tearDown(Scenario sc) {
		if (sc.isFailed() == true) {
			try {
				File screenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenShotFile, new File("/Users/nafis/eclipse/EcommerceSites/screenshot/test.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.close();
		}
	}
}
