
public class ExercicioQuatro {
	public static void main(String[] args) {
		int numero = 65;
		if (numero != 15 && numero > 0 && (numero % 2 == 0 || numero % 3 == 0) ) {
			System.out.println("Esse é um número da sorte! Parabéns");
		}
		else {
			System.out.println("Infelizmente esse não é um número da sorte :(");
		}
	}
}
