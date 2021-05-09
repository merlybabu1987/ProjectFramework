package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {
	WebDriver driver;
	public Elements(WebDriver driver1)
	{
		this.driver=driver1;
		PageFactory .initElements(driver1,this);
	}
@FindBy(xpath="//*[@id=\"loginform-username\"]")public WebElement loginUsername;
@FindBy(xpath="//*[@id=\"loginform-password\"]")public WebElement loginPassword;
@FindBy(name="login-button")public WebElement loginpagebutton;
@FindBy(xpath="//*[@id=\"w1\"]/li[5]/a")public WebElement deductionmenu;
@FindBy(xpath="//*[@id=\"w0\"]/table/tbody/tr[1]/td[7]/a[1]/span")public WebElement viewlink;
@FindBy(xpath="//*[@id=\"w0\"]/table/tbody/tr[1]/td[2]")public WebElement workerfromtable;
@FindBy(xpath="//*[@id=\"w0\"]/table/tbody/tr[1]/td[3]")public WebElement typefromtable;
@FindBy(xpath="//*[@id=\"w0\"]/table/tbody/tr[1]/td[4]")public WebElement amountfromtable;
@FindBy(xpath="//*[@id=\"w0\"]/table/tbody/tr[1]/td[5]")public WebElement datefromtable;
@FindBy(xpath="//*[@id=\"w0\"]/tbody/tr[1]/td")public WebElement namefromview;
@FindBy(xpath="//*[@id=\"w0\"]/tbody/tr[2]/td")public WebElement typefromview;
@FindBy(xpath="//*[@id=\"w0\"]/tbody/tr[3]/td")public WebElement amountfromview;
@FindBy(xpath="//*[@id=\"w0\"]/tbody/tr[4]/td")public WebElement datefromview;
@FindBy(xpath="/html/body/header/div[3]/div/div/div[2]/ul/li[2]/a")public WebElement rightdeductionmenu;
@FindBy(xpath="//*[@id=\"w0\"]/table/tbody/tr[1]/td[7]/a[2]/span")public WebElement updatelink;
@FindBy(xpath="//*[@id=\"select2-deduction-worker_id-container\"]")public WebElement udateworker;
@FindBy(xpath="//*[@id=\"deduction-type\"]")public WebElement updatetype;
@FindBy(xpath="//*[@id=\"deduction-amount\"]")public WebElement updateamount;
@FindBy(xpath="//*[@id=\"deduction-effective_from\"]")public WebElement updatedate;
@FindBy(xpath="/html/body/section/div/div/div[1]/ul/li[2]/a")public WebElement addductionmenu;
//@FindBy(xpath="//*[@id=\"select2-deduction-worker_id-container\"]/span")public WebElement addworker;
//@FindBy(xpath="//*[@id=\"deduction-type\"]")public WebElement addtype;
@FindBy(xpath="//*[@id=\"deduction-amount\"]")public WebElement addamount;
@FindBy(xpath="//*[@id=\"deduction-effective_from\"]")public WebElement adddate;
@FindBy(xpath="//*[@id=\"w0\"]/div[5]/div/button")public WebElement addbutton;

}
