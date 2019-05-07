package project1;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage extends base{
public loginpage() {
	PageFactory.initElements(driver,this);
   }
@FindBy (id="username")
private WebElement txtUsername;
@FindBy (id="password")
private WebElement txtpassword;
@FindBy (id="login")
private List<WebElement> btnlogin;




public WebElement getTxtUserName()
{
	return txtUsername;
	
}
public WebElement getTxtPassword()
{
	return txtpassword;
	
}


public List<WebElement> getBtnlogin() 
{
return btnlogin;
}



} 
