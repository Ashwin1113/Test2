package org.seli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ashwin\\eclipse-workspace\\Selinium13\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement clickSign = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		clickSign.click();
		WebElement clickRegister = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		clickRegister.click();
		WebElement clickMail = driver.findElement(By.xpath("//body[@dat-programe='HomePage']"));
		Thread.sleep(3000);
		clickMail.click();
		clickMail.sendKeys("ashwin@gmail.com");

	}

}
