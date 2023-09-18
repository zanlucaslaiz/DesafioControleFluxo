import java.util.Scanner;

import exception.ParametrosInvalidosException;


public class Contador {
	public static void main(String[] args) {
		try (Scanner terminal = new Scanner(System.in)) {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();
			
			try {
				contar(parametroUm, parametroDois);
			
			}catch (ParametrosInvalidosException e) {
				System.out.println("Erro: " + e.getMessage());
			}
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException();
			
		} else {
			int contagem = parametroDois - parametroUm;
			for(int i = 1; i<= contagem; ++i)
			System.out.println("Imprimindo a " + i + "ª interação: " + i);
			
		}
	
	
		
	}

	
}