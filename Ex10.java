import java.util.Scanner;
import java.util.ArrayList;

public class Ex10 {

	public static void main(String[] args) {
		int n, i;
		double x;

		ArrayList<Double> a = new ArrayList<Double>();
		ArrayList<Double> neg = new ArrayList<Double>();
		ArrayList<Double> pos = new ArrayList<Double>();

		Scanner input = new Scanner(System.in);

		do {
			System.out.print("Digite um valor para N: ");
			n = input.nextInt();
		} while (n <= 0 || n > 50);

		for (i = 0; i < n; i++) {
			x = input.nextDouble();
			a.add(x);
			if (a.get(i) >= 0)
				pos.add(a.get(i));
			else
				neg.add(a.get(i));
		}
		input.close();

		System.out.println("Valores digitados são: ");
		for (i = 0; i < n; i++) {
			System.out.print("[" + i + "]: " + a.get(i) + "   ");

		}

		System.out.println("\nPositivos");
		for (i = 0; i < pos.size(); i++) {
			System.out.print("[" + i + "]: " + pos.get(i) + "   ");
		}

		System.out.println("\nNegativos");
		for (i = 0; i < neg.size(); i++) {
			System.out.print("[" + i + "]: " + neg.get(i) + "   ");
		}
	}

}
