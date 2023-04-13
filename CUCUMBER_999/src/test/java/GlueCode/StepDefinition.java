package GlueCode;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition 
{
WebDriver driver;
@Given("User launch chromebrowser")
public void user_launch_chromebrowser() {
    
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();    // driver=111222
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	driver.manage().window().maximize() ;	
	
	
}
@Then("User launch application URL{string}")
public void user_launch_application_url_https_opensource_demo_orangehrmlive_com_web_index_php_auth_login(String TestURL) {
    
	driver.get(TestURL);
	
	
}
@Given("User enters Username as {string} and Password as {string}")
public void user_enters_username_as_and_password_as(String UserName1, String PassWord1) {
    
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UserName1);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(PassWord1);
	driver.findElement(By.xpath("//button[@type='submit']")).click();

}
@Then("User creates Jobs record")
public void user_creates_jobs_record(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
    
   List<List<String>>Jobsdata=dataTable.cells();
   
   System.out.println("No.of rows:"+Jobsdata.size());
   
   for(int i=0;i<Jobsdata.size();i++) {
	
   //System.out.println(Jobsdata.get(i).get(0));
	   
	String JobName=Jobsdata.get(i).get(0);
	
	String JobDescription=Jobsdata.get(i).get(1);
	
	String JobNote=Jobsdata.get(i).get(2);
	
	System.out.println("_______________________");
	
	
	driver.findElement(By.xpath("//span[text()='Admin']")).click(); //Admin
	driver.findElement(By.xpath("//span[text()='Job ']")).click(); //Jobs
	driver.findElement(By.xpath("//a[text()='Job Titles']")).click(); //Job Titles
	driver.findElement(By.xpath("(//button[@type='button'])[2]")).click(); //Add button
	driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(JobName);
	driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys(JobDescription);
	driver.findElement(By.xpath("//textarea[@placeholder='Add note']")).sendKeys(JobNote);
	
	
	Thread.sleep(5000); //execution will be passed for 5 seconds
		
	driver.findElement(By.xpath("//button[@type='submit']")).click();  //Save

}
   }

@When("User logout")
public void user_logout() {
    
	
	driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
	driver.findElement(By.xpath("//a[text()='Logout']")).click();  

}




@Then("User close browser")
public void user_close_browser() {
	
	driver.close();
}


@Then("User creats Skills record")
public void user_creats_jobs_record(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	
    List<Map<String,String>>SkillsData=dataTable.asMaps(String.class,String.class);
	
    System.out.println("Number of rows:"+SkillsData.size());
    
    for(int i=0;i<SkillsData.size();i++) {
    	
    System.out.println(SkillsData.get(i).get("SkillName"));
    System.out.println(SkillsData.get(i).get("SkillDescription"));
    
    String SkillName=SkillsData.get(i).get("SkillName");
    String SkillDescription=SkillsData.get(i).get("SkillDescription");
    
    System.out.println("_____________________________");
    
    driver.findElement(By.xpath("//span[text()='Admin']")).click();
	driver.findElement(By.xpath("//span[text()='Qualifications ']")).click();
	driver.findElement(By.xpath("//a[text()='Skills']")).click();
	driver.findElement(By.xpath("//button[text()=' Add ']")).click();
	driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(SkillName);
	driver.findElement(By.xpath("//textarea[ @placeholder='Type description here']")).sendKeys(SkillDescription);
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[text()=' Save ']")).click();

}
	}

@Given("User launch chrome browser")
public void user_launch_chrome_browser() {
    
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();    // driver=111222
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	driver.manage().window().maximize() ;	
	
	
	
}





}

















    
