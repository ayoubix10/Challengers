package com.oscommercec.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
WebDriver driver;

public HomePage(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
}	


@FindBy (xpath="//input[@name='keywords']")
WebElement quickfind;

public void enterQuickFind() {
	quickfind.sendKeys("samsung");
}

@FindBy (xpath="//input[@title=' Quick Find ']")
WebElement searchButton;

public void clickQuickSearch() {
searchButton.click();	
}
}