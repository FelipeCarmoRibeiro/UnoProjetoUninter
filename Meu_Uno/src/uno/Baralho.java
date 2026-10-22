package uno;

import java.util.ArrayList;
import java.util.List;

public class Baralho {
	
	private List<Cartas> cartas = new ArrayList<>();

	public Baralho() {
		String [] cores = {"Vermelho", "Azul", "Verde", "Amarelo"};
		
		for(String cor : cores) {
			cartas.add(new Cartas(cor, "0"));
			
			for(int n = 1; n <=9; n++) {
				cartas.add(new Cartas(cor, String.valueOf(n)));
				cartas.add(new Cartas(cor, String.valueOf(n)));
			}
		}
		
		
	}
	public int QuantidadeBaralho() {
		return cartas.size();
	}
}

