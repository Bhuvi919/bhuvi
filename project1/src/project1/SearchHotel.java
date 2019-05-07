package project1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends base {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="room_no")
	private WebElement roomNo;
	@FindBy(id="datepick_in")
	private WebElement datePickin;
	@FindBy(id="datepick_out")
	private WebElement datePickout;
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	@FindBy(id="child_room")
	private WebElement childRoom;
	@FindBy(id="submit")
	private List<WebElement> btnsearch1;
	public WebElement getLocation() {
		return location;
		}
	public WebElement getHotels() {
		return hotels;
		}
	public WebElement getRoomtype() {
		return roomType;
		}
	public WebElement getRoomNo() {
		return roomNo;
		}
	public WebElement getDatePickin() {
		return datePickin;
		}
	public WebElement getDatePickout() {
		return datePickout;
		}
	public WebElement getAdultRoom() {
		return adultRoom;
		}
	public WebElement getChildRoom() {
		return childRoom;
		}
	public List<WebElement> getBtnSearch1() {
		return btnsearch1;		
		}
	
	
}
