package uno;
import java.util.Scanner;
import java.util.Random;

public class Jogo {
	
	public static void InicioJogo(String jogador) {
	Scanner entrada = new Scanner(System.in);
		
			System.out.println("Bem vindo ao Uno");
			System.out.println("Digite (1) para iniciar o jogo");
			System.out.println("------------------------------------");
			System.out.println("Digite (2) para sair");
			int opcao = entrada.nextInt();
			
			
			if(opcao == 1 ) {
				System.out.println("Iniciando o jogo...");
			}else {
				System.out.println("Saindo do jogo...");
			}
			
			
			//public static void Embaralhar() {}
			
		}
	}
	


