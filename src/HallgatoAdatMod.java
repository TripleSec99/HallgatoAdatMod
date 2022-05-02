import java.util.Scanner;

public class HallgatoAdatMod {

	public static void main(String[] args) {

		String nev = "Kiss István";
		String szültésiDátum = "1999-01-01";
		int megszerzettKreditek = 60;
		double átlag = 4.45;

		int javaTantargy = 5;

		megszerzettKreditek += javaTantargy;

		kiír(nev, szültésiDátum, megszerzettKreditek, átlag);

		Scanner scanner = new Scanner(System.in);
		System.out.println("\nHallgató adatainak módosítása:\n");
		System.out.println("Születési dátum: ");
		szültésiDátum = scanner.nextLine();
		System.out.println("Megszerzett kreditek: ");
		String tmp = scanner.nextLine();
		megszerzettKreditek = Integer.parseInt(tmp);
		System.out.println("Átlag: ");
		tmp = scanner.nextLine();
		átlag = Double.parseDouble(tmp);
		System.out.println("Módosítás után:");

		kiír(nev, szültésiDátum, megszerzettKreditek, átlag);

	}

	static void kiír(String név, String születésiDátum, int megszerzettKreditek, double átlag) {

		System.out.println("\nHallgató adatai:\n");
		System.out.println("Hallgató neve: " + név);
		System.out.println("Szülétési dátum: " + születésiDátum);
		System.out.println("Tanulmányi átlag: " + átlag);
		System.out.println("Megszerzett kreditek száma: " + megszerzettKreditek);

		if (átlag < 0 || átlag > 5) {
			System.out.println("Hibás átlag!");
		} else {
			String minősítés = "Oklevél minősítése: ";
			if (átlag > 2 && átlag < 2.5) {
				minősítés += "elégséges";
			} else if (átlag >= 2.5 && átlag < 3.5) {
				minősítés += "közepes";
			} else if (átlag >= 3.5 && átlag < 4.5) {
				minősítés += "jó";
			} else if (átlag >= 4.5 && átlag < 4.8) {
				minősítés += "jeles";
			} else if (átlag >= 4.8 && átlag < 5) {
				minősítés += "kiváló";
			} else {
				minősítés += "elégtelen";
			}
			System.out.println(minősítés);
		}

	}

}
