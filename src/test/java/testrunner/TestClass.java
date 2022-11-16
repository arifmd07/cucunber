package testrunner;







import java.io.IOException;





import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.page.LoginClass;
import com.page.ProductPage;
import com.utils.TestUtils;

public class TestClass extends BaseClass {

	public LoginClass lg;
	public ProductPage pg;
	public TestUtils tu;
	public TestClass(){
		super();
	}

	@BeforeTest
	public void Initialised() throws IOException {
		System.out.println("seUp");
		setUp();
		TestUtils.takeScreenschot();
		//tu.takeScreenschot();
		
	
	
	}
	@Test
	public void titleTest() {
	String jodu=lg.verifyTitle();
	Assert.assertEquals(jodu, "Swag Labs");
	}

	@Test 
	public void userNames() throws IOException {
		lg = new LoginClass();
		lg.userName();
		TestUtils.takeScreenschot();
		//tu.takeScreenschot();
	}
	@Test
	public void LoginTest() {
		

		lg = new LoginClass();
		System.out.println("cheeking login");

		lg.signUp(pop.getProperty("userName"),pop.getProperty("password"));
		System.out.println("login pass or fail");
		
	}
	
	@Test
	public void menueTest() {
		
		pg= new ProductPage();
		pg.menue();
	}
	@Test
	public void backcart() throws IOException {
	pg= new ProductPage();	
	pg.backpack();
	TestUtils.takeScreenschot();
	}
	@Test
	public void backpicturetest() {
		pg.backppackicture();
	
		
	
		
		
	}
	
	@AfterTest
	public void driverClose() throws InterruptedException  {
		System.out.println("cheeking thread");
		Thread.sleep(2000);
		System.out.println("thread pass or fail");
		
		driver.close();
	}

}
