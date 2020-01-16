package br.com.rsinet.hub_tdd.automacao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_tdd.leituraExcel.Constant;
import br.com.rsinet.hub_tdd.leituraExcel.ExcelUtils;
import br.com.rsinet.hub_tdd.pageObject.HomePage;
import br.com.rsinet.hub_tdd.pageObject.PageNovoUsuario;

public class Cadastro {
	public static void preencherCadastroPass(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, PageNovoUsuario.class);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha1");
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

	}

	public static void preencherCadastroFall(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, PageNovoUsuario.class);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha1");
		PageNovoUsuario.usuario.sendKeys(ExcelUtils.getCellData(2, 0));
		PageNovoUsuario.email.sendKeys(ExcelUtils.getCellData(2, 1));
		PageNovoUsuario.senha.sendKeys(ExcelUtils.getCellData(2, 2));
		PageNovoUsuario.confirmar.sendKeys(ExcelUtils.getCellData(2, 3));
		PageNovoUsuario.nome.sendKeys(ExcelUtils.getCellData(2, 4));
		PageNovoUsuario.sobreNome.sendKeys(ExcelUtils.getCellData(2, 5));
		PageNovoUsuario.telefone.sendKeys(ExcelUtils.getCellData(2, 6));
		PageNovoUsuario.pais.sendKeys(ExcelUtils.getCellData(2, 7));
		PageNovoUsuario.cidade.sendKeys(ExcelUtils.getCellData(2, 8));
		PageNovoUsuario.endereco.sendKeys(ExcelUtils.getCellData(2, 9));
		PageNovoUsuario.estado.sendKeys(ExcelUtils.getCellData(2, 10));
		PageNovoUsuario.postal.sendKeys(ExcelUtils.getCellData(2, 11));
		PageNovoUsuario.aceita.click();
		PageNovoUsuario.registrar.click();

	}
}