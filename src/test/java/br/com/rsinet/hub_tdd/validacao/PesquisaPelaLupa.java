package br.com.rsinet.hub_tdd.validacao;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.automacao.RobotPrint;
import br.com.rsinet.hub_tdd.leituraExcel.Constant;
import br.com.rsinet.hub_tdd.leituraExcel.ExcelUtils;
import br.com.rsinet.hub_tdd.pageObject.HomePage;

public class PesquisaPelaLupa {
	public WebDriver driver = new ChromeDriver();
	public WebDriverWait wait = new WebDriverWait(driver, 500);

	@Before
	public void antes() throws Exception {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constant.URL);

		PageFactory.initElements(driver, HomePage.class);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha2");
	}

	@Test
	public void pesquisa() throws Exception {

		HomePage.lupa.click();
		HomePage.lupa2.sendKeys(ExcelUtils.getCellData(1, 0));
		HomePage.verTudo.click();
		// Thread.sleep(5000);
		wait.ignoring(NoSuchElementException.class, ElementClickInterceptedException.class);
		HomePage.produto7.click();

	}

	@After
	public void fim() {
		RobotPrint.pegarTela();
		driver.close();
	}
}
