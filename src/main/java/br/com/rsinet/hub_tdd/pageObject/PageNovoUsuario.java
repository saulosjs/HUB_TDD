package br.com.rsinet.hub_tdd.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageNovoUsuario {

	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	public static WebElement usuario;

	@FindBy(how = How.NAME, using = "emailRegisterPage")
	public static WebElement email;

	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	public static WebElement senha;

	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	public static WebElement confirmar;

	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
	public static WebElement nome;

	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	public static WebElement sobreNome;

	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	public static WebElement telefone;

	@FindBy(how = How.CSS, using = ".sec-view div select")
	public static WebElement pais;

	@FindBy(how = How.NAME, using = "cityRegisterPage")
	public static WebElement cidade;

	@FindBy(how = How.NAME, using = "addressRegisterPage")
	public static WebElement endereco;

	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
	public static WebElement estado;

	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")
	public static WebElement postal;

	@FindBy(how = How.CSS, using = ".sec-view div input[type=checkbox]")
	public static WebElement aceita;

	@FindBy(how = How.ID, using = "register_btnundefined")
	public static WebElement registrar;

}
