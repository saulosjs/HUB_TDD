package br.com.rsinet.hub_tdd.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.rsinet.hub_tdd.leituraExcel.Constant;
import br.com.rsinet.hub_tdd.leituraExcel.ExcelUtils;

public class PageCategoria {
	private static WebElement elemento = null;

	public static WebElement clickProduto(WebDriver driver) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha3");
		return elemento = driver.findElement(By.linkText(ExcelUtils.getCellData(10, 2)));
	}

	public static WebElement clickProtudoPelaLupa(WebDriver driver) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha2");
		return elemento = driver.findElement(By.linkText(ExcelUtils.getCellData(1, 1)));
	}

	public static WebElement preco(WebDriver driver) {
		return elemento = driver.findElement(By.id("accordionPrice"));
	}

	public static WebElement display(WebDriver driver) {
		return elemento = driver.findElement(By.id("accordionAttrib0"));
	}

	public static WebElement selecionaDisplay(WebDriver driver) {
		return elemento = driver.findElement(By.id("display_0"));

	}

	public static WebElement localMaiorPreco(WebDriver driver) {
		return elemento = driver.findElement(By.xpath("//*[@id=\"slider\"]/div/div[2]/div"));
	}

	public static WebElement localmenorPreco(WebDriver driver) {
		return elemento = driver.findElement(By.xpath("//*[@id=\"slider\"]/div/div[1]/div"));
	}

	public static WebElement resutadoPesquisaPelaHome(WebDriver driver) {
		return elemento = driver
				.findElement(By.xpath("/html/body/div[3]/section/article/div[3]/div/div/div[3]/label/span"));
	}
}
