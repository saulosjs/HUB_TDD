package br.com.rsinet.hub_tdd.validacao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.leituraExcel.Constant;
import br.com.rsinet.hub_tdd.leituraExcel.ExcelUtils;
import br.com.rsinet.hub_tdd.pageObject.HomePage;

public class PesquisaPelaLupa {
	public WebDriver driver = new ChromeDriver();
	public WebDriverWait wait = new WebDriverWait(driver, 10);

	@Before
	public void antes() throws Exception {
		driver.manage().window().maximize();

		driver.get(Constant.URL);

		PageFactory.initElements(driver, HomePage.class);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha2");
	}

	@Test
	public void pesquisa() throws Exception {

		HomePage.lupa.click();
		HomePage.txtLupa(driver).sendKeys(ExcelUtils.getCellData(1, 0));
		HomePage.verTudo.click();
		// Thread.sleep(10000);
//		wait.ignoring(NoSuchElementException.class, ElementClickInterceptedException.class);
		// PageCategoria.clickProtudoPelaLupa(driver).click();

	}

	@After
	public void fim() {
		// RobotPrint.pegarTela();
//		driver.close();
	}
}
