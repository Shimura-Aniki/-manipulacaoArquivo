package view;

import java.io.IOException;

import controller.IMetodo;
import controller.Metodo;

public class Principal {

	public static void main(String[] args) {
		
		IMetodo arqCont = new Metodo();
		String path = "C:\\TEMP";
		String nome = "generic_food.csv"; 

		try {
			arqCont.readFile(path, nome);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
