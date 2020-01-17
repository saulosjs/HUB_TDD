package br.com.rsinet.hub_tdd.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import br.com.rsinet.hub_tdd.leituraExcel.Constant;
import br.com.rsinet.hub_tdd.leituraExcel.ExcelUtils;

public class HomePage {

	private static WebElement elemento = null;

	@FindBy(how = How.ID, using = "menuUser")
	public static WebElement clickLogin;

	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/a[2]")
	public static WebElement criarNovoUsuario;

	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/input")
	public static WebElement cadastroUsuario;

	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input")
	public static WebElement cadastroSenha;

	@FindBy(how = How.ID, using = "sign_in_btnundefined")
	public static WebElement botaoCadastro;

	@FindBy(how = How.ID, using = "menuSearch")
	public static WebElement lupa;

	@FindBy(how = How.ID, using = "miceImg")
	public static WebElement mice;

//	@FindBy(how = How.XPATH, using = "/html/body/header/nav/ul/li[4]/a/div/div[2]/div/div[2]/a[1]")
//	public static WebElement verTudo;

	@FindBy(how = How.XPATH, using = "/html/body/header/nav/ul/li[4]/a/div/div[1]/div/div/div")
	public static WebElement fecharLupa;

	public static WebElement clickNoProduto(WebDriver driver) throws Exception {
		return elemento = driver.findElement(By.id("miceImg"));
	}

	public static WebElement txtLupa(WebDriver driver) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha2");
		elemento = driver.findElement(By.id("autoComplete"));
		return elemento;
	}

	public static WebElement verTudo(WebDriver driver) {
		return elemento = driver.findElement(By.xpath("/html/body/header/nav/ul/li[4]/a/div/div[2]/div/div[2]/a[1]"));
	}

}