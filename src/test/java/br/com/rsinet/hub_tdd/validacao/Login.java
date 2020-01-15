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

import br.com.rsinet.hub_tdd.automacao.RobotPrint;
import br.com.rsinet.hub_tdd.leituraExcel.Constant;
import br.com.rsinet.hub_tdd.leituraExcel.ExcelUtils;
import br.com.rsinet.hub_tdd.pageObject.HomePage;
import br.com.rsinet.hub_tdd.pageObject.PageNovoUsuario;
import br.com.rsinet.hub_tdd.utility.Log;

public class Login {
	public WebDriver driver = new ChromeDriver();

	@Before
	public void antes() throws Exception {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constant.URL);

		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, PageNovoUsuario.class);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha1");
		Log.info("Iniciou os elementos da pageObjet e o arquivo do excel");
	}

	@Test
	public void cadastroPass() throws Exception {
		HomePage.clickLogin.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement elemento = wait.until(ExpectedConditions.elementToBeClickable(HomePage.criarNovoUsuario));
		elemento.click();

		PageNovoUsuario.usuario.sendKeys(ExcelUtils.getCellData(1, 0));
		PageNovoUsuario.email.sendKeys(ExcelUtils.getCellData(1, 1));
		PageNovoUsuario.senha.sendKeys(ExcelUtils.getCellData(1, 2));
		PageNovoUsuario.confirmar.sendKeys(ExcelUtils.getCellData(1, 3));
		PageNovoUsuario.nome.sendKeys(ExcelUtils.getCellData(1, 4));
		PageNovoUsuario.sobreNome.sendKeys(ExcelUtils.getCellData(1, 5));
		PageNovoUsuario.telefone.sendKeys(ExcelUtils.getCellData(1, 6));
		PageNovoUsuario.pais.sendKeys(ExcelUtils.getCellData(1, 7));
		PageNovoUsuario.cidade.sendKeys(ExcelUtils.getCellData(1, 8));
		PageNovoUsuario.endereco.sendKeys(ExcelUtils.getCellData(1, 9));
		PageNovoUsuario.estado.sendKeys(ExcelUtils.getCellData(1, 10));
		PageNovoUsuario.postal.sendKeys(ExcelUtils.getCellData(1, 11));
		PageNovoUsuario.aceita.click();
		PageNovoUsuario.registrar.click();
		Log.info("Cadastro feito com sucesso");
	}

	@After
	public void fim() {
		RobotPrint.pegarTela();
		driver.close();
	}

}
