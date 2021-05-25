package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Metodo implements IMetodo {

	@Override
	public void readFile(String path, String nome) throws IOException {
		File arq = new File(path, nome);
		if(arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while(linha !=null) {
				String dados[] = new String[4];
				dados = linha.split(",");
				String fileira = "";
				if(dados[2].equalsIgnoreCase("Fruits")) {
					for(int i = 0; i<4; i++) {
						if(!(i == 2)) {
							fileira = fileira + dados[i] + "\t";
						}					
					}
				}
				System.out.println(fileira);
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		} else {
			throw new IOException("Arquivo inválido");
		}
		
	}


}
