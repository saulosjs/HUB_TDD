package br.com.rsinet.hub_tdd.automacao;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_tdd.leituraExcel.Constant;
import br.com.rsinet.hub_tdd.leituraExcel.ExcelUtils;
import br.com.rsinet.hub_tdd.pageObject.HomePage;
import br.com.rsinet.hub_tdd.pageObject.PageObjectMice;

public class Pesquisar {

	public static void pelaHome(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, PageObjectMice.class);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha3");

		HomePage.clickNoCampoDoProduto(driver).click();
		WebElement element = driver.findElement(By.linkText(ExcelUtils.getCellData(1, 2)));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

	public static void pelaLupa(WebDriver driver, int pos) {

		PageFactory.initElements(driver, HomePage.class);
		try {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha2");

			HomePage.lupa(driver).click();
			WebElement enter = HomePage.txtLupa(driver);
			enter.sendKeys(ExcelUtils.getCellData(pos, 0));
			enter.sendKeys(Keys.ENTER);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			WebElement element = driver.findElement(By.linkText(ExcelUtils.getCellData(1, pos)));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
