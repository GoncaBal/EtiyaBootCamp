package intro;

public class Main {

	public static void main(String[] args) {

		// isPrime();
		isVowelOrConsonant();
	}

	static void isPrime() {
		for (int number = 2; number < 1000; number++) {
			boolean check = true;
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					check = false;
					break;
				}
			}
			if (check) {
				System.out.println(number);
			}
		}
	}

	static void isVowelOrConsonant() {
		char harf='E';
		
		switch(harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;
			default:
				System.out.println("İnce sesli harf");
		}
	}
}
