import java.util.Scanner;

public class text4 {
	public static void main(String[] args) {
	//	kuruyemi��i 12 Kg lebleyi 3.5 tl %50
	//25 kg f�nd�k 15.7 tl %40
	//40 kg badem 22 tl %60
	// kira 500 
		Scanner scanner = new Scanner(System.in);
		System.out.println("ALINAN LEBLEB� :");
		double lebal = scanner.nextDouble();
		lebal = lebal * 3.5;
		double lebsat = lebal * 1.5;
		
		System.out.println("ALINAN FINDIK :");
		double findikal = scanner.nextDouble();
		findikal = 25 * 15.7;
		double findiksat = findikal * 1.4 ;
		
		System.out.println("ALINAN BADEM :");
		double badal = scanner.nextDouble();
		badal = 40 * 22;
		double badsat = badal* 1.6;
		
		double satis = (lebsat + findiksat + badsat);
		double alis = (lebal + findikal + badal);
		double kar = (satis - alis);
		if (kar > 500) {
			System.out.println("Kiray� �deyebilirsiniz. YAPTI�INIZ ALI�: " + alis + " YAPTI�INIZ SATI�: " + satis + " KARINIZ: " + kar);
			
		}
		else {
			System.out.println("Kiray� �deyemezsiniz.");
		}
	}
}
