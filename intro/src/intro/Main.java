package intro;

public class Main {

	public static void main(String[] args) {

//		isPrime();
//		isVowelOrConsonant();
//		isPerfectNumber();
//		isFriendlyNumber();
//		isNumberExist();
		
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
	
	static void isPerfectNumber() {
		int number = 5;
		int total=0;
		
		for(int i=1;i<number;i++) {
			if(number%i==0) {
			total=total+i;	
			}
		}
		if(total==number) {
			System.out.println("Mükemmel sayıdır.");
		}else {
			System.out.println("Mükemmel sayı değildir.");
		}
	}
	
	static void isFriendlyNumber() {
		int sayi1=220;
		int sayi2=284;
		int toplam1=0;
		int toplam2=0;
		
		for(int i=0;i<sayi1;i++) {
			if(sayi1%i==0) {
				toplam1=toplam1+i;
			}
		}
		
		for(int i=0;i<sayi2;i++) {
			if(sayi2%i==0) {
				toplam2=toplam2+i;
			}
		}
		
		if(sayi1==toplam2 && sayi2==toplam1) {
			System.out.println("Bu iki sayı arkadaştır.");
		}
	}
	
	static void isNumberExist() {
		int[]sayilar=new int[] {1,2,5,7,9,0};
		int aranacak=5;
		boolean varMi=false;
		
		for(int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		
		if(varMi) {
			System.out.println("Sayı mevcuttur.");
		}else {
			System.out.println("Sayı mevcut değildir.");
		}
	}
}
