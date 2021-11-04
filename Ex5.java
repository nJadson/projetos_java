import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double peso;
		String nome;
		String categoria;

		System.out.println("Digite o seu nome: ");
		nome = input.nextLine();

		System.out.println("Digite o seu peso: ");
		peso = input.nextDouble();

		input.close();

		if (peso < 65) {

			categoria = "Pena";

		} else if (peso < 72) {

			categoria = "Leve";

		} else if (peso < 79) {

			categoria = "Ligeiro";

		} else if (peso < 86) {

			categoria = "Meio médio";

		} else if (peso < 93) {

			categoria = "Médio";

		} else if (peso < 100) {

			categoria = "Meio pesado";

		} else {

			categoria = "Pesado";

		}

		System.out.println("O lutador " + nome + " pesa " + peso + " kg e se enquadra na categoria " + categoria);

	}
}