package project1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends base {
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement firstName;
	@FindBy(id="last_name")
	private WebElement lastName;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement ccNum;
	@FindBy(id="cc_type")
	private WebElement ccType;
	@FindBy(id="cc_exp_month")
	private WebElement ccExpMonth;
	@FindBy(id="cc_exp_year")
	private WebElement ccExpYear;
	@FindBy(id="cc_cvv")
	private WebElement ccCvv;
	@FindBy(id="book_now")
	private List<WebElement> bkNow;
	public WebElement getFirstName() {
		return firstName;
		}
	public WebElement getLastName() {
		return lastName;
		}
	public WebElement getAddress() {
		return address;
		}
	public WebElement getCcNum() {
		return ccNum;
		}
	
	public WebElement getCcType() {
		return ccType;
		}
	public WebElement getCcExpMonth() {
		return ccExpMonth;
		}
	public WebElement getCcExpYear() {
		return ccExpYear;
		}
	
	public WebElement getCcCvv() {
		return ccCvv;
		}
	
	public List<WebElement> getBkNow() {
		return bkNow;
		}
	
	

}
