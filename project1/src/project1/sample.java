package project1;

public class sample extends base {
	public static void main(String[] args)  {
		base b = new base ();
		driver = b.getDriver();
		b.loadUrl("https://www.adactin.com/HotelApp/");
		loginpage page1= new loginpage();
		b.type(page1.getTxtUserName(), "Bhuvaneswaran919");
		b.type(page1.getTxtPassword(), "X59F25");
		b.btnClick(page1.getBtnlogin().get(0));
		
		SearchHotel page2 = new SearchHotel();
		
		b.selectBytext(page2.getLocation(), "London");
		b.selectBytext(page2.getHotels(), "Hotel Sunshine");
		b.selectBytext(page2.getRoomtype(), "Standard");
		b.selectByIndex(page2.getRoomNo(),1);
		b.type(page2.getDatePickin(),"9/05/2019");
		b.type(page2.getDatePickout(),"10/05/2019");
		b.selectByIndex(page2.getAdultRoom(), 2);
		b.selectByIndex(page2.getChildRoom(), 3);
		b.btnClick(page2.getBtnSearch1().get(0));
		SelectHotel page3 = new SelectHotel();
		b.btnClick(page3.getRadioBtn());
		b.btnClick(page3.getBtncontinue().get(0));
		
		BookHotel page4 = new BookHotel();
		
		b.type(page4.getFirstName(),"Bhuvaneswaran");
		b.type(page4.getLastName(),"K");
		b.type(page4.getAddress(),"Choolaimedu");
		b.type(page4.getCcNum(),"1234567891234567");
		b.selectBytext(page4.getCcType(),"VISA");
		b.selectBytext(page4.getCcExpMonth(),"May");
		b.selectBytext(page4.getCcExpYear(),"2022");
		b.type(page4.getCcCvv(),"186");
		b.btnClick(page4.getBkNow().get(0));
		
		BookConfirm page5 = new BookConfirm();
	
		b.getAttribute(page5.getOrderNo());
		
		
		
		
		
		
		
		
		
		
	}
}