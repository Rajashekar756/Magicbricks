package magicbricks_step_definitions;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import magicbricks_runner.Pagefactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Vastuservices {
	
	private WebDriver driver;
	private Pagefactory login;
	XSSFWorkbook wb;
	XSSFSheet sh;

	@Before
	public void openBrowser() throws Exception {
		// launching web browser....
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login = new Pagefactory(driver);
		driver.manage().window().maximize();

		login = PageFactory.initElements(driver, Pagefactory.class);

		// reading file from excel....

		FileInputStream fread = new FileInputStream("C:\\Users\\Rajashekar\\Desktop\\Sprint 2\\0707\\MagicBricks.xlsx");
		wb = new XSSFWorkbook(fread);

		/*
		 * ExcelUtils.setExcelFile(
		 * "D:\\Sprint2project\\com.1st_jul_sprint2_magicbricksworks\\Excell_sheet\\MagicBricks.xlsx",
		 * "TestData"); String Username = ExcelUtils.getCellData(1, 1); String Password
		 * = ExcelUtils.getCellData(1, 2); System.out.println(Password);
		 */
	} // using pagefactory file as reference....


	
	
	@Given("user is on home page")
	public void user_is_on_home_page() {

		System.out.println("user is on login page");
		driver.navigate().to("https://accounts.magicbricks.com/userauth/login");
		sh=wb.getSheet("TestData");
		
		login.setUname(sh.getRow(1).getCell(0).getStringCellValue());
		
		login.clickNext();
		
		login.setPassword(sh.getRow(1).getCell(1).getStringCellValue());
		
		login.clickLogIn();
		
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		
	}

	/*
	 * @When("I click on the post free property ad") public void
	 * i_click_on_the_post_free_property_ad() {
	 * 
	 * }
	 */
	@When("I Click on the sell button")
	public void i_Click_on_the_sell_button() {
		driver.findElement(By.xpath("//a[text()='Sell']")).click();	

	}

	@When("Click on the vastu services.")
	public void click_on_the_vastu_services() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Click on to add to my ordres.")
	public void click_on_to_add_to_my_ordres() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Click on go to cart.")
	public void click_on_go_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Click on payment.")
	public void click_on_payment() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}



}
