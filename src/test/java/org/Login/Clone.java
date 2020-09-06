package org.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clone {
	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Public\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
	}
}
