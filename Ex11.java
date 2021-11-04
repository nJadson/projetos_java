import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Ex11 {

	public static void main(String[] args) {
		int n, i, x;
		boolean fora;
		
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
			System.out.print(vetor.get(i) + ", ");
		}

		System.out.println("\n\nPesquisa um valorer:");
		x = input.nextInt();
		while (x != 0) {
			fora = true;
			for (i = 0; i < n; i++) {
				if (vetor.get(i) == x) {
					fora = false;
					System.out.println("     " + vetor.get(i) + " encontrado na posição " + i);
				}
			}
			if (fora)
				System.out.println("Valor não está no vetor");

			System.out.print("Digite um valor: ");
			x = input.nextInt();
		}

		input.close();
	}

}
