package br.com.rsinet.hub_tdd.validacao;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import br.com.rsinet.hub_tdd.automacao.Pesquisar;
import br.com.rsinet.hub_tdd.leituraExcel.Constant;
import br.com.rsinet.hub_tdd.pageObject.HomePage;
import br.com.rsinet.hub_tdd.pageObject.PageCategoria;

public class PesquisaPageHome {
	public WebDriver driver = new ChromeDriver();
	public Actions acao = new Actions(driver);

	@Before
	public void site() throws Exception {
		driver.get(Constant.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void pesquisa() throws Exception {
		Pesquisar.pelaHome(driver);
	}

	@Test
	public void pesquisaProtudoFalha() throws InterruptedException {
		HomePage.clickImagemTablet(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		PageCategoria.preco(driver).click();
		WebElement menor = PageCategoria.localmenorPreco(driver);
		WebElement maior = PageCategoria.localMaiorPreco(driver);
		acao.dragAndDrop(menor, maior).perform();

		PageCategoria.display(driver).click();
		PageCategoria.selecionaDisplay(driver).click();

		System.out.println(PageCategoria.resutadoPesquisaPelaHome(driver).getText());
	}

	@After
	public void fim() {
//		RobotPrint.pegarTela();
		driver.close();
	}

}
