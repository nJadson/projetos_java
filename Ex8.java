import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {

		int x, aux = 0, min = 0, max = 0;
		int Soma = 0, Numeros = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número mínimo: ");
		min = input.nextInt();

		System.out.println("Digite um número máximo: ");
		max = input.nextInt();

		if (min > max) {
			aux = min;
			min = max;
			max = aux;
			aux = 0;
		}

		System.out.println("Digite um número inteiro entre " + min + " e " + max + " :");
		x = input.nextInt();

		while (x > 0) {

			if (x >= min && x <= max) {
				Soma = Soma + x;
				Numeros++;

			} else {

				System.out.println("Valor" + x + " fora do intervalo [Min, Max] ignorado na totalização.");
			}
			System.out.println("Digite um número: ");
			x = input.nextInt();
		}
		input.close();

		if (Numeros > 0) {

			System.out.println("Valor mínimo: " + min);
			System.out.println("Valor Máx: " + max);
			System.out.println("Quantidade de números digitados: " + Numeros);
			System.out.println("Soma dos números digitaos: " + Soma);

		} else {
			System.out.println("Nao foram fornecidos dados\nFim do Programa");
		}
	}
}