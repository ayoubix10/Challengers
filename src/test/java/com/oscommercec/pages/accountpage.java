package com.oscommercec.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class accountpage {

	WebDriver driver;
	public accountpage(WebDriver driver) {
	this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
}
