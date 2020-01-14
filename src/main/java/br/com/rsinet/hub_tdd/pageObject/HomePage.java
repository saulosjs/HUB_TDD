package br.com.rsinet.hub_tdd.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//
public class HomePage {

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

	@FindBy(how = How.XPATH, using = "//*[@id=\"menuSearch\"]")
	public static WebElement lupa;

	@FindBy(how = How.ID, using = "autoComplete")
	public static WebElement lupa2;

	@FindBy(how = How.XPATH, using = "//*[@id=\"output\"]/div/div[2]/a[2]")
	public static WebElement hp17;

	@FindBy(how = How.ID, using = "miceImg")
	public static WebElement mice;

}