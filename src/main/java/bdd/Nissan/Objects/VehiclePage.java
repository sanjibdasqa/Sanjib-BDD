package bdd.Nissan.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import bdd.Nissan.Commom.CommonActions;

public class VehiclePage {
	CommonActions actions;
	public VehiclePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions =new CommonActions(driver);
	}

	@FindBy(xpath = "//a[@data-mks-name='Rogue Sport™' and @data-di-id='di-id-c25ed30-5098b204']")
	WebElement rougeSportElement;

	// @FindBy(xpath = "(//span[@class='c_283_build_link--desktop'])[1]")
	@FindBy(css = "a.usg-btn.usg-btn--primary.usg-btn--fill-small.track-c258-cta")
	WebElement buildAndPrice;

	public void clickRougSport(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", rougeSportElement);
	}

	public void buildAndPriceTest(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", buildAndPrice);

	}

	/*
	 * @FindBy (xpath ="//div[text()='Resume']" ) WebElement resume;
	 * 
	 * public void buildtest1(WebDriver driver) { JavascriptExecutor js =
	 * (JavascriptExecutor) driver; js.executeScript("arguments[0].click()",resume
	 * );
	 * 
	 * }
	 */

	@FindBy(className = "c_320-build_cta-long")
	WebElement buildAndPrice2;

	public void buildtest1(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", buildAndPrice2);
	}

	@FindBy(xpath = "//div[@class='sd-close']")
	WebElement closebutton;

	public void closebutton() {
		actions.click(closebutton);
	}

	// @FindBy (css
	// ="a.Buttonstyles__StyledButton-sc-1s5ly6x-1.ksdsrj.RecentBuildBannerstyles__Button-sc-s05vxu-15.hmlRxu"
	// )
   //@FindBy(xpath = "(//img[@class='Imagestyles__StyledImage-sc-1pzdq9h-0 hdKRac VersionTilestyles__VersionImage-sc-rm9rzt-5 bIYVgX'])[2]")
	// @FindBy(xpath = "(//span[@class='Base__StyledElement-sc-k9cma9-0 ubbpu
	// Pillstyles__StyledPill-sc-6ikwy8-0 keXYFl
	// VersionTilestyles__OffersPill-sc-rm9rzt-27 duFuqF'])[1]")

	@FindBy(xpath = "(//a[@class='Buttonstyles__StyledButton-sc-1s5ly6x-1 ksdsrj VersionTilestyles__StyledCTA-sc-rm9rzt-31 hinytq'])[1]")
	WebElement finalcar;

	public void buildtest2(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", finalcar);
		js.executeScript("arguments[0].click()", finalcar);
		Thread.sleep(20);

	}
}
