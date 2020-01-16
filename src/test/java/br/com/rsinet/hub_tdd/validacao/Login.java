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

import br.com.rsinet.hub_tdd.automacao.Cadastro;
import br.com.rsinet.hub_tdd.leituraExcel.Constant;
import br.com.rsinet.hub_tdd.pageObject.HomePage;
import br.com.rsinet.hub_tdd.pageObject.PageNovoUsuario;

public class Login {
	public WebDriver driver = new ChromeDriver();

	@Before
	public void antes() throws Exception {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constant.URL);

		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, PageNovoUsuario.class);

	}

	@Test
	public void cadastroPass() throws Exception {
		HomePage.clickLogin.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement elemento = wait.until(ExpectedConditions.elementToBeClickable(HomePage.criarNovoUsuario));
		elemento.click();
		Cadastro.preencherCadastroPass(driver);
	}

	@Test
	public void cadastroFall() throws Exception {
		HomePage.clickLogin.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement elemento = wait.until(ExpectedConditions.elementToBeClickable(HomePage.criarNovoUsuario));
		elemento.click();
		Cadastro.preencherCadastroFall(driver);

	}

	@After
	public void fim() {
		// RobotPrint.pegarTela();
		driver.close();
	}

}
