import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int PrimeiroNumero, SegundoNumero, Soma;

		System.out.println("Digite o Primeiro Número: ");
		PrimeiroNumero = input.nextInt();

		System.out.println("Digite o Segundo Número: ");
		SegundoNumero = input.nextInt();

		input.close();

		Soma = PrimeiroNumero + SegundoNumero;

		System.out.println("A Somade " + PrimeiroNumero + " com " + SegundoNumero + " é = " + Soma);
	}
}
