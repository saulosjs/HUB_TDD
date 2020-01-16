package br.com.rsinet.hub_tdd.validacao;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.leituraExcel.Constant;
import br.com.rsinet.hub_tdd.leituraExcel.ExcelUtils;
import br.com.rsinet.hub_tdd.pageObject.HomePage;
import br.com.rsinet.hub_tdd.pageObject.PageCategoria;
import br.com.rsinet.hub_tdd.pageObject.PageObjectMice;

public class PesquisaPageHome {
	public WebDriver driver = new ChromeDriver();

	@Before
	public void site() throws Exception {
		driver.get(Constant.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, PageObjectMice.class);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha3");

	}

	@Test
	public void pesquisa() throws Exception {
		HomePage.clickNoProduto(driver).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement elemento = wait.until(ExpectedConditions.elementToBeClickable(PageCategoria.clickProduto(driver)));
		elemento.click();
//		WebElement element = driver.findElement(By.id("17"));
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("arguments[0].click();", element);

		// Thread.sleep(5000);
//		PageCategoria.clickProduto(driver).click();
	}

	@After
	public void fim() {
//		RobotPrint.pegarTela();
		// driver.close();
	}

}
