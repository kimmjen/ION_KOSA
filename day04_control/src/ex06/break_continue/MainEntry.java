package ex06.break_continue;

public class MainEntry {
	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			if (i == 7)
				continue;
			System.out.println(i);
		}

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				System.out.println(j);

				if (i == 7)
					break;

			}
			System.out.println();
		}

	}
}
