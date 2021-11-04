import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {

		int aux, maior, menor;
		int Soma = 0, Numeros = 0;
		double media;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número: ");
		aux = input.nextInt();

		maior = aux;
		menor = aux;

		while (aux > 0) {

			Soma = Soma + aux;
			Numeros++;

			if (aux > maior) {
				maior = aux;
			}

			if (aux < menor) {
				menor = aux;
			}
			System.out.println("Digite um número: ");
			aux = input.nextInt();
		}
		input.close();

		media = Soma * 1.0 / Numeros;

		if (Numeros > 0) {
			System.out.println("Maior valor informado foi " + maior);
			System.out.println("Menor valor informado foi " + menor);
			System.out.println("Soma dos valores informados foi igual a " + Soma);
			System.out.println("A quantidade de números informados foram de " + Numeros);
			System.out.println("Media dos valores informado foi igual a " + media);
		}
		System.out.println("Nenhum número foi informado\nPrograma será finalizado");
	}
}