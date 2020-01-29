package br.com.rsinet.hub_tdd.automacao;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class RobotPrint {

	public static void pegarTela() {

		try {
			Robot robot = new Robot();
			BufferedImage tela = robot.createScreenCapture(new Rectangle(1000, 1000));
			ImageIO.write(tela, "jpg", new File(
					"C:\\\\Users\\\\saulo.silva\\\\Downloads\\\\hub_TDD_BDD-master\\\\hub_TDD_BDD-master\\\\src\\\\main\\\\java\\\\arquivos\\\\\\cadastroPass.jpg"));

		} catch (AWTException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
