package project1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends base {
	public SelectHotel() {
	PageFactory.initElements(driver,this);
}
	
@FindBy(id = "radiobutton_0")
private WebElement radioBtn;
@FindBy(id = "continue")
private List<WebElement> btncontinue;
public WebElement getRadioBtn() {
	return radioBtn;
	
}
public List<WebElement> getBtncontinue() {
	return btncontinue;
	
	
}

}
