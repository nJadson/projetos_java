import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int PrimeiroNumero, SegundoNumero, Soma;

		System.out.println("Digite o Primeiro Número: ");
		PrimeiroNumero = input.nextInt();

		System.out.println("Digite o Segundo Número: ");
		SegundoNumero = input.nextInt();

		input.close();

		if (PrimeiroNumero >= 0 && SegundoNumero >= 0) {
			Soma = PrimeiroNumero + SegundoNumero;
			System.out.println("A Somade " + PrimeiroNumero + " com " + SegundoNumero + " é = " + Soma);
		} else {
			System.out.println("Dados de Entrada são Inválidos");
		}
	}
}
