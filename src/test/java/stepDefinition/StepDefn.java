package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.SearchPage;

public class StepDefn {

	public WebDriver driver;

	SearchPage searchPage;

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/Users/nafis/Downloads/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		

	}

	@Given("when user open url {string}")
	public void when_user_open_url(String url) {
		driver.get(url);
	}

	@When("I search for {string}")
	public void i_search_for(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("I select the first result from the search results")
	public void i_select_the_first_result_from_the_search_results() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("I should be taken to the product details page")
	public void i_should_be_taken_to_the_product_details_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("I am on the product details page of a selected mobile phone")
	public void i_am_on_the_product_details_page_of_a_selected_mobile_phone() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("I click on the product name or image")
	public void i_click_on_the_product_name_or_image() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("I should be able to view detailed information about the product")
	public void i_should_be_able_to_view_detailed_information_about_the_product() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
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

}
