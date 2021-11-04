import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a, b, c;

		System.out.println("Digite o Primeiro lado: ");
		a = input.nextInt();

		System.out.println("Digite o Segundo lado: ");
		b = input.nextInt();

		System.out.println("Digite o Terceiro lado: ");
		c = input.nextInt();

		input.close();

		if (a < b + c && b < a + c && c < b + a) {
			if (a == b || b == c || c == a) {
				System.out.println("O triângulo é Equilátero");
			} else if (a == b || a == c) {
				System.out.println("O triângulo é Isóceles");
			} else {
				System.out.println("O triângulo é Escaleno");
			}
		} else {
			System.out.println("Não é triângulo");
		}
	}
}
