package com.oscommercec.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OSCommerceBase {
	
public WebDriver driver;

public void launcBrowser() {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://demo.oscommerce.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS)	;

}



public void closebrowser() {
driver.close();	
driver.quit();
}

}
