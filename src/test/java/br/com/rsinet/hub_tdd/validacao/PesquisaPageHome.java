package br.com.rsinet.hub_tdd.validacao;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.automacao.RobotPrint;
import br.com.rsinet.hub_tdd.leituraExcel.Constant;
import br.com.rsinet.hub_tdd.leituraExcel.ExcelUtils;
import br.com.rsinet.hub_tdd.pageObject.HomePage;
import br.com.rsinet.hub_tdd.pageObject.PageObjectMice;

public class PesquisaPageHome {
	public WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, 10);

	@Before
	public void site() throws Exception {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constant.URL);

		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, PageObjectMice.class);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha3");

	}

	@Test
	public void pesquisa() throws Exception {
		// WebElement elemento =
		// wait.until(ExpectedConditions.elementToBeClickable(HomePage.mice));
		// elemento.click();
		wait.ignoring(NoSuchElementException.class);
		driver.findElement(By.id(ExcelUtils.getCellData(1, 1))).click();

		// Thread.sleep(10000);

	}

	@After
	public void fim() {
		RobotPrint.pegarTela();
		// driver.close();
	}

}
