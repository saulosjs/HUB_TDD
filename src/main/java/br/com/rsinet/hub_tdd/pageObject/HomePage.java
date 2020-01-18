package br.com.rsinet.hub_tdd.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.rsinet.hub_tdd.leituraExcel.Constant;
import br.com.rsinet.hub_tdd.leituraExcel.ExcelUtils;

public class HomePage {

	private static WebElement elemento = null;

	public static WebElement clickLogin(WebDriver driver) {
		return elemento = driver.findElement(By.id("menuUser"));
	}

	public static WebElement criarNovoUsuario(WebDriver driver) {
		return elemento = driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]"));
	}

	public static WebElement lupa(WebDriver driver) {
		return elemento = driver.findElement(By.id("menuSearch"));
	}

	public static WebElement clickNoCampoDoProduto(WebDriver driver) throws Exception {
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

	public static WebElement txtUsuarioLogado(WebDriver driver) {
		return elemento = driver.findElement(By.xpath("//*[@id=\"menuUserLink\"]/span"));
	}

	public static WebElement clickImagemTablet(WebDriver driver) {
		return elemento = driver.findElement(By.id("tabletsImg"));
	}

}