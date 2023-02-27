package stepdefination;



import bdd.Nissan.Base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InterquoteTest extends BaseClass {
	
	
	@Given("go to internet quote page")
	public void go_to_internet_quote_page() throws InterruptedException {
		getAQuotePage.internetquote(driver);
	    
	}
	@Given("click sentra car button")
	public void click_sentra_car_button() {
		getAQuotePage.sentraselect(driver);
	    
	}
	@When("Validate get quote page title")
	public void validate_get_quote_page_title() {
		getAQuotePage.validatetitleintenet("REQUEST A QUOTE");
	    
	}
	
	@When("insert first name {string}")
	public void insert_first_name(String string) {
		getAQuotePage.firstname("Sanjib");
	    	}

	@Then("insert Zip code {string}")
	public void insert_zip_code(String zipcode) {
		getAQuotePage.inputphonecode(zipcode);
	  
	}

}
