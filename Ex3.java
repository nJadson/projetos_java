import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int PrimeiroNumero, SegundoNumero, Soma;

		System.out.println("Digite o Primeiro N�mero: ");
		PrimeiroNumero = input.nextInt();

		System.out.println("Digite o Segundo N�mero: ");
		SegundoNumero = input.nextInt();

		input.close();

		if (PrimeiroNumero < 0 && SegundoNumero < 0 || PrimeiroNumero > 0 && SegundoNumero > 0) {
			Soma = PrimeiroNumero + SegundoNumero;
			System.out.println("A Somade " + PrimeiroNumero + " com " + SegundoNumero + " � = " + Soma);
		} else {
			System.out.println("Dados de Entrada s�o Inv�lidos");
		}
	}
}
