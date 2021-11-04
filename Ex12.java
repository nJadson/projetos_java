import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Ex12 {

	public static void main(String[] args) {
		int n, i, x;

		Random aleatorio = new Random();
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);

		do {
			System.out.print("Digite um valor para N: ");
			n = input.nextInt();
		} while (n <= 0 || n > 50);

		for (i = 0; i < n; i++) {
			x = aleatorio.nextInt(51);
			vetor.add(x);
		}

		System.out.println("Valores gerados: ");
		for (i = 0; i < n; i++) {
			System.out.print(vetor.get(i) + "   ");
		}

		System.out.println("\n\nPesquisa um valorer para remover:");
		x = input.nextInt();
		while (x != 0) {
				System.out.print("\nValor encontrado e será excluído.");
				for (i = 0; i < vetor.size(); i++) {
					if (vetor.get(i) == x) {
						vetor.remove(i);
						i--;
					}
				}
				System.out.println("\n\nNovo vetor:  ");
				for (i = 0; i < vetor.size(); i++) {
					System.out.print(vetor.get(i) + "   ");
				}
					System.out.println("\n\nTamanho do vetor = " + vetor.size());
					System.out.print("\nDigite um Número: ");
					x = input.nextInt();
		}
		input.close();
	}	
}