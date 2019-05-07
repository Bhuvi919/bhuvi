package package_maven.project_maven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample extends Base {
	
	public static void main(String[] args) throws IOException {
		
		 WebDriver driver = getDriver();

		loadUrl("http://demo.automationtesting.in/Register.html");

		WebElement txtFirstName = driver.findElement(By.xpath("(//input[@type='text'])[1]")); 
		type(txtFirstName,getData(0,0));

		WebElement txtLastName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		type(txtLastName,getData(1,0));

		WebElement txtAddress = driver.findElement(By.xpath("//textarea[@rows='3']"));
		type(txtAddress,getData(2,0));

		WebElement txtEmail = driver.findElement(By.xpath("//input[@type='email']"));
		type(txtEmail,getData(3,0));


		WebElement txtPhone = driver.findElement(By.xpath("//input[@type='tel']"));
		type(txtPhone,getData(4,0));

		WebElement btnGender = driver.findElement(By.xpath("//input[@value='Male']"));
		btnClick(btnGender);

		WebElement ckbHobbies = driver.findElement(By.id("checkbox2"));
		btnClick(ckbHobbies);

		WebElement selectLang = driver.findElement(By.id("msdd"));
		btnClick(selectLang);

		WebElement dropSkills = driver.findElement(By.id("Skills"));
		selectByText(dropSkills,"Networks");

		WebElement dropCountry = driver.findElement(By.id("countries"));
		selectByText(dropCountry,"India");

		WebElement dpdCountry = driver.findElement(By.xpath("//span[text()='India']"));
		selectByText(dpdCountry,"India");

		WebElement dobYear = driver.findElement(By.id("yearbox"));
		selectByText(dobYear,"1990");

		WebElement dobMonth = driver.findElement(By.xpath("(//select[@type='text'])[4]"));
		selectByText(dobMonth,"May");


		WebElement dobDay = driver.findElement(By.id("daybox"));
		selectByText(dobDay,"12");

		WebElement txtFirstPass = driver.findElement(By.id("firstpassword"));
		type(txtFirstPass,getData(5,0));

		WebElement txtSecPass = driver.findElement(By.id("secondpassword"));
		type(txtSecPass,getData(5,0));

		WebElement btnSubmit = driver.findElement(By.id("submitbtn"));
		btnClick(btnSubmit);

		quitBrowser();



		}
}
