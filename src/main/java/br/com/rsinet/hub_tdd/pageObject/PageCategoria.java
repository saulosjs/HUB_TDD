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

}
