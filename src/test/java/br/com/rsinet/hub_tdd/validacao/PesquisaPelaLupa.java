package br.com.rsinet.hub_tdd.validacao;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.automacao.Pesquisar;
import br.com.rsinet.hub_tdd.automacao.RobotPrint;
import br.com.rsinet.hub_tdd.leituraExcel.Constant;

public class PesquisaPelaLupa {
	public WebDriver driver = new ChromeDriver();
	public WebDriverWait wait = new WebDriverWait(driver, 10);
	private int pos;
	String expectativa;
	String atual;
	String nomePrint = "PesquisaLupa";

	@Before
	public void antes() throws Exception {
		driver.get(Constant.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void pesquisa() throws Exception {
		expectativa = "http://www.advantageonlineshopping.com/#/product/8?viewAll=laptops";
		pos = 1;
		Pesquisar.pelaLupa(driver, pos);
		atual = driver.getCurrentUrl();
		System.out.println(atual);
		Assert.assertEquals(expectativa, atual);
	}

	@Test
	public void pesquisaFall() throws Exception {
		expectativa = "http://www.advantageonlineshopping.com/#/search/?viewAll=apple";
		pos = 7;
		Pesquisar.pelaLupa(driver, pos);
		Thread.sleep(3000);
		atual = driver.getCurrentUrl();
		nomePrint = "pesquisaLupaFalha";
		Assert.assertEquals(expectativa, atual);

	}

	@After
	public void fim() {
		 RobotPrint.pegarTela(nomePrint);
		driver.close();
	}
}
