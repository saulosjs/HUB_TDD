package br.com.rsinet.hub_tdd.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageObjectMice {

	@FindBy(how = How.ID, using = "31")
	public static WebElement logitech502;

	@FindBy(how = How.ID, using = "29")
	public static WebElement hpUsb;

	@FindBy(how = How.ID, using = "28")
	public static WebElement hpZ3200;
	
}
