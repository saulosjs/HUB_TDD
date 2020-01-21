package br.com.rsinet.hub_tdd.validacao;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
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
	String expectativa;
	String atual;

	@Before
	public void site() throws Exception {
		driver.get(Constant.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void pesquisa() throws Exception {
		expectativa = "http://www.advantageonlineshopping.com/#/product/31";
		Pesquisar.pelaHome(driver);
		atual = driver.getCurrentUrl();
		Assert.assertEquals(expectativa, atual);

	}

	@Test
	public void pesquisaProtudoFalha() throws InterruptedException {
		expectativa = "No results";
		HomePage.clickImagemTablet(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		PageCategoria.preco(driver).click();
		WebElement menor = PageCategoria.localmenorPreco(driver);
		WebElement maior = PageCategoria.localMaiorPreco(driver);
		acao.dragAndDrop(menor, maior).perform();

		PageCategoria.display(driver).click();
		PageCategoria.selecionaDisplay(driver).click();
		atual = driver.findElement(By.xpath("/html/body/div[3]/section/article/div[3]/div/div/div[3]/label/span"))
				.getText();
		System.out.println(atual);
		Assert.assertEquals(expectativa, atual);

	}

	@After
	public void fim() {
//		RobotPrint.pegarTela();
		driver.close();
	}

}
