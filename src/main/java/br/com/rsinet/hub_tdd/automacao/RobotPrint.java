package br.com.rsinet.hub_tdd.automacao;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class RobotPrint {

	public static void pegarTela(String nomePrint) {

		try {
			Robot robot = new Robot();
			BufferedImage tela = robot.createScreenCapture(new Rectangle(1000, 1200));
			ImageIO.write(tela, "jpg", new File("target/" + nomePrint));

		} catch (AWTException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
