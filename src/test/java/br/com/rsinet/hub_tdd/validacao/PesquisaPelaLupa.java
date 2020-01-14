package br.com.rsinet.hub_tdd.validacao;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_tdd.leituraExcel.Constant;
import br.com.rsinet.hub_tdd.leituraExcel.ExcelUtils;
import br.com.rsinet.hub_tdd.pageObject.HomePage;

public class PesquisaPelaLupa {
	public WebDriver driver = new ChromeDriver();
	Actions acao = new Actions(driver);

	@Before
	public void antes() throws Exception {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.advantageonlineshopping.com/#/");

		PageFactory.initElements(driver, HomePage.class);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData2, "Planilha1");
	}

	@Test
	public void pesquisa() throws Exception {

		HomePage.lupa.click();
		HomePage.lupa2.sendKeys(ExcelUtils.getCellData(1, 0));
		Thread.sleep(6000);

		// acao.click(HomePage.hp17).build().perform();
		HomePage.hp17.click();

	}
}
