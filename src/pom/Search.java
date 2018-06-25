package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

public class Search extends BasePage{
	@FindBy(xpath = "//img[@src='https://i.ebayimg.com/thumbs/images/g/VCQAAOSwTSVZz3Rp/s-l225.jpg']")
	private WebElement straightener;

	public Search(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickStraightener() {
		straightener.click();

	}
}
