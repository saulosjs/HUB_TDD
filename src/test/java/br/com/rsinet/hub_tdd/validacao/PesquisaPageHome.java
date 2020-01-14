package br.com.rsinet.hub_tdd.validacao;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_tdd.leituraExcel.Constant;
import br.com.rsinet.hub_tdd.leituraExcel.ExcelUtils;
import br.com.rsinet.hub_tdd.pageObject.HomePage;

public class PesquisaPageHome {
	public WebDriver driver = new ChromeDriver();

	@Before
	public void site() throws Exception {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.advantageonlineshopping.com/#/");

		PageFactory.initElements(driver, HomePage.class);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha1");

	}

	@Test
	public void entrarConta() throws Exception {
		HomePage.clickLogin.click();
		HomePage.cadastroUsuario.sendKeys(ExcelUtils.getCellData(1, 0));
		HomePage.cadastroSenha.sendKeys(ExcelUtils.getCellData(1, 2));
		HomePage.botaoCadastro.click();
		Thread.sleep(10000);
		// driver.findElement(By.partialLinkText("LAPTOPS")).click();
		HomePage.mice.click();

	}

}
