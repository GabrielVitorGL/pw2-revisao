
public class ExercicioQuatro {
	public static void main(String[] args) {
		int numero = 65;
		if (numero != 15 && numero > 0 && (numero % 2 == 0 || numero % 3 == 0) ) {
			System.out.println("Esse � um n�mero da sorte! Parab�ns");
		}
		else {
			System.out.println("Infelizmente esse n�o � um n�mero da sorte :(");
		}
	}
}
