import java.util.Scanner;
import java.util.ArrayList;

public class Ex9 {
	public static void main(String[] args) {

		int x, i, aux = 0, min = 0, max = 0;
		int Soma = 0, Numeros = 0;
		ArrayList<Integer> vetor = new ArrayList<Integer>();

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um n?mero m?nimo: ");
		min = input.nextInt();

		System.out.println("Digite um n?mero m?ximo: ");
		max = input.nextInt();

		if (min > max) {
			aux = min;
			min = max;
			max = aux;
			aux = 0;
		}

		System.out.println("Digite um n?mero inteiro entre " + min + " e " + max + " :");
		x = input.nextInt();

		while (x > 0) {

			if (x >= min && x <= max) {
				vetor.add(x);
				Soma = Soma + x;
				Numeros++;

			} else {

				System.out.println("Valor" + x + " fora do intervalo [Min, Max] ignorado na totaliza??o.");
			}
			System.out.println("Digite um n?mero: ");
			x = input.nextInt();
		}
		input.close();

		if (Numeros > 0) {
			for (i = 0; i < Numeros; i++) {
				System.out.print("Numeros digitados foram: [" + i + "]: " + vetor.get(i) + "   ");
			}

			System.out.println("Valor m?nimo: " + min);
			System.out.println("Valor M?x: " + max);
			System.out.println("Quantidade de n?meros digitados: " + Numeros);
			System.out.println("Soma dos n?meros digitaos: " + Soma);

		} else {
			System.out.println("Nao foram fornecidos dados\nFim do Programa");
		}
	}
}