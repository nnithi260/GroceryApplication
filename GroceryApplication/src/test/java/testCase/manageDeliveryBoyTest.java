package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant1.Constant;
import elementRepository.HomePage;
import elementRepository.LoginPage;
import elementRepository.ManageDeliveryBoy;

public class manageDeliveryBoyTest extends baseClass {
	LoginPage lp;
	ManageDeliveryBoy mdb;
	HomePage hp;
  @Test
  public void addDeliveryBoy() {
	  	lp = new LoginPage(driver);
		mdb = new ManageDeliveryBoy(driver); 
		hp=new HomePage(driver);
		lp.sendUserName("admin");
		lp.sendPasswor("admin");
		lp.clickOnSignInButton();
		String actual="Admin";
		String expected=hp.verifyMsg();
		Assert.assertEquals(actual,expected,Constant.lp_verifyLogInWithInValidData);
		mdb.manageInfo();
		mdb.addDeliveryBoy();
		mdb.enterName();
		mdb.eMailId();
		mdb.userName();
		mdb.passWord();
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
		mdb.saveButtonOp();
		mdb.readAlertMsg();
		String expected1=mdb.readFromTableName();
		String actual1="happykuttan11";
		Assert.assertEquals(actual1,expected1,Constant.lp_verifyLogInWithInValidData);
		
  }
}
