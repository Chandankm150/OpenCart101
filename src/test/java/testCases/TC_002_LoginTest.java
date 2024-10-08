package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {
	
	
	@Test(groups={"Sanity","Master"})
	public void verify_login()
	{
		logger.info("****** Starting TC_002_LoginTest *******");
		
		try {
			 
			//Home Page
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			
			
			//login Page
			LoginPage lp=new LoginPage(driver);
			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.clickLogin();
			
			
			
			//MyAccount
			MyAccountPage macc=new MyAccountPage(driver);
			boolean targetPage=macc.isMyAccountPageExists();
			
			Assert.assertTrue(targetPage);//
		}
		catch (Exception e) {
			
			
			Assert.fail();
			// TODO: handle exception
		}
			
			
			
		logger.info("****** Finished TC_002_LoginTest *******");	
			
			
		}
		
	}


