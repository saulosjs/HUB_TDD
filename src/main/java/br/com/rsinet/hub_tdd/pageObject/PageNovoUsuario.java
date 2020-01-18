package br.com.rsinet.hub_tdd.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageNovoUsuario {
	private static WebElement elemento = null;

	public static WebElement usuario(WebDriver driver) {
		return elemento = driver.findElement(By.name("usernameRegisterPage"));
	}

	public static WebElement email(WebDriver driver) {
		return elemento = driver.findElement(By.name("emailRegisterPage"));
	}

	public static WebElement senha(WebDriver driver) {
		return elemento = driver.findElement(By.name("passwordRegisterPage"));
	}

	public static WebElement confirmar(WebDriver driver) {
		return elemento = driver.findElement(By.name("confirm_passwordRegisterPage"));
	}

	public static WebElement nome(WebDriver driver) {
		return elemento = driver.findElement(By.name("first_nameRegisterPage"));
	}

	public static WebElement sobreNome(WebDriver driver) {
		return elemento = driver.findElement(By.name("last_nameRegisterPage"));
	}

	public static WebElement telefone(WebDriver driver) {
		return elemento = driver.findElement(By.name("phone_numberRegisterPage"));
	}

	public static WebElement pais(WebDriver driver) {
		return elemento = driver.findElement(By.cssSelector(".sec-view div select"));
	}

	public static WebElement cidade(WebDriver driver) {
		return elemento = driver.findElement(By.name("cityRegisterPage"));
	}

	public static WebElement endereco(WebDriver driver) {
		return elemento = driver.findElement(By.name("addressRegisterPage"));
	}

	public static WebElement estado(WebDriver driver) {
		return elemento = driver.findElement(By.name("state_/_province_/_regionRegisterPage"));
	}

	public static WebElement postal(WebDriver driver) {
		return elemento = driver.findElement(By.name("postal_codeRegisterPage"));
	}

	public static WebElement aceita(WebDriver driver) {
		return elemento = driver.findElement(By.cssSelector(".sec-view div input[type=checkbox]"));
	}

	public static WebElement registrar(WebDriver driver) {
		return elemento = driver.findElement(By.id("register_btnundefined"));
	}

	public static WebElement txt_falhou(WebDriver driver) {
		return elemento = driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[1]/div/label"));
	}

}
