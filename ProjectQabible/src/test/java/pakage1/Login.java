package pakage1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Elements.Elements;
import Utility.UtilityRepo;
import Utility.ReadExcel;
import org.testng.annotations.BeforeTest;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Login {
	static WebDriver driver1;
	String url="https://www.qabible.in/payrollapp/";
	UtilityRepo utilityrepoobj= new UtilityRepo();
	Elements elementsobject;
	ReadExcel excelobject;
	SoftAssert softassertobj=new SoftAssert();
	
  @Test(priority = 1)
  public void testcaselogin() throws InterruptedException {
	  String str=excelobject.readData(1, 0);
	  elementsobject.loginUsername.sendKeys(excelobject.readData(1, 0)); 
	  Thread.sleep(3000);
	  elementsobject.loginPassword.sendKeys(excelobject.readData(1, 1));
	  Thread.sleep(3000);
	  elementsobject.loginpagebutton.click();
	  Thread.sleep(3000);
	  Assert.assertTrue(excelobject.readData(2, 0).equals(driver1.getCurrentUrl()));
	  System.out.println("Login page Testcase passed");
  }
  
  @Test(priority = 2)
  public void testcaseviewdeduction() throws InterruptedException {
	  elementsobject.deductionmenu.click();
	  Thread.sleep(3000);
	
	  
  }
  @Test(priority = 3)
  public void testcaseadddeduction() throws InterruptedException {
	 elementsobject.addductionmenu.click();
	 
	// WebElement addworker=driver1.findElement(By.xpath("//*[@id=\"deduction-worker_id\"]"));
	// Select objSelectworker=new Select(addworker);
	// objSelectworker.selectByVisibleText("Aristica  Pasculescu");
	// System.out.println("testcaseadddeduction");
	 WebElement addtype=driver1.findElement(By.xpath("//*[@id=\"deduction-type\"]"));
	 Select objSelecttype=new Select(addtype);
	 objSelecttype.selectByValue("Boots"); 
	 Thread.sleep(3000);
	 elementsobject.addamount.sendKeys("3000");
	 Thread.sleep(3000);
	 elementsobject.adddate.clear();
	 elementsobject.adddate.sendKeys("23-02-2021");
	 //elementsobject.addbutton.click();
	 Thread.sleep(3000);
	  
  }
  @Test(priority = 4)
  public void testcasedeductionviewname() throws InterruptedException {
	  String workername=elementsobject.workerfromtable.getText();
	  String type=elementsobject.typefromtable.getText();
	  String amount=elementsobject.amountfromtable.getText();
	  String date=elementsobject.datefromtable.getText();
	  elementsobject.viewlink.click();
	  String viewworkername=elementsobject.namefromview.getText();
	  String viewtype=elementsobject.typefromview.getText();
	  String viewamount=elementsobject.amountfromview.getText();
	  String viewdate=elementsobject.datefromview.getText();
	  softassertobj.assertTrue(workername.equals(viewworkername) && type.equals(viewtype) && amount.equals(viewamount) && date.equals(viewdate));
	  softassertobj.assertAll();
  }
 	 
  @Test(priority = 5)
  public void testcaseupdateduction() throws InterruptedException {
	  elementsobject.rightdeductionmenu.click();
	  Thread.sleep(3000);
	  String workername=elementsobject.workerfromtable.getText();
	  Thread.sleep(3000);
	  System.out.println(workername);
	  String type=elementsobject.typefromtable.getText();
	  String amount=elementsobject.amountfromtable.getText();
	  String date=elementsobject.datefromtable.getText();
	  Thread.sleep(3000);
	  Thread.sleep(3000);
	  elementsobject.updatelink.click();
	  Thread.sleep(3000);
	  //Select updateworker=new Select(driver1.findElement(By.xpath("//*[@id=\\\"select2-deduction-worker_id-container\\")));
	  //updateworker.getAllSelectedOptions();
	  String updateworker=elementsobject.udateworker.getText();
	  System.out.println(updateworker);
	  String updatetype=elementsobject.updatetype.getText();
	  String updateamount=elementsobject.updateamount.getText();
	  String updatedate=elementsobject.updatedate.getText();
	  softassertobj.assertTrue(workername.matches(updateworker)); 
	  softassertobj.assertAll();
	  }
	 
@Test(priority = 6)
public void testcaseupdatededuction() throws InterruptedException {
	
}

  @BeforeTest
  public void beforeTest() throws IOException {
	  driver1=utilityrepoobj.launchBrowser(url,"chrome");
	  elementsobject=new Elements(driver1);
	  excelobject=new ReadExcel();
	  }

  @AfterTest
  public void afterTest() {
	  driver1.close();
  }

}
