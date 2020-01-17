package br.com.rsinet.hub_tdd.validacao;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hub_tdd.automacao.Pesquisar;
import br.com.rsinet.hub_tdd.leituraExcel.Constant;

public class PesquisaPageHome {
	public WebDriver driver = new ChromeDriver();

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

	@After
	public void fim() {
//		RobotPrint.pegarTela();
		driver.close();
	}

}
