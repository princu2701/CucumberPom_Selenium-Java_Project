package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import POMData.CartPage;
import POMData.Homepage;
import POMData.ProductDetails;
import POMData.SearchesProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cartsceanrios {

	public WebDriver driver;
	
	CartPage cPage;
	
	Homepage hpage;
	
	ProductDetails pDetails;
	
	SearchesProductPage sProductPage;
		 
		 

	@Given("User goes to Url")
	public void user_goes_to_url() {
	    
		
		driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		driver.get("https://demowebshop.tricentis.com");
		
         
		 cPage = new CartPage(driver);
		 
		 hpage = new Homepage(driver);
		 
		 pDetails = new ProductDetails(driver);
		 
		 sProductPage = new SearchesProductPage(driver);
		 
	}

	@When("User searches a product")
	public void user_searches_a_product() {
	    
		hpage.search();
		
		hpage.searchdata("laptop");
	}

	@When("Goes to cart")
	public void goes_to_cart() {
	    
		hpage.shoppingpage();
	}

	@Then("Cart should be empty")
	public void cart_should_be_empty() {
	    
		Assert.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/cart");
		
		driver.quit();
	}
	
}
