import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int X;

		System.out.println("Digite um n�mero: ");
		X = input.nextInt();

		while (X != 0) {
			if (X > 0) {
				System.out.println("O n�mero digitado " + X + " � um valor Positivo");
			} else {
				System.out.println("O n�mero digitado " + X + " � um valor negativo");
			}
			System.out.print("Digite um novo n�mero: ");
			X = input.nextInt();
		}
		input.close();
		System.out.println("\n\nEncontrado 0, programa ser� finalizado");
	}
}