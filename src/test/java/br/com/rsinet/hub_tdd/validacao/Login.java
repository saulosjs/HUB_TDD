package br.com.rsinet.hub_tdd.validacao;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.automacao.Cadastro;
import br.com.rsinet.hub_tdd.automacao.RobotPrint;
import br.com.rsinet.hub_tdd.leituraExcel.Constant;
import br.com.rsinet.hub_tdd.leituraExcel.ExcelUtils;
import br.com.rsinet.hub_tdd.pageObject.HomePage;
import br.com.rsinet.hub_tdd.pageObject.PageNovoUsuario;

public class Login {
	public WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	public String texto = "";
	public String expectativa = "";
	public String nomePrint = "cadastro.jpg";

	@Before
	public void antes() throws Exception {
		driver.get(Constant.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, PageNovoUsuario.class);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planelha1");

	}

	@Test
	public void cadastroPass() throws Exception {
		expectativa = driver.getCurrentUrl();
		HomePage.clickLogin(driver).click();
		WebElement element = driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		Cadastro.preencherCadastroPass(driver);
		wait.until(ExpectedConditions.invisibilityOfAllElements(HomePage.txtUsuarioLogado(driver)));

		texto = driver.getCurrentUrl();
		Assert.assertEquals(expectativa, texto);

	}

	@Test
	public void cadastroFall() throws Exception {
		expectativa = ExcelUtils.getCellData(2, 2);
		HomePage.clickLogin(driver).click();
		WebElement element = driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		Cadastro.preencherCadastroFall(driver);
		texto = ExcelUtils.getCellData(2, 3);
		// wait.until(ExpectedConditions.invisibilityOfAllElements(PageNovoUsuario.txt_falhou(driver)));
		String erro = PageNovoUsuario.txt_falhou(driver).getText();
		ExcelUtils.setCellData(erro, 2, 12);
		Assert.assertNotSame(expectativa, texto);
		nomePrint = "cadastroFalha.jpg";
	}

	@After
	public void fim() {
		 RobotPrint.pegarTela(nomePrint);
		 driver.close();
	}

}
