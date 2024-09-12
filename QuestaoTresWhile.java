package desafio.target.code;

public class QuestaoTresWhile {

	public static void main(String[] args) {
		int INDICE = 12;
		int SOMA = 0;
		int K = 1;
		
		while (K < INDICE) {
			K += 1;
			SOMA += K;
		}
		
		System.out.println("O valor de SOMA é: "+SOMA);
	}
}